package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dnyaneshwar Shinde\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iffco.engage.celusion.dev/portal");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("(//div[@id='15c05931-dc8b-4a13-84ed-92b5c7952e24'])[2]")).click();
//        driver.findElement(By.id("15c05931-dc8b-4a13-84ed-92b5c7952e24")).click();
        driver.findElement(By.xpath("//div/label[text()='Hindi']")).click();
        
        
    }
}
