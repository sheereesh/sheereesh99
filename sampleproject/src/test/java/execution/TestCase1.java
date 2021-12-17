package execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SeleniumPage;
import util.InvokeBrowser;

public class TestCase1 {
	private static WebDriver wd;

	@Test
	public void testCase1() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		wd=obj_InvokeBrowser.invokeBrowser();
		HomePage obj_HomePage=new HomePage(wd);
		obj_HomePage.element_Click();
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.enterData("sheereesh");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			 System.out.println(e);
			 
		}
		wd.close();
		wd.quit();
	}
}
