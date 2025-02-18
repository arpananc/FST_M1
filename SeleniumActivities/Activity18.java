package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity18 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://training-support.net/webelements/alerts");
	    System.out.println("Page title: " + driver.getTitle());
	    driver.findElement(By.id("simple")).click();
	    Alert alert=driver.switchTo().alert();
	    String text=alert.getText();
	    System.out.println("Text in alert: " +text);
	    alert.accept();
	    System.out.println(driver.findElement(By.id("result")).getText());
	}

}
