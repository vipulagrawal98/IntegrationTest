package Runner;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.AppiumServer;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features={"./src/test/java/Features/AnimationTab.feature","./src/test/java/Features/GraphicTab.feature","./src/test/java/Features/MediaTab.feature"},
        glue="StepDefination"
    )
public class Runner extends AbstractTestNGCucumberTests{
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.xml";
		Configurator.initialize(null, log4jConfigFile);
		}
	public static Logger log = LogManager.getLogger(Runner.class);
	@BeforeSuite
    public void setup() {
        AppiumServer.startserver();
        log.info("Appium Server started");
        extent = new ExtentReports("./reports/ExtentReport.html");
    }
    @BeforeMethod
    public void startTest(Method name) {
        String testname = name.getName();
        extentTest = extent.startTest(testname);
    }
    @AfterMethod
    public void atestCaseResult(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {



           extentTest.log(LogStatus.FAIL, "Test Case Failed ");
        } else {
            if (result.getStatus() == ITestResult.SUCCESS) {
                extentTest.log(LogStatus.PASS, "Test case passed successfully");
           }
        }
    }
    @AfterMethod
    public void endTest() {
        extent.endTest(extentTest);
    }
    @AfterSuite
    public void Teardown() {
        log.info("Appium server stopped");
        AppiumServer.stopserver();
        extent.flush();
        extent.close();
    }
}
