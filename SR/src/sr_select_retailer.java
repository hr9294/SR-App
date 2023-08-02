import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sr_select_retailer {

	public static boolean main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException, IOException {
		
		boolean r_flag = false;
		boolean t = true;
		
		while (t) {
			
			System.out.println("For Scheduled Shop List, Please Enter: 1");
			System.out.println("For UnScheduled Shop List, Please Enter: 2");
			System.out.println("Please Enter your choise: ");
			
			String ch = sc.nextLine();
			//String ch = "2";
			
			try {
				int int_ch = Integer.parseInt(ch);
						
				if (int_ch==1) {
					List<MobileElement> retailers = (List<MobileElement>) driver.findElementsById("com.sslwireless.srapp:id/tvTitle");
					Thread.sleep(1000);
					
					if (retailers.isEmpty()) {
						r_flag = true;
						System.out.println("No Retailer Found");
					}
					
					else {
						
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
								r_flag = true;
								System.out.println("Sorry. You put Wrong Value");
							}
						}
						catch(NumberFormatException e) {
							r_flag = true;
							System.out.println("Sorry. You put Wrong Value");
						}	
					}
				}
				
				else if (int_ch==2){
					driver.findElementById("com.sslwireless.srapp:id/btnUnScheduled").click();
					Thread.sleep(2000);
					
					List<MobileElement> retailers = (List<MobileElement>) driver.findElementsById("com.sslwireless.srapp:id/tvTitle");
					Thread.sleep(1000);
					
					
					if (retailers.isEmpty()) {
						r_flag = true;
						System.out.println("No Retailer Found");
					}
					
					else {
						
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
								r_flag = true;
								System.out.println("Sorry. You put Wrong Value");
							}
						}
						catch(NumberFormatException e) {
							r_flag = true;
							System.out.println("Sorry. You put Wrong Value");
						}	
					}
				}
				
				else {
					System.out.println("Sorry. You put Wrong Value");
					r_flag = true;
				}
			}
			
			catch(NumberFormatException e) {
				System.out.println("Sorry. You put Wrong Value");
				r_flag = true;
			}
			
			if (r_flag == true)
			{
				System.out.println("Want to do again?");
				System.out.println("If \"YES\", please enter: \"1\" ");
				System.out.println("Otherwise, please enter: \"0\" ");
				System.out.println("Please Enter your choise: \n");
						
				String ch2 = sc.nextLine();
						
				try {
					int int_ch2 = Integer.parseInt(ch2);
							
					if (int_ch2==1) {
						t = true;
					}
					else if (int_ch2==0) {
						
						t = false;
						System.out.println("Thanks for being with Us");
						break;
					}
					else {
						t = false;
						System.out.println("Sorry. You put Wrong Value");
					}
				}
				catch(NumberFormatException e) {
					t = false;
					System.out.println("Sorry. You put Wrong Value");
				}
			}
			else {
				t = false;
			}
		}
		
	return r_flag;

	}
}
