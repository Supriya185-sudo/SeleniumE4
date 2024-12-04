package FunctionalTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassVTiger;
import Com.Crm.Pom.ContactDetails;
import Com.Crm.Pom.OpportunitiesData;
import Com.Crm.fileutility.ReadDataFromExcel;

public class OpportunitiesDetails extends BaseClassVTiger 
{
	public static ReadDataFromExcel rde;
	@Test
	public void org() throws InterruptedException, IOException
	{
			String Expected_Result="http://localhost:9873/index.php?action=index&module=Home";
		
	rde=new ReadDataFromExcel();
	String opport_name=rde.exceldata("Sheet1", 1, 10);

		String Actual_Result=driver.getCurrentUrl();
		OpportunitiesData ref=new OpportunitiesData(driver);
		assertEquals(Expected_Result, Actual_Result);
		Thread.sleep(2000);
		ref.opportunitiesLink().click();
		Thread.sleep(2000);
		ref.opportunitiesImage().click();
		Thread.sleep(2000);
		ref.opportunitiesName().sendKeys(opport_name);;
		Select sel=new Select(ref.relatedToType());
		sel.selectByVisibleText("Contacts");
			
		    Thread.sleep(2000);
		    ref.saveButton().click();
		    String header_name=ref.headerText().getText();
		    Thread.sleep(2000);
		assertTrue(header_name.contains(contact_firstName));
		Thread.sleep(2000);
		System.out.println("New Contact is created");
	
	}

}
