package selenium.reusable.method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edu.gcfglobal.org/en/mousetutorial/mouse-tutorial/1/");
		Thread.sleep(3000);
		scrollDown();
		Thread.sleep(1000);
		scrollDown();
	   // driver.findElement(By.xpath("(//*[@alt='torso'])[2]")).sendKeys(Keys.DOWN);
		
		
	   // xPath("fromleftLeg", "(//*[@alt='left leg'])[2]");
	    //xPath("toleftLeg", "//*[@alt='left leg outline']");
		System.out.println("Draging Left Leg");
	    WebElement frmLftLg= driver.findElement(By.xpath("(//*[@alt='left leg'])[2]"));
		Thread.sleep(5000);
	    WebElement TomLftLg=driver.findElement(By.xpath("//*[@alt='left leg outline']"));
	    dragAndDrop(frmLftLg, TomLftLg);
	    System.out.println("Left Leg Dragged into place");
	    
	    System.out.println("Draging Right Leg");
	    WebElement frmrighttLg= driver.findElement(By.xpath("(//*[@alt='right leg'])[2]"));
		Thread.sleep(5000);
	    WebElement TorighttLg=driver.findElement(By.xpath("//*[@alt='right leg outline']"));
	    dragAndDrop(frmrighttLg, TorighttLg);
	    System.out.println("Right Leg Dragged into place");
	    
	    System.out.println("Draging Body Leg");
	    WebElement frombody= driver.findElement(By.xpath("(//*[@alt='torso'])[2]"));
		Thread.sleep(5000);
	    WebElement tobody=driver.findElement(By.xpath("//*[@alt='torso outline']"));
	    dragAndDrop(frombody, tobody);
	    System.out.println("Body Dragged into place");
	    
	    System.out.println("Draging Head Leg");
	    WebElement fromHead= driver.findElement(By.xpath("(//*[@alt='head'])[2]"));
		Thread.sleep(5000);
	    WebElement toHead=driver.findElement(By.xpath("//*[@alt='head outline']"));
	    dragAndDrop(fromHead, toHead);
	    Thread.sleep(5000);
	    System.out.println("Head Dragged into place");
	    
	    System.out.println("Draging left Hand");
	    WebElement frmLeftHand= driver.findElement(By.xpath("(//*[@alt='left arm'])[2]"));
		Thread.sleep(5000);
	    WebElement toeftHand=driver.findElement(By.xpath("//*[@alt='left arm outline']"));
	    dragAndDrop(frmLeftHand, toeftHand);
	    Thread.sleep(5000);
	    System.out.println("Left Hand Dragged into place");
	    
	    System.out.println("Draging Right Hand");
	    WebElement frmRightHnd= driver.findElement(By.xpath("(//*[@alt='right arm'])[2]"));
		Thread.sleep(5000);
	    WebElement ToRightHnd=driver.findElement(By.xpath("//*[@alt='right arm outline']"));
	    dragAndDrop(frmRightHnd, ToRightHnd);
	    Thread.sleep(5000);
	    System.out.println("Right Dragged into place");
	    /*
	    Actions action = new Actions(driver);
	    Action dragDrop = action.dragAndDrop(fromElement, toElement).build();
	    dragDrop.perform(); 
		// TODO Auto-generated method stub
*/
	    driver.quit();
	}

	

	public static void dragAndDrop (WebElement fromElement,WebElement toElement) {
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		//WebDriver driver = new ChromeDriver();
		 Actions action = new Actions(driver);
		    Action dragDrop = action.dragAndDrop(fromElement, toElement).build();
		    dragDrop.perform(); 
		   
	}
	public static void scrollUp() {
		Actions actions = new Actions(driver);
		 
		// Scroll Down using Actions class
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		 
		// Scroll Up using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		 
		
	}
	public static void scrollDown() {
		Actions actions = new Actions(driver);
		 
		// Scroll Down using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).perform();
		 
		// Scroll Up using Actions class
	//	actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		 
		
	}
	public static void clickMethod(String Xpath) {
		
		driver.findElement(By.xpath(Xpath)).click();
		
	}
public static void sendKey(String Xpath,String KeyValue) {
		
		driver.findElement(By.xpath(Xpath)).sendKeys(KeyValue);
		
	}
	
}
