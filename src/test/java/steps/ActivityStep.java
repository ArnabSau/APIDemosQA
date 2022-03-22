package steps;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.app.ActivityScreen;
import screens.app.AppScreen;
import screens.app.CustomTitleScreen;
import screens.home.HomeScreen;
import utils.TestDataReader;

public class ActivityStep extends BaseClass{
	
	String leftTitle = null;
	String rightTitle = null;
	CustomTitleScreen customTitleScreen = null;
	
	@When("User click on App")
	public void user_click_on_app() {
		log.info("App button click");
		HomeScreen homeScreen = new HomeScreen(driver);
		homeScreen.clickAppBtn();
	    
	}

	@When("User click on Activity")
	public void user_click_on_activity() {
		log.info("Activity button click");
	    AppScreen appScreen = new AppScreen(driver);
	    appScreen.clickActivityBtn();
	}

	@When("User click on Custom Title")
	public void user_click_on_custom_title() {
		log.info("Custom Title button click");
		ActivityScreen activityScreen = new ActivityScreen(driver);
		activityScreen.clickCustomTitleBtn();
	    
	}

	@When("User enter a test in frist edit field")
	public void user_enter_a_test_in_frist_edit_field() {
		leftTitle = TestDataReader.getCustomLeftTitle();
		customTitleScreen = new CustomTitleScreen(driver);
		customTitleScreen.enterLeftEditText(leftTitle);
		log.info("Enter "+leftTitle+" in left text edit");
		
	    
	}

	@When("User click on Change Left button")
	public void user_click_on_change_left_button() {
		log.info("Change Left button click");
	   customTitleScreen.clickLeftBtn();
	}

	@Then("User should see the same text on left title")
	public void user_should_see_the_same_text_on_left_title() {
		
		Assert.assertEquals(customTitleScreen.getLeftTitle(),leftTitle);
		log.info(customTitleScreen.getLeftTitle()+" is showing in left title");
	    
	}
	
	@When("User enter a test in second edit field")
	public void user_enter_a_test_in_second_edit_field() {
		rightTitle = TestDataReader.getCustomRightTitle();
		customTitleScreen = new CustomTitleScreen(driver);
		customTitleScreen.enterRightEditText(rightTitle);
		log.info("Enter "+rightTitle+" in left text edit");
	    
	}
	@When("User click on Change Right button")
	public void user_click_on_change_right_button() {
	   customTitleScreen.clickRightBtn();
	   log.info("Change right button click");
	}
	
	@Then("User should see the same text on right title")
	public void user_should_see_the_same_text_on_right_title() {
		
		Assert.assertEquals(customTitleScreen.getRightTitle(),rightTitle);
		log.info(customTitleScreen.getLeftTitle()+" is showing in left title");
	    
	}

}
