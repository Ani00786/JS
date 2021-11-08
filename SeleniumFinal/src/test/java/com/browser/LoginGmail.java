package com.browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGmail {

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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			//WebElement anotherAccount=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[5]/div/div/div[2]"));
			//anotherAccount.click();
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ani.rahate1");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			
			}

}
