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

public class Hide_Show_Screen extends Screensbase{
	static Logger logger= LogManager.getLogger(MainScreen.class);  
	AppiumDriver <MobileElement> driver;
	public Hide_Show_Screen(AppiumDriver<MobileElement> driver1) {
		super(driver1);
		this.driver=driver1;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
	public RemoteWebElement AnimationButton;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[7]")
	public RemoteWebElement Hide_Show_Animation;
	@FindBy(id="hideGoneCB")
	public RemoteWebElement Hide_Btn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public RemoteWebElement Btn1;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public RemoteWebElement Btn2;
	@FindBy(id="addNewButton")
	public RemoteWebElement Show_Btn;
	public void Animation_Btn() throws InterruptedException{
		AnimationButton.click();
		Thread.sleep(2000);
	}
	public void Hide_Show() throws InterruptedException{
		Hide_Show_Animation.click();
		Thread.sleep(2000);
	}
	public void Hide() throws InterruptedException{
	Hide_Btn.click();
	Thread.sleep(1000);
	Btn1.click();
	Thread.sleep(1000);
	Btn2.click();
	Thread.sleep(1000);
	}
	public void Show_Buttons() throws InterruptedException{
		Show_Btn.click();
		Thread.sleep(2000);
	}
	
}
