package StepDefination;

import Screens.Cloning;
import Screens.Hide_Show_Screen;
import Screens.MainScreen;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AnimationTab extends Capabilities{
//	Capabilities obj=new Capabilities();
//	AppiumDriver <MobileElement> driver;
	MainScreen obj1;
	Hide_Show_Screen obj2;
	Cloning obj3;
//	@Before
//	public void start() {
//		driver=obj.setup();
//	}
	@Given("User click on animation tab")
	public void user_click_on_animation_tab() throws InterruptedException {
	   obj1=new MainScreen(driver);
	   obj1.click_btn();
	   obj2=new Hide_Show_Screen(driver);
	   obj2.Animation_Btn();
	}

	@When("User click on hide show")
	public void user_click_on_hide_show() throws InterruptedException {
		obj2.Hide_Show();
	}

	@When("User click on hide button and click on buttons")
	public void user_click_on_hide_button_and_click_on_buttons() throws InterruptedException {
		obj2.Hide();
	}

	@Then("user click on show")
	public void user_click_on_show() throws InterruptedException {
	    obj2.Show_Buttons();
	}
	
	
	@When("User click on Cloning")
	public void user_click_on_cloning() throws Exception {
		obj3=new Cloning(driver);
		obj3.Cloning1();
	}

	@Then("user click on run")
	public void user_click_on_run() throws Exception {
	    obj3.Run();
	}
//	@After
//	public void stop() {
//		driver.quit();
//	}

}
