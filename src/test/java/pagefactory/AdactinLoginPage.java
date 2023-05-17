package pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

	public class AdactinLoginPage extends BaseClass {
		public AdactinLoginPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "username")
		public WebElement username;

		@FindBy(id = "password")
		public WebElement password;

		@FindBy(id = "login")
		public WebElement login;

		@FindBy(id = "location")
		public WebElement location;

		@FindBy(id = "hotels")
		public WebElement hotels;

		@FindBy(xpath = "//*[@id='room_type']")
		public WebElement roomType;

		@FindBy(xpath = "//*[@id='username_show']")
		public WebElement WelcomeUser;

		@FindBy(xpath = "//*[@class='auth_error']")
		public WebElement InvalidUserError;

		@FindBy(xpath = "//*[@id='password_span']")
		public WebElement EmptyPasswordError;

		@FindBy(xpath = "(//*[text()='Change Password'])[1]")
		public WebElement changePassword;

		@FindBy(xpath = "//*[text()='Logout']")
		public WebElement logOut;

		@FindBy(linkText = "Click here to login again")
		public WebElement loginAgain;

		@FindBy(id = "Submit")
		public WebElement search;

		@FindBy(xpath = "//*[@id='location_span']")
		public WebElement LocationError;

		@FindBy(id = "room_nos")
		public WebElement NoOfRooms;

		@FindBy(id = "datepick_in")
		public WebElement CheckInDate;

		@FindBy(id = "datepick_out")
		public WebElement CheckOutDate;

		@FindBy(className = "search_combobox")
		public WebElement Adults;

		@FindBy(id = "child_room")
		public WebElement Child;

		@FindBy(id = "continue")
		public WebElement Continue;

		@FindBy(id = "radiobutton_0")
		public WebElement SelectingHotel;

		@FindBy(id = "first_name")
		public WebElement FirstName;

		@FindBy(id = "last_name")
		public WebElement LastName;

		@FindBy(id = "address")
		public WebElement BillingAddress;

		@FindBy(id = "cc_num")
		public WebElement CreditCard;

		@FindBy(id = "cc_type")
		public WebElement CreditCardType;

		@FindBy(id = "cc_exp_month")
		public WebElement ExpiryMonth;

		@FindBy(id = "cc_exp_year")
		public WebElement ExpiryYear;

		@FindBy(id = "cc_cvv")
		public WebElement CVV;

		@FindBy(id = "book_now")
		public WebElement BookNow;

		@FindBy(id = "order_no")
		public WebElement OrderNo;

		@FindBy(xpath = "//*[text()='Booking Confirmation ']")
		public WebElement BookingConfirmation;

	}


