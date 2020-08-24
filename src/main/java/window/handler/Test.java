package window.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","/Users/datripler/Projects/lib/chromedriver");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(5000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.amazon.com/");
Thread.sleep(3000);
//Method to Handle window
Set <String> Whandel = driver.getWindowHandles();
List <String> lst = new ArrayList<String>(Whandel);
String ParentWindow=lst.get(0);
String ChildWindow=lst.get(1);

//Get Amazon Page title
String title = driver.getTitle();
System.out.println(title);

//Close Amazon window
driver.close();

//Switching to google window
driver.switchTo().window(ParentWindow);

//Passing Amazon Page title in google search
driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(title);
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
System.out.println(driver.getTitle());
driver.quit();

		
      }

}
