package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://training-support.net/webelements/dynamic-attributes");
	     System.out.println("Page title: " + driver.getTitle());
	     WebElement fullName=driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
	     WebElement emailId=driver.findElement(By.xpath("//input[contains(@id, '-email')]"));
	     WebElement DOB=driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
	     WebElement details=driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));
	     fullName.sendKeys("Arpana");
	     emailId.sendKeys("Arpana@gmail.com");
	     DOB.sendKeys("1/2/1984");
	     details.sendKeys("Hi");
	     driver.findElement(By.xpath("//button[text()='Submit']")).click();
	     String msg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
	     System.out.println("Success msg " +msg);
	     driver.quit();
	}

}
