package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected());
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		WebElement DD= driver.findElement(By.name("passCount"));
		Select sel= new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		//1 option
		sel.selectByVisibleText("2");
		Thread.sleep(2000);
		//2 option
		sel.selectByIndex(2);
		Thread.sleep(2000);
		// 3 rd option
		sel.selectByValue("1");
		
	}

}
