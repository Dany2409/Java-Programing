package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.*;




public class languagePage 
{
	public static void main(String[] args) throws InterruptedException
	{

		try {

			WebDriver driver= new ChromeDriver();

			String url="https://iffco.engage.celusion.dev/portal/";
			driver.manage().window().maximize();
			Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			driver.get(url);

			WebElement hindibtn= driver.findElement(By.xpath("//div[@id='dd5b8a44-9848-489c-9d94-2ca86a976bf1']//div[2]"));
			hindibtn.click();

			WebElement sbtbtn= driver.findElement(By.xpath("//button[@id='0544be4e-93a0-47dd-9f23-5ee27876f41f']"));
			sbtbtn.click();

			WebElement lgnbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath ("//button[@id='f5cb4dcd-1abc-422e-a525-f12ba1323008']")));
			//WebElement lgnbtn= driver.findElement(By.xpath("//button[@id='f5cb4dcd-1abc-422e-a525-f12ba1323008']"));
			lgnbtn.click();

			WebElement etrnum= driver.findElement(By.xpath("//input[@id='4f31c60f-d16c-4a74-a15a-fff0d8243511']"));
			etrnum.sendKeys("9977181779");
			Thread.sleep(1000);
			WebElement letsgo= driver.findElement(By.xpath("//button[@id='b28d1fd1-18d1-46f9-8dd1-53d9823d6393']"));
			letsgo.click();
		}
		catch(Exception e) 
		{
			System.out.println("Unexpected exception: " + e.getMessage());
		}
		finally {
			System.out.println("your code is failed");
		}

	}
}
