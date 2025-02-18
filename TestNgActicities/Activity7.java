package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver ;
	@BeforeClass
	public void beforeClass()
	{
		 driver = new ChromeDriver();
		 driver.get("https://training-support.net/webelements/login-form");
	}
	@DataProvider(name = "Credentials")
    public static Object[][] creds() {
        return new Object[][] { 
            { "admin1", "password1", "Invalid Credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid Credentials" }
        };
    }
 
    @Test(dataProvider = "Credentials")
    public void loginTest(String username, String password, String expectedMessage) {
        // Find the input fields and the login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
 
        // Clear the input fields
        usernameField.clear();
        passwordField.clear();
        // Enter the credentials and click Log in
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
 
        // Assert login message
        String loginMessage = driver.findElement(By.id("subheading")).getText();
        Assert.assertEquals(loginMessage, expectedMessage);
    }
	
	@AfterClass()
	public void teardown()
	{
		driver.quit();
	}


}
