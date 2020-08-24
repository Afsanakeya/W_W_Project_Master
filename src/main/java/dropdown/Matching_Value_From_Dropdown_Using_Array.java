package dropdown;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matching_Value_From_Dropdown_Using_Array {
	
	static WebDriver driver;
	static final String Win ="WINDOWS 10";
	static final String Mac ="MAC";
	static final String OSinfo = System.getProperty("os.name");
	
	static final String RunningOS() {
		String OSinfo=System.getProperty("os.name");
		String info = "";
		if (OSinfo.length()>3) {
			info=OSinfo.substring(0,3);
		   }
		return info;
		
	}
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		//
	
			
			if (RunningOS().equalsIgnoreCase(Mac)){
				
				//It will print OS info.		
				System.out.println("Your System is running on "+OSinfo+" \n"+"Chrome is launching for "+OSinfo);
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
				driver = new ChromeDriver();
				
				
				}
					// Will launch Chrome Driver if OS is runnign on Win and driver is Chrome.
					else if (RunningOS().equalsIgnoreCase(Win)){
						//It will print OS info.
						System.out.println("Your System is running on "+OSinfo+ "\n" +"Chrome is launching for "+OSinfo);
						System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
						driver = new ChromeDriver();
					}
			
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//To check whether the dropdown value are  present as expected

		   String[] exp = {"Audible Books & Originals","Alexa Skills","Amazon Devices","Amazon Fresh","Amazon Warehouse","Appliances","Apps & Games",
				   "Arts,Crafts & Sewing","Automotive Parts & Accessories","Baby","Beauty & Personal Care","Books","CDs & Vinyl","Cell Phones & Accessories",
				   "Clothing, Shoes & Jewelry","Women","Men","Girls","Boys","Baby","Under $10","Amazon Pantry","Collectibles & Fine Art","Courses","Courses",
				   "Credit and Payment Cards","Digital Educational Resources","Digital Music","Electronics","Garden & Outdoor","Gift Cards","Grocery & Gourmet Food",
				   "Handmade","Health, Household & Baby Care","Home & Business Services","Home & Kitchen","Industrial & Scientific","Just for Prime","Kindle Store",
				   "Luggage & Travel Gear","Magazine Subscriptions","Movies & TV","Musical Instruments","Office Products","Pet Supplies","Premium Beauty","Prime Video",
				   "Smart Home","Software","Sports & Outdoors","Subscription Boxes","Tools & Home Improvement","Toys & Games","Vehicles","Video Games","Whole Foods Market"};
		   
		   WebElement dropdown = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']"));   
		   Select select = new Select(dropdown); 
		  List<WebElement> options = select.getOptions(); 
		  
		  System.out.println("Tottal value in Drop Down is:"+options.size()+"\n"+"Printimg value from drop down"+"\n"+dropdown.getText());
		                     for(WebElement item:options) 
		                     { 
		                      for (int i=0; i<exp.length; i++){
		                    	  
		                          if (item.getText().equals(exp[i])){
		                        	  
		                        	  
		                          System.out.println("Matched" +i);
		                          }
		                          //System.out.println("Drop down Size is:" + dropdown.getSize()+"Printing Drop Down Value with index number"+dropdown.getText()+i);
		                        }
		                      
		                      } 
		                     
		                     try {
		         	            FileWriter writer = new FileWriter("./Files/TextFile3", true);
		         	            writer.write(dropdown.getText());
		         	            writer.close();
		         	        } catch (IOException e) {
		         	            e.printStackTrace();
		         	        }
		                     ArrayList<String> data = new ArrayList<String>();
		                     HashMap<String, String> map = new HashMap<String, String>();

		         	        BufferedReader br = null;
		         	        br = new BufferedReader(new FileReader("./Files/TextFile3"));
		         	        String line = br.readLine();
		         	        while (line != null)
		         	        {
		         	            /* if line is new key, return null,
		         	             * if line is duplicate key, return value
		         	             */
		         	            if (map.get(line) == null) {
		         	                System.out.println(line);
		         	                data.add(line);
		         	                map.put(line, line);
		         	            }
		         	            else
		         	                System.out.println("\n"+"duplicate: " + line+"\n");

		         	            line = br.readLine();
		         	        }
		         	        br.close();
		                     driver.quit();
	
	}

}
