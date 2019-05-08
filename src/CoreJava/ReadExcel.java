package CoreJava;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class ReadExcel {

	public static void main(String[] args) throws  IOException, Exception {
		
		//Workbook wb = Workbook.getWorkbook (new File("C:\\Users\\vadga\\OneDrive\\Desktop\\sample11.xlsx"));
		
		Workbook wb = Workbook.getWorkbook (new File("C:\\Users\\vadga\\OneDrive\\Desktop\\sample1.xls"));

		Sheet sh = wb.getSheet(1);
		int cnt = sh.getRows();
		System.out.println(cnt);
		
		for(int i = 0; i < cnt; i++) {
			
			String Unm = sh.getCell(0,i).getContents();
			System.out.println(Unm);
			
			String pwd = sh.getCell(1,i).getContents();
			
			System.out.println(pwd);
			
		}
		
		
	}

}
