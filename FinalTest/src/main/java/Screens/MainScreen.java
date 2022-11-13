package Screens;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.Screensbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainScreen extends Screensbase{
	static Logger logger= LogManager.getLogger(MainScreen.class);  
	AppiumDriver <MobileElement> driver;
	public MainScreen(AppiumDriver<MobileElement> driver1) {
		super(driver1);
		this.driver=driver1;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public RemoteWebElement continueButton;
	@FindBy(id="android:id/button1")
	public RemoteWebElement okButton;
	@FindBy(id="buttonDefaultPositive")
	public RemoteWebElement okTwo;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
	public RemoteWebElement ApiDemos;
	public void click_btn() throws InterruptedException {
		continueButton.click();
		Thread.sleep(2000);
		okButton.click();
		Thread.sleep(2000);
		okTwo.click();
		Thread.sleep(1000);
		ApiDemos.click();
		Thread.sleep(1000);
		
	}
}
