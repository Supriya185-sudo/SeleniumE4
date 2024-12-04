package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerCalender {
	public VtigerCalender(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(linkText = "Calendar")
	private WebElement calen;
	@FindBy(linkText = "Day")
	private WebElement dy;


	public void calender() throws InterruptedException 
	{
		Thread.sleep(3000);
		calen.click();
		Thread.sleep(3000);
		dy.click();
	
	}
}
