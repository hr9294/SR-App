import java.util.List;
import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_select {

public static void main(AndroidDriver<MobileElement> driver, Scanner sc, String x) throws InterruptedException {
		
		List<MobileElement> routes = (List<MobileElement>) driver.findElementsById(x);
		Thread.sleep(1000);
		
		for(int i=0; i<routes.size(); i++) {
			int j = i+1;
			System.out.println("Select "+ j + " for: " + routes.get(i).getText());
		}
		
		System.out.println("Please Enter your choice: ");
		String ch2 = sc.nextLine();
		
		try {
			int int_ch2 = Integer.parseInt(ch2);
					
			if (int_ch2>=1 && int_ch2<=routes.size()) {
				int r = int_ch2 - 1;
				routes.get(r).click();
				Thread.sleep(2000);
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