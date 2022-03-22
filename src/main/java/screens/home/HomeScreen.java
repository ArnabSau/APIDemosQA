package screens.home;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class HomeScreen extends TouchManager {

	AppiumDriver<MobileElement> driver = null;

	public HomeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
	private MobileElement accessibilityButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	private MobileElement animationButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
	private MobileElement appButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
	private MobileElement contentButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
	private MobileElement grapicsButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
	private MobileElement mediaButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"NFC\"]")
	private MobileElement nfcButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"OS\"]")
	private MobileElement osButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
	private MobileElement preferenceButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
	private MobileElement textButton;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	private MobileElement viewsButton;

	public void clickAccessibilityBtn() {
		tap(accessibilityButton);
	}
	
	public void clickAnimationBtn() {
		tap(animationButton);
	}
	
	public void clickAppBtn() {
		tap(appButton);
	}
	
	public void clickContentBtn() {
		tap(contentButton);
	}
	
	public void clickGrapicsBtn() {
		tap(grapicsButton);
	}
	
	public void clickMediaBtn() {
		tap(mediaButton);
	}
	
	public void clickNfcBtn() {
		tap(nfcButton);
	}
	
	public void clickOsBtn() {
		tap(osButton);
	}
	
	public void clickPreferenceBtn() {
		tap(preferenceButton);
	}
	
	public void clickTextBtn() {
		tap(textButton);
	}
	
	public void clickViewsBtn() {
		tap(viewsButton);
	}

}
