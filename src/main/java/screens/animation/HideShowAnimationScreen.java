package screens.animation;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class HideShowAnimationScreen extends TouchManager {

	AppiumDriver<MobileElement> driver = null;

	public HideShowAnimationScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

	@FindBy(id = "io.appium.android.apis:id/hideGoneCB")
	private MobileElement hideCheckBox;
	
	@FindBy(id = "io.appium.android.apis:id/addNewButton")
	private MobileElement showButton;
	

	public void clickHideCheckBox() {
		tap(hideCheckBox);
	}
	
	public void clickShowBtn() {
		tap(showButton);
	}
	
	public void clickButton(String button) {
		List<MobileElement> elements = (List<MobileElement>)driver.findElementsByClassName("android.widget.Button");
		System.out.println(elements.size());
		tap(elements.get(Integer.parseInt(button)+1));
	}
	
	public boolean isButtonExist(String button) {
		List<MobileElement> elements = (List<MobileElement>)driver.findElementsByClassName("android.widget.Button");
		for(MobileElement btn : elements) {
			if(getElementText(btn).equals(button)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
