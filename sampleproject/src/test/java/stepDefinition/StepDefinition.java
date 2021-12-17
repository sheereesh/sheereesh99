package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SeleniumPage;
import util.InvokeBrowser;

public class StepDefinition {
	private static WebDriver driver;
	InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
	@Given("user is in {string} page")
	public void user_is_in_page(String expTitle) {
	 
	 	driver =obj_InvokeBrowser.invokeBrowser();
	     Assert.assertEquals(driver.getTitle() , expTitle);
	}

	@When("user clicks on Selenium Example Page")
	public void user_clicks_on_selenium_example_page() {
		
	 HomePage obj_HomePage=new HomePage(driver);
	 obj_HomePage.element_Click();
	}

	@Then("system should open {string}")
	public void system_should_open(String expTitle) {
		Assert.assertEquals(driver.getTitle() , expTitle);   
	}
	@When("user enters {string} on form elements text box")
	public void user_enters_on_form_elements_text_box(String text) {
	     SeleniumPage obj_SeleniumPage=new SeleniumPage(driver);
	      obj_SeleniumPage.enterData(text);;
	}


}
