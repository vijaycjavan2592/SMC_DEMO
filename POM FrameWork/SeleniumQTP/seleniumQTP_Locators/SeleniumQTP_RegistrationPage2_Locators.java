package seleniumQTP_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_RegistrationPage2_Locators {
	
	WebDriver driver = null;
	
	public SeleniumQTP_RegistrationPage2_Locators(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "First_Name")
	private WebElement name;
	
	public  WebElement getName(){
		return name;
	}
	
	@FindBy(name = "Last_Name")
	private WebElement lastName;
	
	public WebElement getLastName(){
		return lastName;
	}
	
	@FindBy(name = "Email_Id")
	private WebElement emailID;
	
	public WebElement getEmailID(){
		return emailID;
	}
	
	@FindBy(name = "Mobile_Number")
	private WebElement mobileNumber;
	
	public WebElement getMobileNumber(){
		return mobileNumber;
	}
	
	@FindBy(name = "insert")
	private WebElement nextButton;
	
	public WebElement getNextButton(){
		return nextButton;
	}

}
