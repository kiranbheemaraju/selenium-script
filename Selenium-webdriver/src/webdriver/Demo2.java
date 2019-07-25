package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.name("userName"));
		if (UN.isEnabled());
		{
			UN.sendKeys("Sunil");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("Manipal");
			}
		{
			if(driver.findElement(By.name("userName")).isDisplayed ());
		}
		// get the userName and print that userName in my console 
		//System.out.println(UN.getAttribute("value")); 
		String name = UN.getAttribute("value");
		System.out.println("This will get the attribute of the value-->" + name);
		String name1 = UN.getAttribute("name");
		driver.findElement(By.name(name1)).clear();
		System.out.println("This will get the attribute of the value-->" + name1);
		
		String type = UN.getAttribute("type");
		System.out.println("type");
		//getText can be used for label & also can be used for dropdown 
		String label1 = driver.findElement(By.xpath("//*[contains(tesxt()).'Name:')]")).getText();
		 System.out.println(label1);
		}
}
