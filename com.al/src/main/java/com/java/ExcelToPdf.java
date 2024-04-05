package com.java;



import com.aspose.cells.DateTime;
import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;

public class ExcelToPdf {

	public static void main(String[] args) throws Exception {
		Workbook book = new Workbook("C:\\Users\\aravinthprasath.e\\Downloads\\Finesse_Audit_Trails_Apr24_Mar24.xlsx");
		
		PdfSaveOptions options = new PdfSaveOptions();
		DateTime time = DateTime.getNow();
	
		
		options.setAllColumnsInOnePagePerSheet(true);
		options.setCreatedTime(time);
		
		
		
	
		book.save("C:\\Users\\aravinthprasath.e\\Pictures\\Screenshots\\Finesse_Audit_Trails_Apr24_Mar24.pdf", options);
		System.out.println("PDF Created Successfully");

	}

}
