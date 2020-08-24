package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get_Hardware_info_Woindows {

	
	// Get Hardware Information by CMD commends {
	 //public String HardDriveSerail () {
	public static String main(String[] args) {
	//
		
		
	
	  String data = "";


	  String[][] commands = new String[][] {         {"CMD", "/C", "WMIC OS GET Installdate,SerialNumber"},
	                                                 {"CMD", "/C", "WMIC BASEBOARD GET SerialNumber"},
	                                                 {"CMD", "/C", "WMIC CPU GET ProcessorId"},
	                                                 {"CMD", "/C", "WMIC COMPUTERSYSTEM GET Name"},
	                                                 {"CMD", "/C", "WMIC diskdrive GET Name, Manufacturer, Model, InterfaceType, MediaLoaded, MediaType"},
	                                                 {"CMD", "/C", "WMIC memphysical GET Manufacturer, Model, SerialNumber, MaxCapacity, MemoryDevices"},
	               };
	  try {
	   for (int i = 0; i < commands.length; i++) {
	    String[] com = commands[i];
	    Process process = Runtime.getRuntime().exec(com);
	        //Closing output stream of the process
	    process.getOutputStream().close();
	 
	    //Reading sucessful output of the command
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	            String s;
	    while ((s = reader.readLine()) != null) {
	     data += s;
	    }
	    //data = reader.lines().collect(Collectors.joining());
	   }
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  // Print Data
	  return data.trim().replaceAll(" +","-");
	  //return data.trim().replaceAll(" +","-");
	 }
	
	}


