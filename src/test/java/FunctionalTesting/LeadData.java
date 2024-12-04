package FunctionalTesting;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVTiger;
import Com.Crm.Pom.Lead;
import Com.Crm.fileutility.ReadDataFromExcel;

public class LeadData extends BaseClassVTiger
{
	public static ReadDataFromExcel rde;
@Test
public void leadDatas() throws InterruptedException, IOException 
{
	rde=new ReadDataFromExcel();
	String lead_name=rde.exceldata("Sheet1", 1, 3);

	String lead_lname=rde.exceldata("Sheet1", 1, 4);

	String lead_company=rde.exceldata("Sheet1", 1, 5);

	Lead ref=new Lead(driver);
	ref.leadlink().click();
	ref.imagelink().click();
	Select sel=new Select(ref.SelectName());
	sel.selectByVisibleText("Ms.");
	Thread.sleep(2000);
	ref.firstName().sendKeys(lead_name);
	Thread.sleep(2000);
	ref.leadslastname().sendKeys(lead_lname);
	Thread.sleep(2000);
	ref.companyName().sendKeys(lead_company);
	ref.saveButton().click();

	String header_name=ref.headerText().getText();
	assertTrue(header_name.contains(lead_name));
	System.out.println("New Lead is created..");
}
}
