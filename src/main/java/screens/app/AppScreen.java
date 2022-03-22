package screens.app;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class AppScreen extends TouchManager{
	
	AppiumDriver<MobileElement> driver = null;

	public AppScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Activity\"]")
	private MobileElement activityButton;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")
	private MobileElement alertDialogsButton;
	
	public void clickActivityBtn() {
		tap(activityButton);
	}
	
	public void clickAlertDialogsBtn() {
		tap(alertDialogsButton);
	}

}
