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

public class MediaPlayer extends Screensbase{
	static Logger logger= LogManager.getLogger(MainScreen.class);  
	AppiumDriver <MobileElement> driver;
	public MediaPlayer(AppiumDriver<MobileElement> driver1) {
		super(driver1);
		this.driver=driver1;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
	public RemoteWebElement MediaPlayer_Btn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")
	public RemoteWebElement Video_Btn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public RemoteWebElement check1;
	public void MediaPlayerButton() throws InterruptedException{
		MediaPlayer_Btn.click();
		Thread.sleep(2000);
	}
	public void VideoButton() throws InterruptedException{
		Video_Btn.click();
		Thread.sleep(2000);
	}
	public String Check1assert() {
		String text="";
		text=check1.getText();
		return text;
	}

}
