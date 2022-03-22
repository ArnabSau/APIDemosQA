package screens.app;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class CustomTitleScreen extends TouchManager {
	
	AppiumDriver<MobileElement> driver = null;

	public CustomTitleScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	
	@FindBy(id = "io.appium.android.apis:id/left_text_edit")
	private MobileElement leftEditText;
	
	@FindBy(id = "io.appium.android.apis:id/right_text_edit")
	private MobileElement rightEditText;
	
	@FindBy(id = "io.appium.android.apis:id/left_text_button")
	private MobileElement leftButton;
	
	@FindBy(id = "io.appium.android.apis:id/right_text_button")
	private MobileElement rightButton;
	
	@FindBy(id = "io.appium.android.apis:id/left_text")
	private MobileElement leftTitle;
	
	@FindBy(id = "io.appium.android.apis:id/right_text")
	private MobileElement rightTitle;
	
	public void enterLeftEditText(String msg) {
		enterText(msg, leftEditText);
	}
	
	public void enterRightEditText(String msg) {
		enterText(msg, rightEditText);
	}
	
	public void clickLeftBtn() {
		tap(leftButton);
	}
	
	public void clickRightBtn() {
		tap(rightButton);
	}
	
	public String getLeftTitle() {
		return getElementText(leftTitle);
	}
	
	public String getRightTitle() {
		return getElementText(rightTitle);
	}
	
	

}
