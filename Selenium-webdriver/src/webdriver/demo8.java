package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo8 {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		Actions act1 = new Actions (driver);
		act1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		
	}
	

}
