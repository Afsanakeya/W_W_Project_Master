package env.specific.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallDriver {
	 static WebDriver driver;
	 static final String OSMac= "MAC";
	 static final String OSWin= "Win";
	 static final String URL = "https://www.google.com/";
			
	static final String OSinfo = System.getProperty("os.name");
	static final String OSinformation() {
	String getOS="";
	if (OSinfo.length()>3) {
		getOS=OSinfo.substring(0,3);
			
	}
	return getOS;
		
	}
	
	public static  WebDriver LaunchChromeDriver(String DriverName){
		
		if (DriverName.equalsIgnoreCase("chrome")||OSinformation().equalsIgnoreCase(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
			
		}
		
		
		else if (OSinformation().contentEquals(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
			System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
}
