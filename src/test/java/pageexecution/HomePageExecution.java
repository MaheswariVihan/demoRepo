package pageexecution;

import java.io.IOException;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagefactory.HomePage;


public class HomePageExecution {
		
	@BeforeSuite
	public void launch() {
	}
	
	@Test
	public void validcrediantal() throws IOException {	  
	       String Url= BaseClass.readProperty("C:\\Users\\mmahe\\eclipse-workspace\\TestNGProject\\target\\FileProperties", "Url");
	       BaseClass.launchUrl(Url);
	       HomePage ai= new HomePage();
	       
	       String username=BaseClass.readProperty("C:\\Users\\mmahe\\eclipse-workspace\\TestNGProject\\target\\FileProperties","username");
	       ai.Email.sendKeys(username);
	       
	       String password=BaseClass.readProperty("C:\\Users\\mmahe\\eclipse-workspace\\TestNGProject\\target\\FileProperties", "password");
	       ai.Password.sendKeys(password);
	       
	       
	}
}
