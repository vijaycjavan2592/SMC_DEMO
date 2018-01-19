package assignment_6;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class MercuryregisterPage {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:/Jar Files/Geckodriver/geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		System.out.println(driver.getTitle());

	//Enter First Name	
		driver.findElement(By.name("firstName")).sendKeys("Vijay");
		
	//Enter Last Name
		driver.findElement(By.name("lastName")).sendKeys("Chavan");
		
	//Enter Phone Number
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		
	//Enter Email id
		driver.findElement(By.id("userName")).sendKeys("vijaychavan007@gmail.com");
		
	//Enter Address
		driver.findElement(By.name("address1")).sendKeys("Pune");
		
	//Enter City
		driver.findElement(By.name("city")).sendKeys("Pune");
		
	//Enter state
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
	//Enter Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("411041");
		
		Thread.sleep(2000);
	//Select Country
		//WebElement country = driver.findElement(By.name("country"));
		Select se = new Select(driver.findElement(By.className("country")));	
		se.selectByIndex(7);
		
		
		
		

	}

}
