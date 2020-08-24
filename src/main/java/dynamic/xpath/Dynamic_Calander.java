package dynamic.xpath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import env.specific.driver.CallDriver;



public class Dynamic_Calander {
	
    static boolean flag = false;
	static CallDriver callDriver = new CallDriver();
	static WebDriver driver;
	
	public static void highLightElement(WebElement element){
		   JavascriptExecutor js = (JavascriptExecutor)driver;   
		   js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);   
		 }

	
	
	
	static String currentDate() {

		SimpleDateFormat formatter = new SimpleDateFormat("dd"); 
	    Date date = new Date(); 
	    String currentDate = formatter.format(date);
	    //System.out.println(currentDate); 
	    return currentDate;
	}
	//Set Futeue date this code block will get system current date and add future date. 
	public static String SetFutureDate(int FuturefDays) throws Throwable {
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date date = new Date(); //get current date
        Calendar cal = Calendar.getInstance();
        String currentDate = formatter.format(date);
        String setFutureDate = null;
    
        cal.setTime(formatter.parse(currentDate));
        cal.add(Calendar.DATE, FuturefDays);

        setFutureDate = formatter.format(cal.getTime());

    

    return setFutureDate;

}
	
	public static void main(String[] args) throws Throwable {
		
		
   
   
   driver=callDriver.LaunchChromeDriver("chrome");
   
   driver.get("https://www.booking.com/");
   
 //*[@id="frm"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[2]/td[1]
 //*[@id="frm"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[1]
 //*[@id="frm"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[1]
   
 //*[@id="frm"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[1]/td[2]
 //*[@id="frm"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[1]
   
   driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
   
   Thread.sleep(5000);
   
   
   String Chechinpart1Xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[";
   
   String Chechinpart2Xpath = "]/td[";
   
  // final int totalWeekDays =7;
   
   
	 //This loop to iterate weeks
   for(int RowNumber=1;RowNumber<=6; RowNumber++) {
	 //This loop to iterate days
	   for(int ColumnNumber=1;ColumnNumber<=7; ColumnNumber++) {
		   
		  String WeekDays= driver.findElement(By.xpath(Chechinpart1Xpath+RowNumber+Chechinpart2Xpath+ColumnNumber+"]")).getText();
		   
	   System.out.println(WeekDays);
	   
	   if(WeekDays.equals(currentDate())) {
		   
		   WebElement CheckinDate = driver.findElement(By.xpath(Chechinpart1Xpath+RowNumber+Chechinpart2Xpath+ColumnNumber+"]"));
		   highLightElement(CheckinDate);
		   CheckinDate.click();
		   
		  // driver.findElement(By.xpath(Chechinpart1Xpath+RowNumber+Chechinpart2Xpath+ColumnNumber+"]")).click();
		   Thread.sleep(5000);
		  System.out.println("Clicked on Date"+driver.findElement(By.xpath(Chechinpart1Xpath+RowNumber+Chechinpart2Xpath+ColumnNumber+"]")).getText());
	   flag=true;
		   break;
	   }
	}
	   if(flag) {
		   break;
	   }
	   
	   
   }
 
   
WebElement checkin= driver.findElement(By.xpath("(//*[@class='sb-searchbox__input sb-date-field__field  sb-date__field-svg_icon'])[1]"));
highLightElement(checkin);
checkin.click(); 

WebElement checkOut= driver.findElement(By.xpath("(//*[@class='sb-searchbox__input sb-date-field__field  sb-date__field-svg_icon'])[2]"));
highLightElement(checkOut);
checkOut.click(); 


   
 String CheckOutpart1Xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[";
   
   String CheckOutpart2Xpath = "]/td[";
   
   
  // final int days =7;
   
   
   
   //This loop to iterate weeks
   for(int RowNumber=1;RowNumber<=5; RowNumber++) {
	   //this loop to iterate days
	   for(int ColumnNumber=1;ColumnNumber<=7; ColumnNumber++) {
		   
		  String WeekDays= driver.findElement(By.xpath(CheckOutpart1Xpath+RowNumber+CheckOutpart2Xpath+ColumnNumber+"]")).getText();
		   
	   System.out.println(WeekDays);
	   
	   if(WeekDays.equals(currentDate())) {
	  //if(WeekDays.equals(SetFutureDate(-1))) {
		   
		   
		   WebElement CheckOutDate =driver.findElement(By.xpath(CheckOutpart1Xpath+RowNumber+CheckOutpart2Xpath+ColumnNumber+"]"));
		   highLightElement(CheckOutDate);
		   CheckOutDate.click();
		   
		   //driver.findElement(By.xpath(CheckOutpart1Xpath+RowNumber+CheckOutpart2Xpath+ColumnNumber+"]")).click();
		   
		   
		   Thread.sleep(5000);
String getTextifClickedDate=  driver.findElement(By.xpath(CheckOutpart1Xpath+RowNumber+CheckOutpart2Xpath+ColumnNumber+"]")).getText();
		System.out.println("Clicked on Check out Date " +getTextifClickedDate );
		Thread.sleep(5000);
		flag=true;
		   break;
	   }
	}
	   
	   if(flag) {
		   break;
		   
	   }
	   
   }
 
   
   Thread.sleep(5000);
   driver.quit();
   System.out.println("Closed driver");
		

	}

}
