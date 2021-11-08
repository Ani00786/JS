package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

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
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(.//input[@type='text'][@name='name'])[1]")).sendKeys("Name- Ani");
		driver.findElement(By.xpath(".//input[@type='tel'][@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//input[@type='email'][@name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath(".//select[@name='country']")).sendKeys("United Kingdom");
		driver.findElement(By.xpath(".//input[@name='city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(.//input[@name='username'])[2]")).sendKeys("Test123");
		driver.findElement(By.xpath("(.//input[@name='password'])[2]")).sendKeys("Pass123");
		driver.findElement(By.xpath("(.//input[@type='submit'][@value='Submit'])[2]")).click();
		
			
	}

}
