package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class FacebookPage extends BaseClass{

	public FacebookPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	public WebElement Email;

	@FindBy(id = "pass")
	public WebElement Password;

	@FindBy(name = "login")
	public WebElement Login;

	@FindBy(xpath = "//*[@class='_9ay7']")
	public WebElement ErrorMsg;

}
