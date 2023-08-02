import java.util.List;
import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_select_product {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
		
		List<MobileElement> products = (List<MobileElement>) driver.findElementsById("com.sslwireless.srapp:id/tvTitle");
		Thread.sleep(1000);
		
		for(int i=0; i<products.size(); i++) {
			int j = i+1;
			System.out.println("Select "+ j + " for: " + products.get(i).getText());
		}
		
		System.out.println("Please Enter your choice: ");
		String ch2 = sc.nextLine();
		
		try {
			int int_ch2 = Integer.parseInt(ch2);
					
			if (int_ch2>=1 && int_ch2<=products.size()) {
				
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+int_ch2+"]/android.widget.ImageView").click();
				Thread.sleep(1000);
				
				MobileElement product = driver.findElementById("com.sslwireless.srapp:id/tvQty");
				System.out.println("Please Enter quantity: ");
				String product_quantity = sc.nextLine();
				product.setValue(product_quantity);
				Thread.sleep(1000);
				
				driver.findElementById("com.sslwireless.srapp:id/btnDone").click();
				Thread.sleep(1000);
				
			}
			else {
				System.out.println("Sorry. You put Wrong Value");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry. You put Wrong Value");
		}
	}
}
