
  package regular.exp;
  
  import java.io.File; import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
//import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.font.PDType1Font;  
  
  
  public class Write_PDF {
  
 public static void main(String[] args) throws IOException {
	 
	//Creating PDF document object 
     PDDocument document = new PDDocument();     
    
     //Add an empty page to it 
     document.addPage(new PDPage()); 
    
     //Saving the document 
     document.save("./Files/AddText_IP.pdf"); 
     
     System.out.println("PDF created");  
     
     //Closing the document  
     //document.close();  
	 
	 //Loading an existing document 
     PDDocument doc = PDDocument.load(new File("./Files/AddText_IP.pdf")); 

     //Creating a PDF Document 
     PDPage page = doc.getPage(0);       
     PDPageContentStream contentStream = new PDPageContentStream(doc, page); 
     
     //Begin the Content stream 
     contentStream.beginText(); 

     //Setting the font to the Content stream  
     contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 ); 

     //Setting the position for the line 
     contentStream.newLineAtOffset(0,725 ); 
     String text = "This is an example of adding text to a page in the pdf document." 
       + "we can add as many lines "
       + "as we want like this using the draw string method"
        +"of the ContentStream class"; 

     //Adding text in the form of string 

	  //File fl = new File("./Files/Textfile2.txt"); 
     contentStream.showText(text); 

     //Ending the content stream 
     contentStream.endText(); 
     System.out.println("Content added");       

     //Closing the content stream 
     contentStream.close();      

     //Saving the document  
     try {
     doc.save(new File("./Files/AddText_IP.pdf")); 
     System.out.println("File Saved");
     }
     catch (Exception e) {
    	 System.out.println("An Error occured, file couldn't saved");
     }
     //Closing the document  
     doc.close();  
	
} 
  
  
  }
 