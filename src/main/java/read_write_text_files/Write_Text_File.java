package read_write_text_files;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Text_File {
	
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("./Files/TextFile3", true);
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 

}
