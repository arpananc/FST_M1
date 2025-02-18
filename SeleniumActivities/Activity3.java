package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Page Title :" +driver.getTitle());
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(100);
		String message = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getText();
        System.out.println(message);
		driver.close();
	}

}
