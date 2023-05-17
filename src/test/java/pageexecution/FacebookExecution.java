package pageexecution;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagefactory.FacebookPage;


public class FacebookExecution extends BaseClass {
	
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("Facebook beforeSuite");
	}
	
	@BeforeGroups("PM")
	public static void beforegroups() {
		System.out.println("Facebook beforeGroup");
	}

	@AfterSuite
	public static void afterSuite() {
		System.out.println("Facebook afterSuite");
	}

	@BeforeTest
	public static void beforeTest() {
		System.out.println("Facebook beforeTest");
	}

	@AfterTest
	public static void afterTest() {
		System.out.println("Facebook afterTest");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Facebook beforeClass");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Facebook afterClass");
	}
	
	@Parameters({ "browser" }) 
	@BeforeMethod (groups= {"PM"})
	public void beforeMethod(String browser) {
		BaseClass.launchBrowser(browser);
		System.out.println("Facebook beforeMethod");
	} 

	@AfterMethod(groups= {"PM"})
	public void afterMethod() {
		BaseClass.close();
		System.out.println("Facebook afterMethod");
	}

	@Test(dataProvider = "FacebookData", groups= {"PM"})
	public void validLogin(String username, String password) throws IOException {

		FacebookPage fb = new FacebookPage();

		String facebookUrl = BaseClass.readProperty(
				"C:\\Users\\mmahe\\Downloads\\TestNGProject\\src\\test\\resources\\file.properties",
				"FacebookUrl");
		BaseClass.launchUrl(facebookUrl);

		fb.Email.sendKeys(username);
		fb.Password.sendKeys(password);
		fb.Login.click();
		
		//Assert.assertTrue(false);

	}

	@DataProvider(name = "FacebookData")
	public Object[][] fbData() {
		return new Object[][] { { "Mahe", "@154251" }, { "Javeed", "Test21515" }, { "Maha", "514551" } };
	}

	@Test
	public void execute() {
		System.out.println("FaceBook second method Executed");
	}


}
