import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class implicity {
	public static void main(AndroidDriver<MobileElement> driver, List<String> x, String t){
		
		MobileElement y;
		
		try {
			if (t == "Id"){
				y = driver.findElementById((String) x.get(0));
			}
			else {
				y = driver.findElementByXPath((String) x.get(0));
			}

			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOf(y));
			y.isDisplayed();
			y.click();
		}
		catch(Exception e){
		     System.out.println("Server time exceeds");
		}
	}
}

/*
 * Check Element by Id/XPath:
 * 
 * 		List<String> v = new ArrayList<String>();
 * 		v.add("Id/XPath");
 * 
 * 		String t = "Id/XPath";
 * 
 * 		implicity.main(driver, v, t);
 * 
 */
