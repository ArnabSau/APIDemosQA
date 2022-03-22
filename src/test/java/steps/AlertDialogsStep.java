package steps;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.app.AlertDialogsScreen;
import screens.app.AppScreen;
import utils.TestDataReader;

public class AlertDialogsStep extends BaseClass {
	
	AlertDialogsScreen alertDialogsScreen = null;
	String command= null;
	String option = null;
	
	@When("User click on Alert Dialogs")
	public void user_click_on_alert_dialogs() {
		log.info("Alert Dialogs button click");
	    AppScreen appScreen = new AppScreen(driver);
	    appScreen.clickAlertDialogsBtn();
	}

	@When("User click on LIST DIALOG")
	public void user_click_on_list_dialog() {
		log.info("LIST DIALOGS button click");
		alertDialogsScreen = new AlertDialogsScreen(driver);
		alertDialogsScreen.clickListDialogBtn();
	    
	}

	@When("User select a command")
	public void user_select_an_command() {
		command = TestDataReader.getCommand();
		alertDialogsScreen.clickCommand(command);
		log.info(command+" selected");
	    
	}

	@Then("User should get the clicked command as message")
	public void user_should_get_the_clicked_option_as_message() {
		Assert.assertTrue(alertDialogsScreen.getMessage().contains(command));
		log.info("Got message as "+ alertDialogsScreen.getMessage());
	}
	
	@When("User click on SINGLE CHOICE LIST")
	public void user_click_on_single_choice_list() {
		log.info("SINGLE CHOICE LIST button click");
		alertDialogsScreen = new AlertDialogsScreen(driver);
	    alertDialogsScreen.clickSingalChoiceListBtn();
	}

	@When("User select an option")
	public void user_select_an_option() {
		option = TestDataReader.getOption();
	    alertDialogsScreen.selectRadioBtn(option);
	    log.info(option+" radio button selected");
	}

	@When("User accept alert")
	public void user_accept_alert() {
		log.info("Alert accept");
	    alertDialogsScreen.acceptAlert();
	}

	@Then("User should see selected option")
	public void user_should_see_selected_option() {
	    alertDialogsScreen.clickSingalChoiceListBtn();
	    Assert.assertEquals(option, alertDialogsScreen.getSelectedRedioBtn());
	    log.info(alertDialogsScreen.getSelectedRedioBtn()+" radio button is selected");
	}

}
