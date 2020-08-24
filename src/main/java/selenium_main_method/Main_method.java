package selenium_main_method;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import os.info.OS_Info;
import os.info.OS_Info.OS;


public class Main_method {
	
	static String DriverName = "webdriver.chrome.driver";
	static String DriverPathMac = "./Driver/chromedriver";
	static String DriverPathWin = "./DriverWin/chromedriver.exe";
	static WebDriver driver;
	static String os ="Windows 10";
	static String os1 ="mac os x";
	public static void main(String[] args) throws Throwable {

		System.out.println(System.getProperty("os.name"));
		String operSys = System.getProperty("os.name");
		if (operSys.contentEquals("mac os x")){
			System.out.println(System.getProperty("os.name"));
	System.setProperty(DriverName,DriverPathMac );
	//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
	//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
	 driver= new ChromeDriver();
	//WebDriver driver2= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
		}
		else if(operSys.contentEquals("Windows 10")){
			System.out.println(System.getProperty("os.name"));
			System.setProperty(DriverName,DriverPathWin );
			//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
			//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
			 driver= new ChromeDriver();
			//WebDriver driver2= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
		}
	//WebDriver driver= new FirefoxDriver();
	//WebDriver driver= new FirefoxDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	/*driver.get("https://www.amazon.com/");
	
	
	driver.manage().window().maximize();
	driver2.get("https://www.google.com/");
	driver2.manage().window().maximize();
	Actions ac = new Actions(driver);
	driver2.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("amazon");
	driver2.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
	//driver2.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).click();
	driver2.getTitle();
	driver2.manage().window().setPosition(new Point(-3000, 0));
	Thread.sleep(5000);
	 //Select sel = new Select(driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")));
driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(driver2.getTitle());
driver2.quit();

	String st = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")).getText();
	
	int i=0;
	while (i<=10) {
		System.out.println(st+i++);
		 
		  i++;
	}		
	
	

*/
	            //break;
	            
	            
	            /*
		String s = "ASDF"; 
for (int a =0;a<=20;a++) {
	
	System.out.println(a+"\t"+s);
}
	*/
	//driver.quit();
	  }
	}

	
