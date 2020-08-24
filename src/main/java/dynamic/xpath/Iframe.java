package dynamic.xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	private static WebDriver driver;
	private static String OSMac= "MAC";
	private static String OSWin= "Win";
	private static String URL = "https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver";
			
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
		Thread.sleep(20000);
		
		String mainWinHandle = driver.getWindowHandle(); // Get your main window
		String subWinHandle = null;

		Set<String> allHandle = driver.getWindowHandles(); // Fetch all handles
		Iterator<String> iterator = allHandle.iterator();
		while (iterator.hasNext()){
			subWinHandle = iterator.next();
		}
		try {
		driver.switchTo().window(subWinHandle); // switch to popup 
		driver.findElement(By.xpath("//*[@class='tingle-modal__closeIcon']")).click();
		//Write code to close Ad or skip   
		System.out.println("Closed the add successfully");
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.switchTo().window(mainWinHandle);
		driver.findElement(By.xpath("(//*[contains(text(),'Home')])[2]")).click();
		try {
		driver.findElement(By.xpath("//*[@title='Sign In']")).click();
		System.out.println("Clicked on Sign in");
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}
