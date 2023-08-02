import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class sr_order_pending_recommended {

	public static void main(AndroidDriver<MobileElement> driver) throws InterruptedException {
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[4]/android.widget.ImageView").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.ImageView[2]").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/recommendedOrderBtt").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/md_button_positive").click();
		Thread.sleep(5000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.sslwireless.srapp:id/btnBack1").click();
		Thread.sleep(2000);

	}
}
