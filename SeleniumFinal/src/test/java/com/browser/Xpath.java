package com.browser;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

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
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("searchLanguage"));

		// wait.until(ExpectedConditions.elementToBeClickable(ele));
		Select select = new Select(ele);
		select.selectByVisibleText("Italiano");
		select.selectByValue("hi");
		System.out.println(select.getOptions());
		List<WebElement> list = driver.findElements(By.tagName("option"));
		System.out.println("Size of list :" + list.size());
		System.out.println(list.get(10).getText());

		for (WebElement a : list) {
			System.out.println(a.getText());
		}

		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		System.out.println("Size of list :" + list1.size());
		System.out.println(list1.get(10).getText());

		for (WebElement a : list1) {
			System.out.println(a.getText());
			System.out.println(a.getAttribute("href"));

		}
	}

}
