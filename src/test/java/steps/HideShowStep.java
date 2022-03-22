package steps;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.animation.AnimationScreen;
import screens.animation.HideShowAnimationScreen;
import screens.home.HomeScreen;

public class HideShowStep extends BaseClass{
	
	HomeScreen homeScreen = null;
	AnimationScreen animationScreen = null;
	HideShowAnimationScreen hideShowAnimationScreen = null;
	
	@Given("User is on home screen")
	public void user_is_on_home_screen() {
		log.info("Driver Setup");
		setup();
		homeScreen = new HomeScreen(driver);
		animationScreen = new AnimationScreen(driver);
		hideShowAnimationScreen = new HideShowAnimationScreen(driver);
	}

	@When("User click on Animation")
	public void user_click_on_animation() {
		log.info("Animation button click");
	    homeScreen.clickAnimationBtn();
	}

	@When("User click on Hide-Show Animation")
	public void user_click_on_hide_show_animation() {
		log.info("Hide-Show button click");
	   animationScreen.clickHideShowBtn();
	}

	@When("User click on Hide\\(GONE) checkbox")
	public void user_click_on_hide_gone_checkbox() {
		log.info("Hide(GONE) checkbok click");
	    hideShowAnimationScreen.clickHideCheckBox();
	}

	@When("User click on {string}")
	public void user_click_on(String string) {
		log.info("Button no "+string+" click");
	    hideShowAnimationScreen.clickButton(string);
	}

	@Then("User should not see {string}")
	public void user_should_not_see(String string) {
		Assert.assertFalse(hideShowAnimationScreen.isButtonExist(string));
		log.info("Button no "+string+" is not visible");
	}
	
	@When("User click Show Buttons")
	public void user_click_show_buttons() {
		log.info("Show button click");
	    hideShowAnimationScreen.clickShowBtn();
	}

	@Then("User should see {string}")
	public void user_should_see(String string) {
		Assert.assertTrue(hideShowAnimationScreen.isButtonExist(string));
		log.info("Button no "+string+" is visible");
	}

}
