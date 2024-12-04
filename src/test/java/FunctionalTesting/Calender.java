package FunctionalTesting;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Com.Crm.BaseClass.BaseClassVTiger;
import Com.Crm.Pom.VtigerCalender;


public class Calender extends BaseClassVTiger{

		@Test
		public void calender() 
		{
	VtigerCalender ref=new VtigerCalender(driver);
		


		//driver.close();

	}
}
