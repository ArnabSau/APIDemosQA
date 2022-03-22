package screens.app;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.TouchManager;

public class AlertDialogsScreen extends TouchManager {
	
	AppiumDriver<MobileElement> driver = null;
	

	public AlertDialogsScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	
	@FindBy(id = "io.appium.android.apis:id/select_button")
	private MobileElement listDialodButton;
	
	@FindBy(id = "io.appium.android.apis:id/radio_button")
	private MobileElement singalChoiceListButton;
	
	@FindBy(id = "android:id/message")
	private MobileElement message;
	
	public void clickListDialogBtn() {
		tap(listDialodButton);
	}
	
	public void clickSingalChoiceListBtn() {
		tap(singalChoiceListButton);
	}
	
	public void clickCommand(String str) {
		
		List<MobileElement> elements = (List<MobileElement>)driver.findElementsById("android:id/text1");
		
		if(str.toLowerCase().equals("command one")) {
			tap(elements.get(0));
		}else if(str.toLowerCase().equals("command two")) {
			tap(elements.get(1));
		}else if(str.toLowerCase().equals("command three")) {
			tap(elements.get(2));
		}else if(str.toLowerCase().equals("command four")) {
			tap(elements.get(3));
		}
	}
	
	public String getMessage() {
		return getElementText(message);
	}
	
	public void selectRadioBtn(String value) {
		List<MobileElement> elements = (List<MobileElement>)driver.findElementsById("android:id/text1");
		for(MobileElement ele: elements) {
			if(getElementText(ele).equals(value)) {
				tap(ele);
			}
		}
	}
	
	public String getSelectedRedioBtn() {
		
		List<MobileElement> elements = (List<MobileElement>)driver.findElementsById("android:id/text1");
		String value = null;
		for(MobileElement ele: elements) {
			if(ele.getAttribute("checked").equals("true")) {
				value = getElementText(ele);
			}
		}
		return value;
	}

}
