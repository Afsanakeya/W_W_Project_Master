package dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index_position_inDropdown {
	
	
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
		 Select sel = new Select(driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")));

		    sel.selectByVisibleText("Baby");

		    List<WebElement> list = sel.getOptions();
		    for(WebElement item:list) 
		    { 
		    	
		         System.out.println(item.getText()); 
		       }
		   
		    for(int i=0;i<list.size();i++){
		        if(list.get(i).getText().equals(sel.getFirstSelectedOption().getText())){
		            System.out.println("The index of the selected option is: "+i);
		           

		            //break;
		            }
		    }
driver.quit();	
	}


}
