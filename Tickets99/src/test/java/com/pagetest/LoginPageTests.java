package com.pagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPageTests {
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/eventtitans/eclipse-workspace/Tickets99/ChromeDriver/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stage.tickets99.com/");
	}

}
