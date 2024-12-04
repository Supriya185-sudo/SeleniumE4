package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.BaseClass.BaseClassVTiger;

public class Organization {
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
@FindBy(linkText = "Organizations")
private WebElement orglk;
@FindBy(xpath = "//img[@title='Create Organization...']")
private WebElement mglik;
@FindBy(name = "accountname")
private WebElement orgname;
@FindBy(xpath = "(//input[@name='button'])[1]")
private WebElement save;
@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement headerln;


	public void organization(String orname) throws InterruptedException 
	{
	
		orglk.click();
		mglik.click();
		orgname.sendKeys(orname);
		save.click();
		
	}
	public WebElement orgHeader()
	{
		return headerln;
	}
}
