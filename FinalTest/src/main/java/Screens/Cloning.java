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

public class Cloning extends Screensbase{
	static Logger logger= LogManager.getLogger(MainScreen.class);  
	AppiumDriver <MobileElement> driver;
	public Cloning(AppiumDriver<MobileElement> driver1) {
		super(driver1);
		this.driver=driver1;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")
	public RemoteWebElement Cloning_Btn;
	@FindBy(id="startButton")
	public RemoteWebElement Run_Btn;
	public void Cloning1() throws Exception {
		Cloning_Btn.click();
		Thread.sleep(1000);
	}
	public void Run() throws Exception {
		Run_Btn.click();
		Thread.sleep(2000);
	}
}
