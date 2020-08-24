package pdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.DocListener;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Write_Pdf {
	
	
	 public static void main(String[] args) throws Throwable{
		 File fl = new File("./Files/Textfile2.txt"); 
		    Scanner sc = new Scanner(fl); 
		  
		    while (sc.hasNextLine()) 
		      System.out.println(sc.nextLine()); 
	
	      Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
	         document.open();

	         document.add(new Paragraph( "Writing in PDF"));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	   }

}
