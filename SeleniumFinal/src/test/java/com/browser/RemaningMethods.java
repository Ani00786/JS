package com.browser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemaningMethods {

		public static String browser="Chrome";
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
			driver.get("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			
			WebElement ele= driver.findElement(By.id("searchLanguage"));
			Select select=new Select(ele);
			select.selectByValue("Italiano");
		}

}
