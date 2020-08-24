package dynamic.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {
	
	private static WebDriver driver;
	private static String OSMac= "MAC";
	private static String OSWin= "Win";
	private static String URL = "https://www.google.com/";
			
	private static String OSinfo = System.getProperty("os.name");
	private static String OSinformation() {
	String getOS="";
	if (OSinfo.length()>3) {
		getOS=OSinfo.substring(0,3);
			
	}
	return getOS;
		
	}
	public static void main(String[] args) throws Throwable {
	
		if (OSinformation().equalsIgnoreCase(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
			driver = new ChromeDriver();
			
			
		}
		
		
		else if (OSinformation().contentEquals(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
			System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.get(URL);
	
		
		//driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("learn Java ");
		Thread.sleep(5000);
		
		List <WebElement> lst=driver.findElements(By.xpath("//*[@role='listbox']//li/descendant::div[@class='sbtc']"));
		System.out.println("Totla size of the list is :---->"+lst.size());
		try {
		for (int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i).getText());
			//System.out.println(lst.get(i).getText().indent(i));
			if (lst.get(i).getText().equalsIgnoreCase("Java Tutorial")) {
				lst.get(i).click();
				break;
			}
		}
  }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}
