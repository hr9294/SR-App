import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_add_new_retailer {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[3]/android.widget.ImageView").click();
		Thread.sleep(2000);
		
		//Retailer Name
		System.out.println("Retailer Name: ");
		String r_name = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evRetailerName").setValue(r_name);
		Thread.sleep(1000);
		
		//Retailer Owner Name
		System.out.println("Retailer Owner Name: ");
		String rw_name = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evName").setValue(rw_name);
		Thread.sleep(1000);
		
		//Mobile No
		System.out.println("Mobile No.: ");
		String r_mobile_no = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evRetailerMobileNo").setValue(r_mobile_no);
		Thread.sleep(1000);
		
		//Location
		System.out.println("Location Address: ");
		String location = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evAddress").setValue(location);
		Thread.sleep(1000);
				
		//NID
		System.out.println("NID: ");
		String nid = sc.nextLine();
		driver.findElementById("com.sslwireless.srapp:id/evNid").setValue(nid);
		Thread.sleep(1000);
		
		//Route
		System.out.println("Select Route: ");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]").click();
		sr_select.main(driver, sc, "com.sslwireless.srapp:id/md_title");
		
		Thread.sleep(3000);
		scroll_down.main(driver);
		Thread.sleep(3000);
		
		//Retailer Type
		System.out.println("Select Retailer Type: ");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]").click();
		sr_select.main(driver, sc, "com.sslwireless.srapp:id/md_title");
		Thread.sleep(3000);
		
		//Retailer Position
		System.out.println("Select Retailer Position: ");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[3]").click();
		sr_select.main(driver, sc, "com.sslwireless.srapp:id/md_title");
		
		//Retailer Category
		System.out.println("Select Retailer Category: ");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[4]").click();
		sr_select.main(driver, sc, "com.sslwireless.srapp:id/md_title");
		
		//KFIL Freeze
		System.out.println("Number of KFIL Freeze: ");
		String kfil = sc.nextLine();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText").setValue(kfil);
		Thread.sleep(2000);
				
		//Competitor's Freeze
		System.out.println("Number of Competitor\'s Freeze: ");
		String competitor = sc.nextLine();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText").setValue(competitor);
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnContinue").click();
		Thread.sleep(5000);

		scroll_down.main(driver);
		Thread.sleep(3000);
		
		driver.findElementById("com.sslwireless.srapp:id/ivUploadRetailsPhoto").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/fabCamera").click();
		Thread.sleep(5000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnAddNow").click();
		Thread.sleep(3000);
		
		Thread.sleep(1000);
		
	}
}
