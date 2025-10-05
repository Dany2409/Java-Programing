package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Language {
	
	
	public String getHeaderText(WebDriver driver) {
		return driver.findElement(By.xpath("//h2")).getText();
	}
	
	public String getContinueBtnText(WebDriver driver) {
		return driver.findElement(By.xpath("//button")).getText();
	} 
	
	public void selectLanguage(WebDriver driver, String lang) {
		driver.findElement(By.xpath("//div/label[text()='Hindi']")).click();		
	}
}
