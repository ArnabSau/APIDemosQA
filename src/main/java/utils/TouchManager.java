package utils;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.util.List;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TouchManager {
	
	private AppiumDriver<MobileElement> driver = null;

	public TouchManager(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	// This method help to scroll screen and takes end point and start point and
	// anchor
	public void scroll(double startper, double endper, double anchorper) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorper);
		int end = (int) (size.height * endper);
		int start = (int) (size.height * startper);
		new TouchAction(driver).press(point(anchor, start)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, end)).release().perform();
	}

	// To tap on a element
	public void tap(MobileElement ele) {
		new TouchAction(driver).tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();

	}
	
	public void enterText(String msg, MobileElement ele) {
		ele.clear();
		ele.sendKeys(msg);
	}
	
	public String getElementText(MobileElement ele) {
		return ele.getText();
	}
	
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();;
	}

}
