package Utilities;

import Base.Base;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer{
	protected static AppiumDriverLocalService service;
	public static void startserver() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	public static void stopserver() {
		service.stop();
	}
}