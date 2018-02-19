package commonFunction;

import org.openqa.selenium.WebDriver;

public class WebBrowser {
	
	public static void openBrowser(WebDriver driver , String url){
		driver.get(url);
	}

}
