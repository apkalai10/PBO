package com.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat.Style;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel {

	public static void main(String[] args) throws IOException {
		
		
		Workbook wb = new XSSFWorkbook();
		Sheet sheet1 = wb.createSheet("Index");
		 
		
		Font heading = wb.createFont();
		heading.setBold(true);
	
		
		Row row0 = sheet1.createRow(0);
		
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Age");
		row0.createCell(2).setCellValue("City");
		Row row1 = sheet1.createRow(1);
		row1.createCell(0).setCellValue("Aravinth Prasath E");
		row1.createCell(1).setCellValue("25");
		row1.createCell(2).setCellValue("Coimbatore");
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\aravinthprasath.e\\Pictures\\Screenshots\\data.xlsx");
		wb.write(file);
		wb.close();
		file.close();

	}

}
