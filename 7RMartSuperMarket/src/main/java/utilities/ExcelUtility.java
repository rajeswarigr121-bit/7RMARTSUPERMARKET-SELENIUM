package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constants;

public class ExcelUtility {
	static FileInputStream f; //FileInputStream is a class to fetch the file details.
	static XSSFWorkbook wb; // XSSFWorkbook is a class to fetch the details from workbook(excel).
	static XSSFSheet   sh; // XSSFSheet is a class to get the detils from sheets(inside excel like sheet1, sheet2.
	public static String getStringData(int a,int b, String sheet) throws IOException  //int a is row, int b is column
	{
		f=new FileInputStream(Constants.EXCELPATH);// always give\\
		wb= new XSSFWorkbook(f); 
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a); 
		XSSFCell c = r.getCell(b); 
		return c.getStringCellValue();
	}
	public static String getIntegerData(int a, int b, String sheet) throws IOException 
	{
		f=new FileInputStream(Constants.EXCELPATH);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r=sh.getRow(a);
		XSSFCell c= r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
		
	}
	public static String getFloatData(int a, int b) throws IOException 
	{
		f= new FileInputStream("D:\\excel\\excel_example.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c= r.getCell(b);
		float x=(float) c.getNumericCellValue();
		return String.valueOf(x);
		
	}
}


