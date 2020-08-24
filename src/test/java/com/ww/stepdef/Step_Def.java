package com.ww.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import com.ww.common.Common;
import com.ww.objectrepo.Object_Repo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {

	WebDriver driver;
	Object_Repo ob;
	
	@Given("^User Open a dafault Browser$")
	public void user_Open_a_dafault_Browser() throws Throwable {
		
		//driver = Common.GetBrowser("chrome",driver);
		driver = Common.GetBrowser("firefox",driver);
		ob=PageFactory.initElements(driver,Object_Repo.class);
    
	  
	    
	}

	@When("^User in home weightwatchers page$")
	public void user_in_home_weightwatchers_page() throws Throwable {
		

		driver.get(Common.getGetURL());
		
	    if (Common.getGetURL().contains("weightwatchers")){
	    System.out.println("Successfully landed on Home Page");
	    }
	    else {
	    	System.out.println("Home Page is not correct");
	    	
	    }
	   // Thread.sleep(5000);
	}

	@When("^Verify that the loaded page title Contains Weight Loss$")
	public void verify_that_the_loaded_page_title_Contains_Weight_Loss() throws Throwable {
		
		System.out.println("verifications Results are below:");
		driver.getTitle();
		System.out.println("Page Title is:"+driver.getTitle());

		if (driver.getTitle().startsWith("WW (Weight Watchers")) {
			System.out.println(" Page Title verified and passed ");
		} else {
			System.out.println(" Page verification Failed ");
			
		}  
		//System.out.println("==========================");
		//Thread.sleep(5000);
	}
	

	@When("^User click on Find a studio$")
	public void user_click_on_Find_a_studio() throws Throwable {
	try {
		ob.getFind_a_StudioButton().click();	
		System.out.println("Element found and clicked on Find a studio button ");
	    
	   }
	catch(Exception e) {
		
		System.out.println("Element Could not found and unable to click on Find a studio button ");
		//Thread.sleep(2000);
	}
	}

	@When("^Verify that loaded page title contains Meetings Near You$")
	public void verify_that_loaded_page_title_contains_Meetings_Near_You() throws Throwable {
		
	    
	    driver.getTitle();
	    System.out.println(driver.getTitle());

		if (driver.getTitle().contains("Find A Meeting | WW USA")) {
			System.out.println("Page title verified and passed");
		} else {
			System.out.println("Page Title verification Failed");

		}
		System.out.println("==========================");
		//Thread.sleep(2000);
	}

	
	@When("^User enters zip code as \"([^\"]*)\" search for meetings In the search field$")
	public void user_enters_zip_code_as_search_for_meetings_In_the_search_field(String arg1) throws Throwable {
		try {
			 ob.getZipCode_Field().sendKeys(arg1);	
			System.out.println("Element found and Passed the value into search field ");
		    
		   }
		catch(Exception e) {
			
			System.out.println("Element Could not found and unable to passs the value in search field ");
		}
		//Thread.sleep(2000);
	}

	
	@When("^Click on arrow Button$")
	public void click_on_arrow_Button() throws Throwable {
		try {
			 ob.getClick_on_arrow_Button().click();
			 
			System.out.println("Element found and clicked on Arrow Button ");
		    
		   }
		catch(Exception e) {
			
			System.out.println("Element Could not find the element and unalbe to click on Arrow Button");
		}
	   
		//Thread.sleep(2000);
	}

	
	@When("^Print the title of the first result and the distance$")
	public void print_the_title_of_the_first_result_and_the_distance() throws Throwable {
		
		Thread.sleep(2000);
		try {

			System.out.print("The first search result is  "
			+ '\n' + driver.findElement(By.xpath("//div[@class='location'][1]")).getText());
			Common.TakeScreenshots(driver,"First_Search"); //Taking screenshot to verify the current page with the next page
			 
			System.out.println("Screen Shot Taken ");
		    
		   }
		catch(Exception e) {
			
			System.out.println("Unable to find first search result ad couldnt take screenshot");
		}
		//Thread.sleep(2000);
		
		    
	}

	
	@When("^User click on the first search result$")
	public void user_click_on_the_first_search_result() throws Throwable {
		
		
		try {
		ob.getfirst_search_result().click();
		System.out.println("" + '\n'+"==========================");
		Thread.sleep(2000);
		System.out.println("Clicke on first search result");
		}
		catch(Exception e) {
			System.out.println("Unable to locate the element and unable to click on first search result");
		}
		//Thread.sleep(2000);
	}

	@When("^User Verify that displayed location name matches with the name of the first searched$")
	public void user_Verify_that_displayed_location_name_matches_with_the_name_of_the_first_searched() throws Throwable {
		
		
		driver.getTitle();
		if (driver.getTitle().contains("14 W 23RD ST 2ND FL")) {
			System.out.println("First searched name is mached");
		} else {
			System.out.println("Displayed location DOES NOT matches with the name of the first searched");
		}
		Common.TakeScreenshots(driver,"Verifying_with_first_ScreShot"); //Taking Screenshot of the page to verify with the previous page
		System.out.println("==========================");
		//Thread.sleep(2000);
	}
	
	

	@When("^User Print TODAYs hours of operation from this location page$")
	public void user_Print_TODAYs_hours_of_operation_from_this_location_page() throws Throwable {
	    try {
		System.out.println("Today's Operating Hour is: "  
				+ '\n' + driver.findElement(By.xpath("//div[@class='filter-wrapper filter-wrapper--time']")).getText());
		System.out.println("==========================");
	   ////div[@class='hours-list-item-wrapper hours-list--currentday']
	    }
	    catch(Exception e) {
	    	System.out.println("Unable to get Todays Opening hour");
	    }
	    //Thread.sleep(2000);
	}
	@When("^user clicks on home_button control$")
	public void user_clicks  (String WebElement){
		
	    
	}
	
	@When("^user clicks \"([^\"]*)\" control$")
	public void user_clicks_control(String arg1) throws Throwable {
	    driver.findElement(By.xpath(arg1)).click();
	}

	
	@When("^user clicks on \"([^\"]*)\"control$")
	public void user_clicks_on_control(String arg1) throws Throwable {
		
		ob=PageFactory.initElements(driver,Object_Repo.class);
		driver.findElement(By.xpath(arg1)).click();
	}
	@When("^wait for (\\d+) seconds$")
	public void wait_for_seconds(int arg1) throws Throwable {
		try{
	   Thread.sleep(arg1);
	   System.out.println("Driver is waiting for "+arg1);
	   
		}
		catch (Exception e) {
			System.out.println("Skipped waiting");
		}

	}
	
	
	@Then("^User cloes the browser$")
	public void user_cloes_the_browser() throws Throwable {
		System.out.println("Closing Window");
	    
	    driver.quit();
		
	}


}
