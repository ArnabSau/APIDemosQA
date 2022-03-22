package screens.animation;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class AnimationScreen extends TouchManager {

	AppiumDriver<MobileElement> driver = null;

	public AnimationScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	private MobileElement hideShowButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Default Layout Animations\"]")
	private MobileElement defaultLayoutButton;

	public void clickHideShowBtn() {
		tap(hideShowButton);
	}

	public void clickDefaultLayoutBtn() {
		tap(defaultLayoutButton);
	}

}
