/*
 * package excel;
 * 
 * import java.io.FileInputStream; import java.text.Normalizer.Form; import
 * java.util.ArrayList; import java.util.HashSet; import java.util.Iterator;
 * import java.util.List;
 * 
 * import org.apache.poi.hssf.usermodel.HSSFSheet; import
 * org.apache.poi.hssf.usermodel.HSSFWorkbook; import
 * org.apache.poi.poifs.filesystem.POIFSFileSystem; import
 * org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Row;
 * import org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * public class Doesnot_work {
 * 
 * 
 * HSSFWorkbook workbook_Output;
 * 
 * HSSFWorkbook workbook_Output_Dup;
 * 
 * HSSFWorkbook workbook_Output_Final;
 * 
 * HSSFWorkbook workbook_Output_Final_2=null;
 * 
 * 
 * 
 * HSSFSheet sheet_Output;
 * 
 * HSSFSheet sheet_Output_Dup;
 * 
 * HSSFSheet sheet_Output_Final;
 * 
 * 
 * 
 * HSSFRow row_Output;
 * 
 * HSSFRow row_Output_Dup;
 * 
 * HSSFRow row_Output_Final;
 * 
 * 
 * 
 * HSSFCell cell;
 * 
 * 
 * 
 * HSSFRow row_Output_dup;
 * 
 * // Set<Integer> markrowdup = new HashSet<Integer>();
 * 
 * //List<HSSFCell> cellStoreList=new ArrayList<HSSFCell>();
 * 
 * 
 * 
 * try {
 * 
 * FileInputStream fistream_Output= new
 * FileInputStream("C:\\Users\\Satya\\Desktop\\Output.xls");
 * 
 * workbook_Output = new HSSFWorkbook(new POIFSFileSystem(fistream_Output));
 * 
 * 
 * 
 * File file_dup = new File("C:\\Users\\Satya\\Desktop\\Output_Dup.xls");
 * 
 * FileOutputStream fistream_output_dup = new FileOutputStream(file_dup);
 * 
 * workbook_Output.write(fistream_output_dup);
 * 
 * fistream_output_dup.close();
 * 
 * 
 * 
 * FileInputStream fistream_Output_Dup= new
 * FileInputStream("C:\\Users\\Satya\\Desktop\\Output_Dup.xls");
 * 
 * workbook_Output_Dup = new HSSFWorkbook(fistream_Output_Dup);
 * 
 * 
 * 
 * //File file_final_2 = new File("C:\\Users\\Satya\\Desktop\\Output_CRQ.xls");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * for (int sheetnum = 0; sheetnum < workbook_Output.getNumberOfSheets();
 * sheetnum++) {
 * 
 * 
 * 
 * Set<Integer> markrowdup = new HashSet<Integer>();
 * 
 * List<HSSFCell> cellStoreList=new ArrayList<HSSFCell>();
 * 
 * 
 * 
 * sheet_Output_Dup = workbook_Output_Dup.getSheetAt(sheetnum);
 * 
 * sheet_Output = workbook_Output.getSheetAt(sheetnum);
 * 
 * 
 * 
 * int lastrow = sheet_Output.getLastRowNum();
 * 
 * for (int i = 1; i <= lastrow; i++) {
 * 
 * row_Output_Dup = sheet_Output_Dup.getRow(i);
 * 
 * row_Output = sheet_Output.getRow(i);
 * 
 * 
 * 
 * for (int j = i; j <= lastrow; j++) {
 * 
 * row_Output_dup = sheet_Output.getRow(j);
 * 
 * if(i!=j)
 * 
 * {
 * 
 * if(row_Output.getCell(1).getStringCellValue()==row_Output_dup.getCell(1).
 * getStringCellValue())
 * 
 * {
 * 
 * markrowdup.add(j);
 * 
 * System.out.println(row_Output.getCell(1).getStringCellValue()
 * +" : Duplicte row num: "+j);
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * Object[] o = markrowdup.toArray();
 * 
 * Arrays.sort(o);
 * 
 * 
 * 
 * for (Object object : o) {
 * 
 * int row = ((Integer) object).intValue();
 * 
 * row_Output_Dup=sheet_Output_Dup.getRow(row);
 * 
 * sheet_Output_Dup.removeRow(row_Output_Dup);
 * 
 * }
 * 
 * File file_final = new File("C:\\Users\\Satya\\Desktop\\Output_Final.xls");
 * 
 * FileOutputStream fostream_final = new FileOutputStream(file_final);
 * 
 * workbook_Output_Dup.write(fostream_final);
 * 
 * fostream_final.close();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * FileInputStream fistream_final = new FileInputStream(file_final);
 * 
 * workbook_Output_Final = new HSSFWorkbook(fistream_final);
 * 
 * sheet_Output_Final = workbook_Output_Final.getSheetAt(sheetnum);
 * 
 * 
 * 
 * for (int i = 0; i <= sheet_Output_Final.getLastRowNum(); i++) {
 * 
 * row_Output_Final = sheet_Output_Final.getRow(i);
 * 
 * if(row_Output_Final==null)
 * 
 * System.out.println("Row is null");
 * 
 * else
 * 
 * {
 * 
 * Iterator<Cell> iterator_output_final = row_Output_Final.cellIterator();
 * 
 * while (iterator_output_final.hasNext()) {
 * 
 * cell = (HSSFCell) iterator_output_final.next();
 * 
 * cellStoreList.add(cell);
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * Iterator<HSSFCell> iterator_final_data = cellStoreList.iterator();
 * 
 * File file_final_2 = new File("C:\\Users\\Satya\\Desktop\\Output_CRQ.xls");
 * 
 * FileOutputStream fostream_final_2 = new FileOutputStream(file_final_2);
 * 
 * if(workbook_Output_Final_2 == null)
 * 
 * workbook_Output_Final_2=new HSSFWorkbook();
 * 
 * 
 * 
 * workbook_Output_Final_2.createSheet(workbook_Output.getSheetName(sheetnum));
 * 
 * 
 * 
 * HSSFSheet temp = workbook_Output_Final_2.getSheetAt(sheetnum);
 * 
 * int i=0;
 * 
 * int temp_row=0;
 * 
 * HSSFRow row = temp.createRow(temp_row); while (iterator_final_data.hasNext())
 * {
 * 
 * 
 * 
 * HSSFCell cell2 = iterator_final_data.next();
 * 
 * row.createCell(i).setCellValue(cell2.getStringCellValue());
 * 
 * System.out.print(cell2.getStringCellValue()+":  :");
 * 
 * i++;
 * 
 * if(i==4)
 * 
 * {
 * 
 * System.out.println();
 * 
 * i=0;
 * 
 * temp_row++;
 * 
 * row = temp.createRow(temp_row);
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * workbook_Output_Final_2.write(fostream_final_2);
 * 
 * 
 * 
 * //fostream_final_2.close();
 * 
 * fistream_final.close(); fistream_Output.close();
 * 
 * 
 * 
 * fostream_final_2.flush();
 * 
 * fostream_final_2.close();
 * 
 * 
 * 
 * }
 * 
 * fistream_Output.close();
 * 
 * fistream_Output_Dup.close();
 * 
 * 
 * 
 * }
 * 
 * catch (Exception e) {
 * 
 * 
 * 
 * e.printStackTrace();
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 */