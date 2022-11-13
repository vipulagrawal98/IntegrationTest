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

public class Audiofx extends Screensbase{
	static Logger logger= LogManager.getLogger(MainScreen.class);  
	AppiumDriver <MobileElement> driver;
	public Audiofx(AppiumDriver<MobileElement> driver1) {
		super(driver1);
		this.driver=driver1;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[7]")
	public RemoteWebElement Media_Btn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]")
	public RemoteWebElement Audiofx_Btn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public RemoteWebElement check1;
	public void MediaButton() throws InterruptedException{
		Media_Btn.click();
		Thread.sleep(2000);
	}
	public void AudiofxButton() throws InterruptedException{
		Audiofx_Btn.click();
		Thread.sleep(2000);
	}
	public String Check1assert() {
		String text="";
		text=check1.getText();
		return text;
	}
	
	
}
