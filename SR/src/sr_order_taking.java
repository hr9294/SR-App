import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_order_taking {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException, IOException {
		
		//Navigate to Order Taking
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.ImageView").click();
		Thread.sleep(1000);
		
		boolean r = sr_select_retailer.main(driver, sc);
		Thread.sleep(1000);
		
		if (r) {
			System.out.println("Back to Home");
			Thread.sleep(3000);
			
			driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
			Thread.sleep(2000);
		}
		
		else {
		
			boolean flag = true;
			
			while(flag) {
				
				sr_select_product.main(driver, sc);
				Thread.sleep(1000);
				
				System.out.println("Want to do add another product?");
				System.out.println("If \"YES\", please enter: \"1\" ");
				System.out.println("Otherwise, please enter: \"0\" ");
				System.out.println("Please Enter your choise: \n");
						
				String ch2 = sc.nextLine();
						
				try {
					int int_ch2 = Integer.parseInt(ch2);
							
					if (int_ch2==1) {
						flag = true;
					}
					else if (int_ch2==0){
						flag = false;
						break;
					}
					else {
						System.out.println("Sorry. You put Wrong Value");
					}
				}
				catch(NumberFormatException e) {
					System.out.println("Sorry. You put Wrong Value");
				}
			}
			
			//Order Details
			driver.findElementById("com.sslwireless.srapp:id/btnViewDetails").click();
			Thread.sleep(1000);
			
			//Give Discount
			driver.findElementById("com.sslwireless.srapp:id/tvDiscount").click();
			Thread.sleep(1000);
			
			MobileElement discount = driver.findElementById("com.sslwireless.srapp:id/etDiscount");
			Thread.sleep(1000);
			
			System.out.println("Please Enter Discount Amount: ");
			String discount_value = sc.nextLine();
			discount.setValue(discount_value);
			
			//Order Details
			driver.findElementById("com.sslwireless.srapp:id/btnProceed").click();
			Thread.sleep(1000);
			
			//Proceed Order
			driver.findElementById("com.sslwireless.srapp:id/btnProceedToOrder").click();
			Thread.sleep(1000);
	
			List<String> v = new ArrayList<String>();
			v.add("com.sslwireless.srapp:id/md_button_positive");
			String t = "Id";
			
			implicity.main(driver, v, t);
			Thread.sleep(2000);
			
			driver.findElementById("com.sslwireless.srapp:id/btnDone").click();
			Thread.sleep(2000);
	
		}
	}
}