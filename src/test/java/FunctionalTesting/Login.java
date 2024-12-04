package FunctionalTesting;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import Com.Crm.Pom.VtigerLogin;

public class Login {
	@Test
	public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://localhost:4545/");
	assertEquals("http://localhost:4545/",driver.getCurrentUrl());
	VtigerLogin ref=new VtigerLogin(driver);

	
	ref.login("admin","root");
	driver.close();

}
}