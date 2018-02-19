package commonFunction;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  public WebDriver driver  = null;
  String url = "https://seleniumqtpautomation.000webhostapp.com/final.html";
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "E:/Jar Files/Geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WebBrowser.openBrowser(driver, url);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

