package Com.Crm.BaseClass;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Crm.Pom.VTigerLogOut;
import Com.Crm.Pom.VtigerLogin;
import Com.Crm.fileutility.ReadPropertiesVTiger;

public class BaseClassVTiger
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void preCondition() throws IOException
	{
	String browser=ReadPropertiesVTiger.property("browser");
	String url=ReadPropertiesVTiger.property("url");
	
	
	if (browser.equalsIgnoreCase("chrome")) 
	{
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge") )
	{
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	
	}
	@BeforeMethod
	public void login() throws IOException {		
	String userName=ReadPropertiesVTiger.property("username");
	String password=ReadPropertiesVTiger.property("password");
	
	VtigerLogin obj= new VtigerLogin(driver);
	obj.login(userName, password);
			
	
	} 
	@AfterMethod
	public static void logout() throws InterruptedException {
		//driver.findElement(By.linkText("Sign Out")).click();
		VTigerLogOut ref= new VTigerLogOut(driver);
		ref.logout_icon().click();
		Thread.sleep(2000);
		ref.logout().click();
	}
@AfterClass
	public static void postcondition()
	{
		driver.quit();
	}
	}



