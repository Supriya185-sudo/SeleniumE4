package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetails {
public  ContactDetails(WebDriver driver) 
{
PageFactory.initElements(driver,this);	
}
@FindBy(linkText = "Contacts")
private WebElement contact_link;
@FindBy(xpath = "//img[@title='Create Contact...']")
private WebElement create_icon;
@FindBy(xpath="//select[@name='salutationtype']")
private WebElement salutation;
@FindBy(name="firstname")
private WebElement first_Name;
@FindBy(css = "input[name='lastname']")
private WebElement last_Name;
@FindBy(xpath = "(//input[@type='submit'])[1]")
private WebElement save_button;
@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement headerln;


public WebElement contactLink() 
{
	return contact_link;	
}

public WebElement createIcon() 
{
	return create_icon;	
}
public WebElement salutations() 
{
	return salutation;	
}
public WebElement firstName() 
{
	return first_Name;	
}
public WebElement lastName() 
{
	return last_Name;	
}
public WebElement saveButton() 
{
	return save_button;	
}
public WebElement headerText() 
{
return 	headerln;
}
}
