package scoope_locators;

import org.openqa.selenium.By;

import utility_package.Database_activity;
import utility_package.UtilityBrowser;

public class login_with_valid_data_page {

	public static By  username=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By  password=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By login_button=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By actual_data=By.xpath("//*[contains(@resource-id,'text')");
	public static By reset_password=By.id("reset_password");
	public static String actual_result;
	public static String expected_data="Welcome to Mindvalley";

	public static void enter_valid_username()
	{ 
		UtilityBrowser.driver.findElement(username).sendKeys(Database_activity.user_name);
     }
	
	public static void enter_valid_password()
	{ 
		UtilityBrowser.driver.findElement(password).sendKeys(Database_activity.password);
     }
	
	public static void click_on_login_button()
	{ 
		UtilityBrowser.driver.findElement(login_button).click();
     }

	public static void header_data_check()
	{ 
	   actual_result=UtilityBrowser.driver.findElement(actual_data).getText();
     }

}
