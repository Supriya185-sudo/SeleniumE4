package FunctionalTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVTiger;
import Com.Crm.Pom.ContactDetails;
import Com.Crm.Pom.Organization;
import Com.Crm.fileutility.ReadDataFromExcel;

public class ContactInformation extends BaseClassVTiger{

	public static ReadDataFromExcel rde;
	@Test
public void org() throws InterruptedException, IOException
{
		String Expected_Result="http://localhost:9873/index.php?action=index&module=Home";
	
rde=new ReadDataFromExcel();
String contact_firstName=rde.exceldata("Sheet1", 1, 6);
String contact_lastName=rde.exceldata("Sheet1", 1, 7);
	String Actual_Result=driver.getCurrentUrl();
	ContactDetails ref=new ContactDetails(driver);
	assertEquals(Expected_Result, Actual_Result);
	Thread.sleep(2000);
	ref.contactLink().click();
	Thread.sleep(2000);
	ref.createIcon().click();
	Thread.sleep(2000);
Select sel=new Select(ref.salutations());
sel.selectByVisibleText("Mr.");
	ref.firstName().sendKeys(contact_firstName);;
	Thread.sleep(2000);
  ref.lastName().sendKeys(contact_lastName);
    Thread.sleep(2000);
    ref.saveButton().click();
    String header_name=ref.headerText().getText();
    Thread.sleep(2000);
assertTrue(header_name.contains(contact_firstName));
Thread.sleep(2000);
System.out.println("New Contact is created");

}
}
