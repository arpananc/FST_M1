package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Page Title :" +driver.getTitle());
		Actions act=new Actions(driver);
		WebElement Cargolock= driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement Cargotoml= driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcButton= driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetButton= driver.findElement(By.xpath("//h1[text()='target']"));
		act.click(Cargolock).pause(100).moveToElement(Cargotoml).pause(2000).click();
		 String actionMessage = driver.findElement(By.id("result")).getText();
	     System.out.println(actionMessage);
	     act.doubleClick(srcButton).pause(3000).pause(5000)
	        .contextClick(targetButton).pause(3000).build().perform();
	     act.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
	     actionMessage = driver.findElement(By.id("result")).getText();
	        System.out.println(actionMessage);

	}

}
