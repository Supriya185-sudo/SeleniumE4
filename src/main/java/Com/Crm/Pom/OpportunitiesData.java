package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesData 
{
public OpportunitiesData(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(linkText = "Opportunities")
private WebElement opp_link;
@FindBy(xpath = "//img[@title='Create Opportunity...']")
private WebElement opp_Icon;
@FindBy (name="potentialname")
private WebElement opp_name;
@FindBy(xpath = "//select[@id='related_to_type']")
private WebElement related_toType;
@FindBy(xpath = "(//img[@title='Select'])[1]")
private WebElement select_option;

public WebElement opportunitiesLink() 
{
	return opp_link;
}
public WebElement opportunitiesImage() 
{
	return opp_Icon;
}
public WebElement opportunitiesName() 
{
	return opp_name;
}
public WebElement relatedToType() 
{
	return related_toType;
}
}
