package com.maven_demo2_exercise;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Fileoutputstream {
   @Test
   public void method() {
	   FileOutputStream out;
	   XSSFWorkbook wb;
	  
	   
	  File file=new File("C:\\Users\\KIMURUGA\\Documents\\writedat.xlsx");
	  wb=new XSSFWorkbook();
	  XSSFSheet sh= wb.createSheet();
	  sh.createRow(0).createCell(0).setCellValue("kishore");
	  sh.getRow(0).createCell(1).setCellValue("mkishorebabungl@gmail.com");
	  try {
		  out= new FileOutputStream(file);
		  wb.write(out);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
   }
}
