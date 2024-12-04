package Com.Crm.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public String exceldata(String sh,int row,int cell ) throws IOException 
{
	FileInputStream fis=new FileInputStream("C:\\Supriya\\DataDrivenTesting\\VtigerTestCases.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sh);
	String data = sheet.getRow(row).getCell(cell).toString();
	return data;
}
}
