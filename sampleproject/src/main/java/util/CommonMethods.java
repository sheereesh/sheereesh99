package util;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	public void click(WebElement web) {
		web.click();
	}
	public void enterText(WebElement web,String  text) {
		web.sendKeys(text);
	}
}
