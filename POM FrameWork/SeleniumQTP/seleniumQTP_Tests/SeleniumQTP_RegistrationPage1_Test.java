package seleniumQTP_Tests;

import junit.framework.Assert;

import org.testng.annotations.Test;

import commonFunction.BaseClass;

import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage1_Verification;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage2_Verification;

public class SeleniumQTP_RegistrationPage1_Test extends BaseClass{
  @Test
  public void succefullyNavigatePage1() {
	  SeleniumQTP_RegistrationPage1_Verification regPV =
			  new SeleniumQTP_RegistrationPage1_Verification(driver);
	  SeleniumQTP_RegistrationPage2_Verification regP2 =
			  regPV.verifyRegPage1DataEntered("user", "pass", "pass");
	  
	  Assert.assertEquals("Reg2", regP2.verifyTitle());
	  
	  regP2.verifyEnterPage2Details("abc", "xyz", "abc@gmail.com", "12334445");
	  
  }
}
