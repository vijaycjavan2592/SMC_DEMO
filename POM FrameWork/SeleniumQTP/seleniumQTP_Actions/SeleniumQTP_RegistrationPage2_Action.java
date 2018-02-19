package seleniumQTP_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumQTP_Locators.SeleniumQTP_RegistrationPage1_Locators;
import seleniumQTP_Locators.SeleniumQTP_RegistrationPage2_Locators;

import commonFunction.WebButton;
import commonFunction.WebTextBox;

public class SeleniumQTP_RegistrationPage2_Action {
	WebDriver driver = null;
	WebElement ele = null;
	
	public SeleniumQTP_RegistrationPage2_Action(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void enterFirstName(String firstName){
		SeleniumQTP_RegistrationPage2_Locators reg2PL =
				new SeleniumQTP_RegistrationPage2_Locators(driver);
		ele = reg2PL.getName();
		if(ele!=null){
			WebTextBox.sendInput(ele, firstName);
		}
	}
	
	
	public void enterLastName(String lastName){
		SeleniumQTP_RegistrationPage2_Locators reg2PL =
				new SeleniumQTP_RegistrationPage2_Locators(driver);
		ele = reg2PL.getLastName();
		if(ele!=null){
			WebTextBox.sendInput(ele, lastName);
		}
	}
	
	public void enterEmailID(String emailID){
		SeleniumQTP_RegistrationPage2_Locators reg2PL =
				new SeleniumQTP_RegistrationPage2_Locators(driver);
		ele = reg2PL.getEmailID();
		if(ele!=null){
			WebTextBox.sendInput(ele, emailID);
		}
	}
	
	public void enterMobileNumber(String mobileNumber){
		SeleniumQTP_RegistrationPage2_Locators reg2PL =
				new SeleniumQTP_RegistrationPage2_Locators(driver);
		ele = reg2PL.getMobileNumber();
		if(ele!=null){
			WebTextBox.sendInput(ele, mobileNumber);
		}
	}
	
	public void clickNextButton(){
		SeleniumQTP_RegistrationPage2_Locators reg2PL =
				new SeleniumQTP_RegistrationPage2_Locators(driver);
		ele = reg2PL.getNextButton();
		if(ele!=null){
			WebButton.click(ele);
		}
	}
	
	
	
	

}
