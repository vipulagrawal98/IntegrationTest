package StepDefination;

import Utilities.Capabilities;
import Runner.Runner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Capabilities{
	@Before
	public void start() {
		Runner.log.info("Device is initialized");
		setup();
	}
	@After
	public void stop() {
		Runner.log.info("Device is stopped");
		driver.quit();
	}
}
