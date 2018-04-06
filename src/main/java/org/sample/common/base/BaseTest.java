package org.sample.common.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver=null;
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarun.walia\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void quit() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
