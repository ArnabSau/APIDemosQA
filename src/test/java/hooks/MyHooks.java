package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;
import helper.AppiumServerManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class MyHooks extends BaseClass {

	// Start the server
	@BeforeAll(order = 1)
	public static void start() {
		log.info("Appium server start");
		AppiumServerManager.startServer();
	}

	@After
	public static void stop(Scenario result) {
		log.info("Driver close");
		
		if (result.isFailed()== true) 
		{
			
			TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            result.attach(src, "image/png", "screenshot");
            log.info(result.getName()+" failed");
		}
		driver.quit();
	}

	// Close the server
	@AfterAll
	public static void close() {
		log.info("Appium server stop");
		AppiumServerManager.closeServer();
	}

}
