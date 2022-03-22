package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	// Giving path to the data.properties file
	static File configFile = new File("./src/main/resources/config.properties");
	static FileInputStream configFis = null;
	private static Properties prop = new Properties();

	static {

		try {
			configFis = new FileInputStream(configFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			prop.load(configFis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getPlatformVersion() {
		return prop.getProperty("platformVersion");
	}

	public static String getPlatformName() {
		return prop.getProperty("platformName");
	}

	public static String getAppPackage() {
		return prop.getProperty("appPackage");
	}

	public static String getAppActivity() {
		return prop.getProperty("appActivity");
	}

	public static String getApp() {
		return prop.getProperty("app");
	}

	public static String getDeviceName() {
		return prop.getProperty("deviceName");
	}

	public static String getHost() {
		return prop.getProperty("host");
	}
	
	public static int getImplicitlyWait() {
		return Integer.parseInt(prop.getProperty("implicitlyWait"));
	}
	public static String getHeadless() {
		return prop.getProperty("headless");
	}


}
