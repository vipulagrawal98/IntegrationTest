package StepDefination;

import Screens.Arcs;
import Screens.MainScreen;
import Screens.Sweep;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GraphicTab extends Capabilities{
//	Capabilities obj=new Capabilities();
//	AppiumDriver <MobileElement> driver;
	MainScreen obj1;
	Arcs obj4;
	Sweep obj5;
//	@Before
//	public void start() {
//		driver=obj.setup();
//	}
	@Given("User click on graphic tab")
	public void user_click_on_graphic_tab() throws InterruptedException {
		obj1=new MainScreen(driver);
		obj1.click_btn();
		obj4=new Arcs(driver);
		obj4.GraphicsButton();
	}

	@When("User click on arcs")
	public void user_click_on_arcs() throws InterruptedException {
		obj4.ArcsButton();
	}
	@When("User click on sweep")
	public void user_click_on_sweep() throws InterruptedException {
		obj5=new Sweep(driver);
		obj5.SweepButton();
	}
//	@After
//	public void stop() {
//		driver.quit();
//	}
}
