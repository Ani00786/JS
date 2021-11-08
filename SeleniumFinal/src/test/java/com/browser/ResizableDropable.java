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

public class ResizableDropable {

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
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		new Actions(driver).dragAndDropBy(resize, 400,400).perform();	
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement droppable=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		new Actions(driver).dragAndDrop(draggable, droppable).perform();
		
		new Actions(driver).dragAndDropBy(draggable,400,400).perform();
		
		
		
	}

}
