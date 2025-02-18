package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://training-support.net/webelements/dynamic-controls");
	System.out.println("Page Title :" +driver.getTitle());
    WebElement textbox=driver.findElement(By.id("textInput"));
    System.out.println("Textbox is enabled"+textbox.isEnabled());
    driver.findElement(By.id("textInputButton")).click();
    System.out.println("Textbox is enabled"+textbox.isEnabled());	
    textbox.sendKeys("Enter the test");
    System.out.println(textbox.getDomProperty("value"));
	}

}
