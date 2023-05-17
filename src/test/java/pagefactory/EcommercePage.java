package pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class EcommercePage extends BaseClass {
	public EcommercePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "autosuggest")
	public WebElement country;

	@FindBy(xpath = "//*[@value='RoundTrip']")
	public WebElement RoundTrip;

	@FindBy(xpath = "(//*[@class='select_CTXT'])[1]")
	public WebElement from;

	@FindBy(xpath = "//*[@text='Bengaluru (BLR)']")
	public WebElement fromLocation;

	@FindBy(xpath = "(//*[@text='Chennai (MAA)'])[2]")
	public WebElement toLocation;

	@FindBy(xpath = "(//*[@data-handler ='selectDay'])[1]")
	public WebElement departDate;

	@FindBy(id = "hrefIncAdt")
	public WebElement adults;

	@FindBy(id = "divpaxinfo")
	public WebElement passengers;

	@FindBy(id = "btnclosepaxoption")
	public WebElement done;

	@FindBy(xpath = "//*[@id='ctl00_mainContent_DropDownListCurrency']")
	public WebElement currency;

	@FindBy(xpath = "(//*[@value='Search'])[1]")
	public WebElement search;

	@FindBy(xpath = "//*[@id='ctl00_mainContent_chk_StudentDiscount']")
	public WebElement student;

}



