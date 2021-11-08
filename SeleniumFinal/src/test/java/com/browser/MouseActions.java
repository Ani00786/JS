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

public class MouseActions {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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
		/*
		 * driver.get("https://www.myntra.com/"); driver.manage().window().maximize();
		 * WebElement men = driver.findElement(By.xpath(
		 * "//a[@class='desktop-main'][normalize-space()='Men']")); Actions action = new
		 * Actions(driver); action.moveToElement(men).perform();
		 * driver.findElement(By.xpath("//a[normalize-space()='Formal Shirts']")).click(
		 * );
		 */

		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		WebElement mainslider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		int width=mainslider.getSize().width;		
		new Actions(driver).dragAndDropBy(slider, width/2, 0).perform();
		Thread.sleep(2000);
		new Actions(driver).dragAndDropBy(slider, -width/4, 0).perform();
		
					
	}

}
