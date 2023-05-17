package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement Email;
	
	@FindBy(id="pass")
	public WebElement Password;
}
