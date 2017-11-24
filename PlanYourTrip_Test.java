package Testsrc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PlanYourTrip;

public class PlanYourTrip_Test {


	WebDriver driver;
	
	static String url = "http://my.sitilink.in";
	
	@BeforeTest
	public void browser(){
	System.setProperty("webdriver.gecko.driver", "D:/Jar files/ChromeDriver/chromedriver_win32/chromedriver.exe");
    driver = new FirefoxDriver();
    
    driver.get(url);
    
	}
	
	@Test
	public void test() throws InterruptedException{    
    System.out.println(driver.getTitle());
    
    Thread.sleep(2000);
    
    PlanYourTrip trip = new PlanYourTrip(driver);
    
    trip.setclkOnOriginStop();
    
    trip.setSelectOriginStop("Adajan Gam Brts");
    
    Thread.sleep(2000);
    
    trip.setclkOnDestinationStop();
    
    trip.setSelectDestinationStop("Textile Market");
    
    Thread.sleep(2000);
    
    trip.setclkOnFindRoutes();
    
    WebElement el = driver.findElement(By.className("topText1"));
    
    System.out.println("Text is "+el.getText());

	}
}
