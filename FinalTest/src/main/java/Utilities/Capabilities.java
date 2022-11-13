package Utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import Base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Capabilities extends Base{
	public static AppiumDriver<MobileElement> driver;
	static String platformVersion=prop.getProperty("plateformVersion");
    static String platformName=prop.getProperty("plateformName");
    static String AppPackage=prop.getProperty("appPackage");
    static String AppActivity=prop.getProperty("appActivity");
    static String App=prop.getProperty("path");
    static String deviceName=prop.getProperty("deviceName");
	public void setup() {
		DesiredCapabilities capabilites=new DesiredCapabilities();
		capabilites.setCapability("platformVersion", platformVersion);
		capabilites.setCapability("platformName", platformName);
		capabilites.setCapability("appPackage", AppPackage);
		capabilites.setCapability("appActivity", AppActivity);
		capabilites.setCapability("app", App);
		capabilites.setCapability("deviceName", deviceName);
		capabilites.setCapability("isHeadless", true);
		try {
			driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilites);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
