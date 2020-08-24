package selenium_main_method;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import env.specific.driver.CallDriver;

public class PrintFooter {
	static CallDriver cldriver = new CallDriver();
	//static WebDriver driver;
	
	public static void main(String[] args) {
		
	
		

	
	
  WebDriver driver= CallDriver.LaunchChromeDriver("chrome");
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");	
	
		String log_in = driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]")).getText();
			System.out.print(log_in+"\n");
			if (log_in.startsWith("LOG")) {
				System.out.println("Login is dispayed");
			}
			else {
				System.out.println("Login is not dispayed");
			}
			boolean st=driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]")).isDisplayed();
			//Point tag=  driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]")).getLocation();
			String tag=  driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]")).getText().substring(0,5);
			driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]"));
			
			System.out.println(tag);
		
			
			driver.quit();
			
	}

}
