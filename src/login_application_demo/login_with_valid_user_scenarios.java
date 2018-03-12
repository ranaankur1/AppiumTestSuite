package login_application_demo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import scoope_locators.login_with_valid_data_page;
import utility_package.DatabaseQueriesFromExcel;
import utility_package.Database_activity;
import utility_package.UtilityBrowser;
import utility_package.Invalid_dataFromExcel;

public class login_with_valid_user_scenarios {

	
	@BeforeClass
	public void open_browser() throws MalformedURLException
	{
		UtilityBrowser.openbrowser();
		UtilityBrowser.openurl("https://m.facebook.com");
	}
	
	@Test(priority=1,description="login with valid credential")
	public void with_valid_credential()
	{
		login_with_valid_data_page.enter_valid_username();
		login_with_valid_data_page.enter_valid_username();
		login_with_valid_data_page.click_on_login_button();
	}
	
	@Test(priority=2,description="read page header")
	public void read_page_header()
	{
		Assert.assertEquals(login_with_valid_data_page.actual_result,login_with_valid_data_page.expected_data);
	}
	
	@AfterClass
	public void close_browser()
	{
		UtilityBrowser.driver.close();
	}
		
}  
