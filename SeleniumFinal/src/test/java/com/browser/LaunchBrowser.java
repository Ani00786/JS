package com.browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

		public static String browser;
		public static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter browser name:");
			browser = sn.nextLine();
	        System.out.println(browser);
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
			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
			driver.close();
			sn.close();
		}

}
