package com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager{
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dnyaneshwar Shinde\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iffco.engage.celusion.dev/portal");
        driver.manage().window().maximize();
		return driver;
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
