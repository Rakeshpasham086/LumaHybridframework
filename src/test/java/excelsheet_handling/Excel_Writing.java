package excelsheet_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Writing {
//	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
//		driver=new ChromeDriver();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Hp\\eclipse-workspace\\Testing_project\\Excelsheets\\table1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=9;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<=3;c++)
			{
				System.out.println("enter values");
				String values=sc.next();
				
				row.createCell(c).setCellValue(values);
			}
		}
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println(" values entering is done");
		
		
	}
	
	
}
