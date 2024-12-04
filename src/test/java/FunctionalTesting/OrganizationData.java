package FunctionalTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVTiger;
import Com.Crm.Pom.Organization;
import Com.Crm.fileutility.ReadDataFromExcel;

public class OrganizationData extends BaseClassVTiger
{
public static ReadDataFromExcel rde;
	@Test
public void org() throws InterruptedException, IOException
{
		String Expected_Result="http://localhost:9873/index.php?module=Accounts&action=index";
	
rde=new ReadDataFromExcel();
String sheet_data=rde.exceldata("Sheet1", 1, 2);
	String Actual_Result=driver.getCurrentUrl();
	Organization ref=new Organization(driver);
	assertEquals(Expected_Result, Actual_Result);
	Thread.sleep(2000);

	String org_name=sheet_data+Math.random();
	Thread.sleep(2000);
    ref.organization(org_name);
    Thread.sleep(2000);
    String header_name=ref.orgHeader().getText();
    Thread.sleep(2000);
assertTrue(header_name.contains(org_name));
Thread.sleep(2000);
System.out.println("New Organization is created");
}
	
}
