package scoope_locators;

import org.openqa.selenium.By;

import utility_package.Database_activity;
import utility_package.UtilityBrowser;
import utility_package.Invalid_dataFromExcel;

public class login_with_invalid_data_page {

	public static By  username=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By  password=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By login_button=By.xpath("//*[contains(@resource-id,'u_0_5') and contains(@text,'Log In')]");
	public static By actual_data=By.xpath("//*[contains(@resource-id,'text')");
	public static By error_message=By.xpath("//*[contains(@name,'error message')]");
    public static By reset_password=By.id("reset_password");
	public static String acutal_error_message;
	public static String expected_error_message="please login with valid credential";
	
	

	public static void enter_invalid_username() throws Exception
	{  String invalid_username=Invalid_dataFromExcel.invalid_username();
       UtilityBrowser.driver.findElement(username).sendKeys(invalid_username);
     }
	
	public static void enter_invalid_password() throws Exception
	{  String invalid_password=Invalid_dataFromExcel.invalid_password();		
       UtilityBrowser.driver.findElement(password).sendKeys(invalid_password);
     }
	
	public static void click_on_login_button()
	{ 
		UtilityBrowser.driver.findElement(login_button).click();
     }
	
	public static void read_eeror_message()
	{ 
	 acutal_error_message=UtilityBrowser.driver.findElement(error_message).getText();
     }

	
}
