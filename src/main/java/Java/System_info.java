package Java;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;
import java.util.Set;

public class System_info {
	
	public static void main(String args[]) {       
       
		
		/*
		for (Object propertyKeyName:System.getProperties().keySet()){
            System.out.println(propertyKeyName+" - "+System.getProperty(propertyKeyName.toString()));
        }
        */
		
		 // String os = System.getProperty("os.name");
		   // System.out.println("Using System Property: " + os);
		
		
		/*
	       RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
	 
	        Map<String, String> systemProperties = runtimeBean.getSystemProperties();
	        Set<String> keys = systemProperties.keySet();
	        for (String key : keys) {
	            String value = systemProperties.get(key);
	            System.out.printf("[%s] = %s.\n", key, value);
	        }
		    */
		
	
	        // The key for getting operating system name
	        String name = "os.name";
	        // The key for getting operating system version
	        String version = "os.version";
	        // The key for getting operating system architecture
	        String architecture = "os.arch";

	        System.out.println("Name   : " + System.getProperty(name));
	        System.out.println("Version: " + System.getProperty(version));
	        System.out.println("Arch   : " + System.getProperty(architecture));
	    }
		    
		    
}

    


