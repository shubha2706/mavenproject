package Maven_examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dpusingXcel {
	
	@Test
	public void testlogin() throws EncryptedDocumentException, IOException,Exception
	{

	try {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		FileInputStream ExcelObj = new FileInputStream("./Logindata.xlsx");
Workbook wb = WorkbookFactory.create(ExcelObj);	
int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();

String Username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
String password = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();

		



driver.findElement(By.id("txtUsername")).sendKeys(Username);
driver.findElement(By.id("txtPassword")).sendKeys(password);
driver.findElement(By.id("btnLogin")).click();

System.out.println(Username+":"+password);
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}


	