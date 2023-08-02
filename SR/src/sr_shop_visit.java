//import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_shop_visit {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException, IOException {
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.ImageView").click();
		Thread.sleep(2000);
		
		//Select Retailer
		boolean r = sr_select_retailer.main(driver, sc);
		Thread.sleep(1000);
		
		if (r) {
			System.out.println("Back to Home");
			Thread.sleep(3000);
			
			driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
			Thread.sleep(2000);
		}
		
		else {
			
			driver.findElementById("com.sslwireless.srapp:id/ivUploadRetailsPhoto").click();
			Thread.sleep(2000);
			
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
			Thread.sleep(2000);
			
			driver.findElementById("com.sslwireless.srapp:id/fabCamera").click();
			Thread.sleep(5000);
			
			/*/Save Captured image
			MobileElement image = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");		
			Thread.sleep(1000);
			
			int i=1;
			
			File srcFile = image.getScreenshotAs(OutputType.FILE);
			
			String p = "D:\\QA\\App\\Appium\\Code\\SR\\src\\img\\";
	        File targetFile = new File(p + "shop" +i+".jpg");
	        
	        String fn = null;
	        boolean flag = true;
	        
			while(targetFile.exists()) {

		        fn = p + "shop" +Integer.toString(i+1);
		       	File targetFile1 = new File(fn+".jpg");

				i++;
	        }
	        
	        //File targetFile2 = new File(fn+".jpg");

			//FileUtils.copyFile(srcFile, targetFile2);
			
			*/

			//Submit Shop Visit
			List<String> v = new ArrayList<String>();
			v.add("com.sslwireless.srapp:id/btnSubmit");
			String t = "Id";
			implicity.main(driver, v, t);
			Thread.sleep(1000);
			
		}
		
	}
}
