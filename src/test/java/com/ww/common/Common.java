package com.ww.common;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import dropdown.Print_Dropdown_Value;


public class Common {
	 
	static WebDriver driver;	
	static final String ChromeDriver = "webdriver.chrome.driver";
	static final String DriverPathMac = "./Driver/chromedriver";
	static final String DriverPathWin = "./DriverWin/chromedriver.exe";
	static final String Win ="WIN";
	static final String Mac ="MAC";
	static final String OSinformation = System.getProperty("os.name");
	
	//This method with identify the OS  and cut the OS env to 3char 
	public static final String OSinfo() {
		String OSinfo=System.getProperty("os.name");
		String info = "";
		if (OSinfo.length()>3) {
			info=OSinfo.substring(0,3);
		   }
		return info;
	}
	
	
	private static String getURL = "https://www.weightwatchers.com/us/";
		public static String getGetURL() {
			return getURL;
		}

	
	public static WebDriver GetBrowser(String BrowserName, WebDriver driver) {
		//String operSys = System.getProperty("os.name").toLowerCase();
		//This will allow the system to launch driver regardless of OS.
	if(OSinfo().equalsIgnoreCase(Mac)||OSinfo().equalsIgnoreCase(Win)) {
		
		// Will launch Chrome Driver if OS is runnign on Mac and driver is Chrome. 
		if (OSinfo().equalsIgnoreCase(Mac)&BrowserName.equalsIgnoreCase("chrome")){
			
	//It will print OS info.		
	System.out.println("Your System is running on "+OSinformation+"\n "+"Chrome is launching for "+OSinformation);
	System.setProperty(ChromeDriver,DriverPathMac);
	driver = new ChromeDriver();
	
	
	}
		// Will launch Chrome Driver if OS is runnign on Win and driver is Chrome.
		else if (OSinfo().equalsIgnoreCase(Win)&BrowserName.equalsIgnoreCase("chrome")){
			//It will print OS info.
			System.out.println("Your System is running on "+OSinformation+"/n "+"Chrome is launching for "+OSinformation);
			System.setProperty(ChromeDriver,DriverPathWin);
			driver = new ChromeDriver();
			
		}
	}
		else if (BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver","./Driver/operadriver");
			driver = new OperaDriver();	
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","./Driver/geckodriver");
			driver = new FirefoxDriver();	
		}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	    return driver;
	    
	}
	
	
	
	public static void TakeScreenshots (WebDriver driver,String FileName) throws Throwable {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f1= ss.getScreenshotAs(OutputType.FILE); // to take screenshot 
		FileUtils.copyFile(f1,new File("./Screenshot/"+FileName+".jpg"));//to save the file 
		if (ss.getScreenshotAs(OutputType.FILE) != null) {
			System.out.println("ScreenShot Taken");
			
		}
		else {
			System.out.println("ScreenShot Couldn't Take");
		}		
   }
	
	
	public static void Print_Dropdown_Value(WebDriver driver,String DropdownXpath) throws Throwable {
		

	    String DropdownValue = driver.findElement(By.xpath(DropdownXpath)).getText();
	    
	      System.out.println("Default value selected is :"+ DropdownValue);   
	    
	
		
	}
	  
public static String Print_Index(WebDriver driver,String DropdownXpath) throws Throwable {
		

	    String DropdownValue = driver.findElement(By.xpath(DropdownXpath)).getText();
	             return DropdownValue;	
		
	}
	
	
	
}
