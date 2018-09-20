package E_Banking;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel {
	public static Workbook book;
	public static Sheet sht;
	public static WritableWorkbook wbook;
	public static WritableSheet wsh;
	
	
	
    //For taking the excelsheet
	public static void createExcelConnection(String filename, String Sheet1) throws Exception {
		FileInputStream fip = new FileInputStream(filename);
		book = Workbook.getWorkbook(fip);
		sht = book.getSheet(Sheet1);
	}
	
	//Taking the rows from Excel sheet

	public static int getRows() {
		return sht.getRows();
	}

	//Taking the coloums from Excel sheet
	public static int getCols() {
		return sht.getColumns();
	}

	//Taking the content from particular cell from Excel sheet
	
	public static String readData(int cnum, int rnum) {
		return sht.getCell(cnum, rnum).getContents();
	}

	
	
	//creating the one more sheet for this metod and taking the data from old sheet
	public static void createOutputConn(String filename, String ofilename, String sheetname) throws Exception {
		FileInputStream fip = new FileInputStream(filename);
		book = Workbook.getWorkbook(fip);
				
		//creating the one more sheet for output result
		FileOutputStream fos = new FileOutputStream(ofilename);
		wbook = Workbook.createWorkbook(fos, book);
		wsh = wbook.getSheet(sheetname);
	}
	
	
     //for write Result column in new excel sheet 
	public static void writedata(int cnum, int rnum, String data) throws Exception {
		wsh.addCell(new Label(cnum, rnum, data));

	}
 
	
	//for saving the new excel data and sheet
	public static void savedata() throws Exception {
		wbook.write();
		wbook.close();
		book.close();
	}

}
