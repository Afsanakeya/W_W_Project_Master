package selenium_main_method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import sun.awt.OSInfo;

public class Practice {

	public static void main(String[] args) throws Throwable {
	
		/*
		// TODO Auto-generated method stub
		System.out.println(System.getenv());
		System.out.println(System.getSecurityManager());
System.out.println(System.getProperty("path.separator"));


// set up new properties object
// from file "myProperties.txt"
FileInputStream propFile =
    new FileInputStream( "./Files/myProperties.txt");
Properties p =
    new Properties(System.getProperties());
p.load(propFile);

// set the system properties
System.setProperties(p);
// display new properties
System.getProperties().list(System.out);
*/
		
		System.out.println(System.getenv("ENVIRONMENT"));
		String st = "Sony Khan";
		for (int i=0;i<=st.length();i++)
			
		System.out.println(i);
		
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		
		String OSinfo=System.getProperty("os.name");
		String info = "";
		if (OSinfo.length()>3) {
			info=OSinfo.substring(0,3);
			
		}
		System.out.println(info);
	     
			
		System.out.println(OSinfo);
		for(String Info:OSinfo.split("\\s",1)) {
		System.out.println(Info);
		}
		
		String input = "123456789";     //input string
		String firstFourChars = "";     //substring containing first 4 characters
		 
		if (input.length() > 4) 
		{
		    firstFourChars = input.substring(0, 4);
		} 
		else
		{
		    firstFourChars = input;
		}
		 
		System.out.println(firstFourChars);
		
		System.out.println(OSInfo());
	}

public static String OSInfo() {
	String OSinfo=System.getProperty("os.name");
	String info = "";
	if (OSinfo.length()>3) {
		info=OSinfo.substring(0,3);
		//return info;
	   }
	return info;
}
	
	
	
}
