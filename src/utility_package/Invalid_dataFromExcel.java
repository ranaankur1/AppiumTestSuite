package utility_package;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Invalid_dataFromExcel {

	static   XSSFSheet sheet1;
	static  int a;

static File file = new File("src\\test_data\\invalid_data.xlsx");
static String path=file.getAbsolutePath();
		public static void commfunc() throws Exception
		{

             File f1 =new File(path);  
		     FileInputStream fis1=new FileInputStream(f1);
		     XSSFWorkbook wb1=new XSSFWorkbook(fis1);
		     sheet1= wb1.getSheetAt(1);
		     a= sheet1.getPhysicalNumberOfRows();
		 		
		}
		
		public static String invalid_username() throws Exception
		{    commfunc();             
	    String query=  sheet1.getRow(1).getCell(0).getStringCellValue();
		return query;
	     
		}

		public static String invalid_password() throws Exception
		{    commfunc();             
	    String query=  sheet1.getRow(1).getCell(1).getStringCellValue();
		return query;
	     
		}
			
}
