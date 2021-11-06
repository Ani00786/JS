package com.chrometests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestCaseIsStarting");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());
		driver1.close();
		System.out.println("End");

	}

}
