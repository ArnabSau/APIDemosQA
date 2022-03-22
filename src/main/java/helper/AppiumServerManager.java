package helper;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServerManager {

	public static AppiumDriverLocalService service;

	// Start the Appium server
	public static void startServer() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	// Close the Appium server
	public static void closeServer() {
		service.stop();
	}

}
