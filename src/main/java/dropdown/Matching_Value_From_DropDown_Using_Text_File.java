package dropdown;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Matching_Value_From_DropDown_Using_Text_File {
	
	
	static WebDriver driver;	
	static final String Win ="WIN";
	static final String Mac ="MAC";
	static final String OSinformation = System.getProperty("os.name");
	
	public static final String OSinfo() {
		String OSinfo=System.getProperty("os.name");
		String info = "";
		if (OSinfo.length()>3) {
			info=OSinfo.substring(0,3);
		   }
		return info;		
	}
	
//WORKING AS EXPECTED	
public static void main(String[] args) throws Throwable {
	
	if (OSinfo().equalsIgnoreCase(Mac)){
		
		//It will print OS info.		
		System.out.println("Your System is running on "+OSinformation+"\n "+"Chrome is launching for "+OSinformation);
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		driver = new ChromeDriver();
		
		
		}
			// Will launch Chrome Driver if OS is runnign on Win and driver is Chrome.
			else if (OSinfo().equalsIgnoreCase(Win)){
				//It will print OS info.
				System.out.println("Your System is running on "+OSinformation+"\n"+"Chrome is launching for "+OSinformation);
				System.setProperty("webdriver.chrome.driver","./DriverWin/chromedriver.exe");
				driver = new ChromeDriver();
			}
	
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
Thread.sleep(5000);

				
WebElement dropdown = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']"));
				        
				//This block will delete existing file
				 try { 
			            // Get the file 
			            File file = new File("./Files/AmazonDropDown.txt"); 
			  
			            // delete file 
			            if (file.delete()) 
			                System.out.println("File deleted"); 
			            else
			                System.out.println("File was not deleted"); 
			        } 
			        
			        catch (Exception e) { 
			            System.err.println(e); 
			            
			        } 
				 
				 //This block will create file
				 try {
				      File file = new File("./Files/AmazonDropDown.txt");
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			
			
			//This block will write the the dwopdown value in the file 
				 try {
      	            FileWriter writer = new FileWriter("./Files/AmazonDropDown.txt", true);
      	            writer.write(dropdown.getText());
      	            writer.close();
      	        } catch (IOException e) {
      	            e.printStackTrace();
      	        }
				 
				 
				 //This block will print the file and also print duplicate value from the file 
                  ArrayList<String> data = new ArrayList<String>();
                  HashMap<String, String> map = new HashMap<String, String>();

      	        BufferedReader br = null;
      	        br = new BufferedReader(new FileReader("./Files/AmazonDropDown.txt"));
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
