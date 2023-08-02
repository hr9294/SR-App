import java.util.List;
import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_delivery_confirmation {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[5]/android.widget.ImageView").click();
		Thread.sleep(3000);
		
		//Select DeliveryMan
		driver.findElementById("com.sslwireless.srapp:id/ivRight").click();
		Thread.sleep(2000);
		
		//Select Order
		List<MobileElement> retailers = (List<MobileElement>) driver.findElementsById("com.sslwireless.srapp:id/tvTitle");
		Thread.sleep(1000);
		
		for(int i=0; i<retailers.size(); i++) {
			int j = i+1;
			System.out.println("Select "+ j + " for: " + retailers.get(i).getText());
		}
		
		System.out.println("Please Enter your choise: ");
		String ch2 = sc.nextLine();
		//String ch2 = "1";
		
		try {
			int int_ch2 = Integer.parseInt(ch2);
					
			if (int_ch2>=1 && int_ch2<=retailers.size()) {
				int r = int_ch2 - 1;
				retailers.get(r).click();
				Thread.sleep(2000);
			}
			else {
				System.out.println("Sorry. You put Wrong Value");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry. You put Wrong Value");
		}
		
		//Confirm Delivery
		driver.findElementById("com.sslwireless.srapp:id/btnConfirmDelivery").click();
		Thread.sleep(2000);
		
		//Confirm Delivery
		driver.findElementById("com.sslwireless.srapp:id/md_button_positive").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
		Thread.sleep(2000);

	}
}
