package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	String[] exp = {"Baby", "Book", "Women5", "4", "5", "6", "7", "8", "9"};
	   WebElement dropdown = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']"));    
	   Select select = new Select(dropdown); 
	                    java.util.List<WebElement> options = select.getOptions(); 
	                   
	                     for(WebElement item:options) 
	                     { 
	                      for (int i=0; i<exp.length; i++){
	                          if (item.getText().equals(exp[i])){
	                          System.out.println("Matched");
	                          }
	                        }
	                      } 
	                  
	                         
	                     driver.quit();

                       }

}