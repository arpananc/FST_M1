package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity17 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://training-support.net/webelements/selects");
	    System.out.println("Page title: " + driver.getTitle());
	    WebElement dropdown= driver.findElement(By.cssSelector("select.h-80"));
	    Select sel=new Select(dropdown);
	    sel.selectByVisibleText("HTML");
	    Thread.sleep(100);
	    for(int i=3;i<=5;i++)
	    {
	    	sel.selectByIndex(i);
	    }
	    sel.selectByValue("nodejs");
	    List<WebElement>alloptions=sel.getOptions();
		 for(WebElement option:alloptions)
		 {
			 System.out.println(option.getText());
		 }
		sel.deselectByIndex(4);
	        // Print the selected options
		alloptions = sel.getAllSelectedOptions();
	        System.out.println("Selected options are: ");
	        for (WebElement option : alloptions) {
	            System.out.println(option.getText());
	        }
	}

}
