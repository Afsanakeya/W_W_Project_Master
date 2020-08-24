package File_Upload_and_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_and_download {
	
  public static void main(String[] args) throws Throwable {
	  WebDriver driver;
	
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='uploadfile_0']")).sendKeys("/Users/rashelkhan/Desktop/All/Project/W_W_Project/Files/Sample_upload.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
		Thread.sleep(3000);

	//	driver.switchTo().window("");

		    driver.findElement(By.xpath("//*[@fill='#ffffff']")).click();
		
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='demo']")).getText();
		if(driver.findElement(By.xpath("//*[@class='demo']")).getText().contains("1 file")) {
			
			System.out.println("Pass"+"\n"+driver.findElement(By.xpath("//*[@class='demo']")).getText());
			
		}
	  
	  
	  driver.quit();
}

}
