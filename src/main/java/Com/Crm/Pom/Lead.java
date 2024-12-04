package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead {

	public Lead(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
@FindBy(linkText = "Leads")
private WebElement lds;
@FindBy(xpath = "//img[@title='Create Lead...']")
private WebElement imglnk;
@FindBy(xpath = "//select[@name='salutationtype']")
private WebElement selname;
@FindBy(name = "firstname")
private WebElement fname;
@FindBy(xpath = "//input[@name='lastname']")
private WebElement lname;
@FindBy (xpath = "(//input[@type='submit'])[1]")
private WebElement save_button;
@FindBy (css = "input[name='company']")
private WebElement company_name;
@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement header_text;


public WebElement leadlink() 
{
return 	lds;
}
public WebElement imagelink() 
{
	return imglnk;
}
public WebElement SelectName()
{
return 	selname;
}
public WebElement firstName()
{
return fname;
}
public WebElement leadslastname()
{
	return lname;
}
public WebElement saveButton() 
{
return save_button;	
}
public WebElement companyName() 
{
return 	company_name;
}
public WebElement headerText() 
{
return header_text;	
}
}

