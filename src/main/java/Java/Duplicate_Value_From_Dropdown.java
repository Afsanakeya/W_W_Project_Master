package Java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate_Value_From_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	
	Select s = new Select(driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")));
    List<WebElement> list = s.getOptions();
    Set<String> listNames = new HashSet<String>(list.size());
    for (WebElement element : list) {
       //Set will not allow to add duplicate value
        if(listNames.add(element.getText())==false){
            System.out.println("Duplicate value is: "+element);
        }
            else {
            	System.out.println("No duplicate value");
            }
            
        }
    driver.quit();
    }

 }
