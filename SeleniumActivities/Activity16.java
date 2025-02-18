package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity16 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://training-support.net/webelements/selects");
	    System.out.println("Page title: " + driver.getTitle());
	   WebElement dropdown= driver.findElement(By.cssSelector("select.h-10"));
	    Select sel=new Select(dropdown);
		sel.selectByVisibleText("Two");
		 System.out.println("Second option: " + sel.getFirstSelectedOption().getText());
		sel.selectByIndex(3);
		 System.out.println("Thrid option: " + sel.getFirstSelectedOption().getText());
		 sel.selectByValue("four");
		 System.out.println("Fourth option: " + sel.getFirstSelectedOption().getText());
		 List<WebElement>alloptions=sel.getOptions();
		 for(WebElement option:alloptions)
		 {
			 System.out.println(option.getText());
		 }
	}

}
