package dropdown;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Duplicate_Data_from_text {
	
	 private static ArrayList<String> data = new ArrayList<String>();
	    public static void main(String[] args) throws IOException
	    {
	        //arrayListConstructor("./Files/Book1.xlsx");
	        arrayListConstructor("./Files/Textfile.txt");
	        System.out.println(data);
	    }
	    public static void arrayListConstructor(String filename) throws IOException
	    {
	        HashMap<String, String> map = new HashMap<String, String>();

	        BufferedReader br = null;
	        br = new BufferedReader(new FileReader(filename));
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
	    }
	
	    
	    /*
	     
	     public class pring
{
    private static ArrayList<string> data = new ArrayList<string>();
    public static void main(String[] args) throws IOException
    {
        arrayListConstructor("C:/Users/DfroJaCk DB/Desktop/zongrecv.txt");
        System.out.println(data);
    }
    public static void arrayListConstructor(String filename) throws IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        while (line != null)
        {
            data.add(line);
            line = br.readLine();
        }
        br.close();
    }
}

	     */
	    
	    
} 


