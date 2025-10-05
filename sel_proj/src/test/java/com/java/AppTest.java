package com.java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void headerLangShouldChange() {
    	DriverManager dm = new DriverManager();
    	WebDriver driver = dm.getDriver();
    	Language obj = new Language();

    	obj.selectLanguage(driver, "Hindi");
    	String headerText = obj.getHeaderText(driver);
//        assertTrue(true);
    	if(headerText.equals("अपनी भाषा चुनें")) {
    		assertTrue(true);
    	}
    	else {
    		assertTrue(false);
    	}
    	dm.closeBrowser(driver);
    }
    
    @Test
    public void continueBtnlangShouldChange() {
    	DriverManager dm = new DriverManager();
    	WebDriver driver = dm.getDriver();
    	Language obj = new Language();

    	obj.selectLanguage(driver, "Hindi");
    	String headerText = obj.getContinueBtnText(driver);
//        assertTrue(true);
    	if(headerText.equals("जारी रखना")) {
    		assertTrue(true);
    	}
    	else {
    		assertTrue(false);
    	}
    	dm.closeBrowser(driver);
    }
}
