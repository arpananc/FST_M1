package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	
		public static void main(String[] args) {
			 WebDriver driver = new ChromeDriver();
		     driver.get("https://www.training-support.net/webelements/dynamic-controls");
		        System.out.println("Page title: " + driver.getTitle());
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement checkbox = driver.findElement(By.id("checkbox"));
		        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
                driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		        wait.until(ExpectedConditions.invisibilityOf(checkbox));
		        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
		        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		        System.out.println("Checkbox is selected? " + checkbox.isSelected());
		        driver.quit();

	}

}
