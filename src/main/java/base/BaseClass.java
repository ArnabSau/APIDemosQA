package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.ConfigReader;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver = null;
	public static Logger log = LogManager.getLogger(BaseClass.class);

	// Setup the driver
	public void setup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformVersion", ConfigReader.getPlatformVersion());
		capabilities.setCapability("platformName", ConfigReader.getPlatformName());
		capabilities.setCapability("appPackage", ConfigReader.getAppPackage());
		capabilities.setCapability("appActivity", ConfigReader.getAppActivity());
		capabilities.setCapability("app", ConfigReader.getApp());
		capabilities.setCapability("deviceName", ConfigReader.getDeviceName());
		if(ConfigReader.getHeadless().equals("true")) {
			capabilities.setCapability("isHeadless", true);
			capabilities.setCapability("avdArgs", "-no-window");
		}

		try {
			driver = new AndroidDriver<MobileElement>(new URL(ConfigReader.getHost()), capabilities);
			driver.manage().timeouts().implicitlyWait(ConfigReader.getImplicitlyWait(), TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
