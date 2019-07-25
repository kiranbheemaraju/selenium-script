package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
	WebDriver driver= new ChromeDriver ();
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium jar\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver ();
	// how to open the browser 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//i want maximize it/API  to maximize the screen
	driver.manage().window().maximize();
	String Expectedtitle = "OragneHRM";
	//Enter the username using sendkeys
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	String ActualTitle = driver.getTitle ();
	if(Expectedtitle.equals(ActualTitle))
	{
		//write the lines of logout
		System.out.println("if the title is same then do logout");
		driver.findElement(By.id("welcome")).click ();
		// just an option not to use
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click ();
		driver.close();	
	}
	}
}	

//*[@id="welcome-menu"]/ul/li[2]/a