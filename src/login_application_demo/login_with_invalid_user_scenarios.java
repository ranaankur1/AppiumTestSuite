package login_application_demo;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import scoope_locators.login_with_invalid_data_page;
import utility_package.UtilityBrowser;

public class login_with_invalid_user_scenarios {

	
	@BeforeClass
	public void open_browser() throws MalformedURLException
	{
		UtilityBrowser.openbrowser();
		UtilityBrowser.openurl("https://m.facebook.com");
	}
	
	@Test(priority=1,description="login with invalid credential")
	public void with_invalid_credential() throws Exception
	{   
		login_with_invalid_data_page.enter_invalid_username();
		login_with_invalid_data_page.enter_invalid_password();
		login_with_invalid_data_page.click_on_login_button();
	}	
	
	@Test(priority=2,description="check error message validation")
	public void error_message_validation() throws Exception
	{
		Assert.assertEquals(login_with_invalid_data_page.acutal_error_message,login_with_invalid_data_page.expected_error_message);

	}
	

	@AfterClass
	public void close_browser()
	{
		UtilityBrowser.driver.close();
	}
}
