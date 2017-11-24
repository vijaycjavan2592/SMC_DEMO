package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PlanYourTrip {
	
WebDriver driver;
	
	@FindBy (id = "ContentPlaceHolder1_ddlOriginStop_chosen")
	public WebElement clkOnOriginStop;
	
	@FindBy (xpath = "//li[@class='active-result']")
	public List<WebElement> selectOriginStop;
	
	
	@FindBy (id = "ContentPlaceHolder1_ddlDestiStop_chosen")
	public WebElement clkOnDestinationStop;
	
	@FindBy (xpath = "//li[@class='active-result']")
	public List<WebElement> selectDestinationStop;
	
	
	@FindBy (id = "ContentPlaceHolder1_btnFndRoute")
	public WebElement clkOnFindRoutes;
	
	
	public PlanYourTrip(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setclkOnOriginStop(){
		clkOnOriginStop.click();
	}
	
	public void setSelectOriginStop(String origin){
		System.out.println("Size is " +selectOriginStop.size());
		  for(WebElement opt : selectOriginStop){
			  if(opt.getText().equals(origin)){
				  opt.click();
				  break;
			  }
		  }
	
	}
	
	
	public void setclkOnDestinationStop(){
		clkOnDestinationStop.click();
	}
	
	public void setSelectDestinationStop(String destination){
		System.out.println("Destination stop size is " +selectDestinationStop.size());
		for(WebElement opt1 : selectDestinationStop){
			if(opt1.getText().equals(destination)){
				opt1.click();
				break;
			}
		}
		
	}
	
	public void setclkOnFindRoutes(){
		clkOnFindRoutes.click();
	}
	
	

}
