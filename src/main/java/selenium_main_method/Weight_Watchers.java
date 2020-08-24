package selenium_main_method;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import selenium.reusable.method.Click_SendKey_Mouse_Hover_Navigare;

public class Weight_Watchers {
	
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
	
	public static void main(String[] args) {
		
		if (OSinformation().equalsIgnoreCase(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
				System.setProperty("webdriver.firefox.driver","./Driver/geckodriver");
				driver = new FirefoxDriver();	
			//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
			//driver = new ChromeDriver();
			
			
		}
		
		
		else if (OSinformation().contentEquals(OSMac)||OSinformation().equalsIgnoreCase(OSWin)) {
			System.out.println("Your machine is running on "+OSinfo+"\n"+"Chrome is launching for"+OSinfo);
			//System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
			//driver = new ChromeDriver();
			
		}
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Click_SendKey_Mouse_Hover_Navigare mtd = new Click_SendKey_Mouse_Hover_Navigare();
		driver.get("https://www.weightwatchers.com/");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@da-label='Find a Workshop']")).click();
		User_Clicks_on("//*[@da-label='Find a Workshop']");
		//Thread.sleep(3000);
		User_Search_for("//*[@id='meetingSearch']","11100");
		User_Clicks_on("//*[@class='btn spice-translated']");
		//Thread.sleep(10000);
		User_Clicks_on("(//*[@class='bx-close-x-adaptive-1'])[1]");
		
		User_Print_Something(("(//*[@class='filter-buttons'])[2]"));
	}

	//@SuppressWarnings("deprecation")
	public static void User_Clicks_on(String Xpath) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement aboutMe;
		aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		aboutMe.click();
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//click method
		 //new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
	        //driver.findElement(By.xpath(Xpath)).click();
		//driver.findElement(By.xpath(Xpath)).click();
		
	}
public static void User_Search_for(String Xpath,String KeyValue) {
	try {
		//send key method 
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement aboutMe;
	aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
	aboutMe.sendKeys(KeyValue);
		//driver.findElement(By.xpath(Xpath)).sendKeys(KeyValue);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

public static void User_Print_Something(String Xpath) {
	try {
	//send key method 
WebDriverWait wait = new WebDriverWait(driver,20);
WebElement aboutMe;
aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
System.out.println(aboutMe.getText());
	//driver.findElement(By.xpath(Xpath)).sendKeys(KeyValue);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}

  }
}
