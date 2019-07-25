package webdriver;

import org.openqa.selenium.By;

public class demo6 {

}
//*String underconstitle ="Under Construction: Mercury Tours";
List<WebElement> link = driver.findElements(By.tagName("a"));
String[] linktext = new String[link.size()];
//Extract the link text of each link elements
int i=0;
for(WebElement e:link)
{
  linktext[i] = e.getText();
  i++;
}
//Test weather each link is working or not working
for(String t:linktext)
{
  driver.findElement(By.linkText(t)).click();
  if(driver.getTitle().equals(underconstitle))
  {
      System.out.println("\"" + t + "\"" + "\"+ is underconstruction");
  }
  else
  {
      System.out.println("\"" + t + "\"" + "\"+ is working");
  }
  driver.navigate().back();
}
}