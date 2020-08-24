package pdf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


//WORKING AS EXPECTED
public class Text_TO_PDF {
	public static void main(String[] args) {
		
		try
        {
			Document document = new Document();
           PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("MonthlyReport.pdf"));
           document.open();
           document.add(new Paragraph("Amazon Drop Down value downloaded from drop down and writting it into PDF."));
           //Text file Data
           try (BufferedReader br = new BufferedReader(new FileReader("./Files/AmazonDropDown.txt")))
           {

               String sCurrentLine;

               while ((sCurrentLine = br.readLine()) != null) {
                   document.add(new Paragraph(sCurrentLine));
               }

           } catch (IOException exception) {
               exception.printStackTrace();
           }

           //Text File Data


           document.close();
           writer.close();
        } catch (DocumentException exception)
        {
           exception.printStackTrace();
        } catch (FileNotFoundException exception)
        {
           exception.printStackTrace();
        }
		
	}

}
