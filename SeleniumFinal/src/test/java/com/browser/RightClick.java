package com.browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		System.out.println("My browser is : " + browser);
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action=new Actions(driver);
		WebElement img=driver.findElement(By.xpath(".//p[2]/img"));
		action.contextClick(img).perform();
		action.moveToElement(driver.findElement(By.xpath("//td[@id='dm2m1i1tdA']"))).perform();;
		action.moveToElement(driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"))).perform();;
		driver.findElement(By.xpath("//td[@id='dm2m3i0tdT']")).click();

		
		
	}

}
