package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class SeleniumPage {

	CommonMethods obj_CommonMethods=new CommonMethods();
	public SeleniumPage(WebDriver wd) {
		PageFactory.initElements(wd,this);
	}
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement enterData_On_FormElements;
	
	public void enterData(String Text) {

		obj_CommonMethods.enterText(enterData_On_FormElements, Text);

	}
}
