package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {
	public VtigerLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(name = "user_name")
	private WebElement user_name;
	@FindBy(css = "input[name='user_password']")
	private WebElement password;	
	@FindBy(id="submitButton")
	private WebElement submit_button;

	public void login(String username,String pwd) 
	{
		user_name.sendKeys(username);
		password.sendKeys(pwd);
		submit_button.click();
	}
	/*
	public void ln(String userName,String password)
	{
		username(userName);
		 password(password);
		 submit();
	}
*/
}
