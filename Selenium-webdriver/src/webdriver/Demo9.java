package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException, AWTException    {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act =new Actions(driver);
		act.contextClick(link).build().perform();
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        String title1= driver.getTitle();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        String title2= driver.getTitle();
        if (title1.equals(title2))
        {
        	System.out.println("Title are same");
        	
        }
        else 
        {
        	System.out.println("Titel are not same");
        }
		}


	}
//driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type ='submit']"));
		//WebElement link = driver.findElement(By.Id)
