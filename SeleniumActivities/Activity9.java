package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("Page Title :" +driver.getTitle());
		Actions act=new Actions(driver);
		act.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
        String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);

       
	}

}
