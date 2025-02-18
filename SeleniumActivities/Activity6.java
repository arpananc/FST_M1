package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page Title :" +driver.getTitle());
		 WebElement checkbox = driver.findElement(By.id("checkbox"));
	     checkbox.click() ;
	     System.out.println("Checkbox is Selected: " + checkbox.isSelected());
	     checkbox.click() ;
	     System.out.println("Checkbox is Selected: " + checkbox.isSelected());
	        

	}

}
