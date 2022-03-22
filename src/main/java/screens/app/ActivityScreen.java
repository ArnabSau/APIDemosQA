package screens.app;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class ActivityScreen extends TouchManager {
	
	AppiumDriver<MobileElement> driver = null;

	public ActivityScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom Title\"]")
	private MobileElement customTitleButton;
	
	
	public void clickCustomTitleBtn() {
		tap(customTitleButton);
	}

}
