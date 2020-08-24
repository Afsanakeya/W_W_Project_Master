package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Dropdown_Value {
	
	static WebDriver driver;
	static final String Win ="WINDOWS 10";
	static final String Mac ="MAC";
	static final String OSinfo = System.getProperty("os.name");
	public static void main(String[] args) throws Exception {
		
		if (OSinfo.equalsIgnoreCase(Mac)){
			
			//It will print OS info.		
			System.out.println("Your System is running on "+OSinfo+"/n "+"Chrome is launching for "+OSinfo);
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
			driver = new ChromeDriver();
			
			
			}
				// Will launch Chrome Driver if OS is runnign on Win and driver is Chrome.
				else if (OSinfo.equalsIgnoreCase(Win)){
					//It will print OS info.
					System.out.println("Your System is running on "+OSinfo+"/n "+"Chrome is launching for "+OSinfo);
					System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
					driver = new ChromeDriver();
				}
		
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")); 
    Select select = new Select(dropdown); 
   List<WebElement> options = select.getOptions(); 
   System.out.println("Totla size of Dropdown: "+options.size()+"\n"+ "Printing Dropdown value:"); 
   
    for(WebElement item:options) 
    { 
         System.out.println(item.getText()+item.getTagName()); 
         
       }
    
    //}
    /*
    for(int i=0;i<options.size();i++){
        if(options.get(i).getText().equals("Bany")){
           System.out.println("The index of the selected option is: "+i);
           
        }
    }
    */
    System.out.println("Printing Second Method" + "\n"+"==============================");
    
    String s= driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")).getText();

    System.out.println("Default value selected is :"+ s);
    //Select sel = new Select(driver.findElement(By.xpath("//select[@name='Students']")));

    select.selectByVisibleText("");

  //  List<WebElement> list = sel.getOptions();

    for(int i=0;i<options.size();i++){
        if(options.get(i).getText().equals(select.getFirstSelectedOption().getText())){
            System.out.println("The index of the selected option is: "+i);
            break;
            }
    }
    
driver.quit();
    }
}