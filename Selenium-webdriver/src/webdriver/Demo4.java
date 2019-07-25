package webdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(2000);
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement e;
		for (WebElement e1:links)
		{
			String text = e1.getText();
			System.out.println(text);
			FirefoxDriver driver1 = new FirefoxDriver();
			
		}
	
	}
}
