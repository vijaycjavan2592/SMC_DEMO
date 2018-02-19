package seleniumQTP_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Actions.SeleniumQTP_RegistrationPage2_Action;

public class SeleniumQTP_RegistrationPage2_Verification {
	
	WebDriver driver = null;
	SeleniumQTP_RegistrationPage2_Action regP2A = null;
	public SeleniumQTP_RegistrationPage2_Verification(WebDriver driver){
		this.driver = driver;
		regP2A = new SeleniumQTP_RegistrationPage2_Action(driver);		
	}
	
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public void verifyFirstNameEntered(String firstName){
		regP2A.enterFirstName(firstName);
	}
	
	public void verifyLastNameEntered(String lastName){
		regP2A.enterLastName(lastName);
	}
	
	public void verifyEmailIDEntered(String emailID){
		regP2A.enterEmailID(emailID);
	}
	
	public void verifyMobileNumberEntered(String mobileNumber){
		regP2A.enterMobileNumber(mobileNumber);
	}
	
	public void verifyNextClicked(){
		regP2A.clickNextButton();
	}
	
	public void verifyEnterPage2Details(String firstName, String lastName, String emailID, String mobileNumber){
		verifyFirstNameEntered(firstName);
		verifyLastNameEntered(lastName);
		verifyEmailIDEntered(emailID);
		verifyMobileNumberEntered(mobileNumber);
		verifyNextClicked();
		
		
		
	}
	
	

}
