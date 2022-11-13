package StepDefination;

import Screens.Audiofx;
import Screens.MainScreen;
import Screens.MediaPlayer;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class MediaTab extends Capabilities{
//	Capabilities obj=new Capabilities();
//	AppiumDriver <MobileElement> driver;
	MainScreen obj1;
	Audiofx obj6;
	MediaPlayer obj7;
//	@Before
//	public void start() {
//		driver=obj.setup();
//	}
	@Given("User click on Media tab")
	public void user_click_on_media_tab() throws InterruptedException {
		obj1=new MainScreen(driver);
		obj1.click_btn();
		obj6=new Audiofx(driver);
		obj6.MediaButton();
	}

	@When("User click on Audiofx")
	public void user_click_on_audiofx() throws InterruptedException {
		obj6.AudiofxButton();
		Assert.assertEquals(obj6.Check1assert(), "Media/AudioFx");
		}
	@When("User click on MediaPlayer")
	public void user_click_on_media_player() throws InterruptedException {
		obj7=new MediaPlayer(driver);
	    obj7.MediaPlayerButton();
	    Assert.assertEquals(obj7.Check1assert(), "Media/MediaPlayer");
	}

	@When("User click on play video from localfile")
	public void user_click_on_play_video_from_localfile() throws InterruptedException {
	    obj7.VideoButton();
	}
//	@After
//	public void stop() {
//		driver.quit();
//	}
}
