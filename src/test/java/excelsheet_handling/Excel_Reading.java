package excelsheet_handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading {
//	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
//		driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Testing_project\\Excelsheets\\excel sheet1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cloumns=sheet.getRow(1).getLastCellNum();
		for(int i=0;i<=rows;i++)
		{
			XSSFRow crow=sheet.getRow(i);
			for(int c=0;c<cloumns;c++)
			{
				String values=crow.getCell(c).toString();
				System.out.print(values+" ");
			}
			System.out.println();
			
		}
		
		
		
	}
}
