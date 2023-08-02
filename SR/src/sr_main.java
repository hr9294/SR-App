import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class sr_main {
	
	static Object driverMethod() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability("appPackage", "com.sslwireless.srapp");
		dc.setCapability("appActivity", "com.sslwireless.srapp.view.activity.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<MobileElement> dr = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(5000);
		
		return dr;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Getting Driver
		@SuppressWarnings("unchecked")
		AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) driverMethod();
			
		Scanner sc = new Scanner(System.in);
		
		//Login
		sr_login.main(driver, sc);
		
				
		boolean flag = true;
				
		while (flag) {
					
			System.out.println("For Shop Visit, Please Enter: 1");
			System.out.println("For Order Taking, Please Enter: 2");
			System.out.println("For Add New Retailer, Please Enter: 3");
			System.out.println("For Getting Reports, Please Enter: 4");
			System.out.println("For Delivery Confirmation, Please Enter: 5");
			System.out.println("For Profile Management, Please Enter: 0");
			System.out.println("Please Enter your choise: \n");
						
			String ch = sc.nextLine();
			//String ch = "1";
			
			try {
				int int_ch = Integer.parseInt(ch);
						
				switch (int_ch) {
				    	
				case 1:
					sr_shop_visit.main(driver, sc);
					break;
				    
				case 2:
					sr_order_taking.main(driver, sc);
					sr_order_pending_recommended.main(driver);
					break;
							
				case 3:
					sr_add_new_retailer.main(driver, sc);
					break;
							
				case 4:
					System.out.println("Under Development\n");
					break;
					
				case 5:
					sr_delivery_confirmation.main(driver, sc);
					break;
					
				case 0:
					break;
				    
				default:
					System.out.println("Sorry. You put Wrong Value\n");
					break;
				}	
			}
			catch(NumberFormatException e) {
				System.out.println("Sorry. You put Wrong Value\n");
			}
					
			System.out.println("Welcom Again to The Easy SR App");
			System.out.println("Want to do another operation?");
			System.out.println("If \"YES\", please enter: \"1\" ");
			System.out.println("Otherwise, please enter: \"0\" ");
			System.out.println("Please Enter your choise: \n");
					
			String ch2 = sc.nextLine();
					
			try {
				int int_ch2 = Integer.parseInt(ch2);
						
				if (int_ch2==1) {
					flag = true;
				}
				else {
					
					flag = false;
					System.out.println("Thanks for being with Us");
					break;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Sorry. You put Wrong Value");
			}
		}
		
		driver.quit();
		sc.close();
		System.exit(0);

	}
}
