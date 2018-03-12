package utility_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.Reporter;

public class Database_activity 
{	public static String building_address;
	public static Statement st1;
	public static String user_name;
	public static String password;	
	public static void dbconnection() throws Exception
	{  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn1=DriverManager.getConnection(Data.db_connection);
	    st1=conn1.createStatement();
	}
	
	
//reading valid user name from database	
	public static void valid_username() throws Exception
		{
	
    		dbconnection();
			String sqlStr1=DatabaseQueriesFromExcel.valid_username();		
			ResultSet rs1=st1.executeQuery(sqlStr1);
					
			
			while (rs1.next()) 
					{   user_name=rs1.getString("username");
					   
					} 
					System.out.println("the user name from database is :"+user_name);
					Reporter.log("user name is :"+user_name);
					}
	
//reading valid password from database		
	public static void valid_password() throws Exception
	{
		dbconnection();
		String sqlStr2=DatabaseQueriesFromExcel.valid_password();		
        ResultSet rs2=st1.executeQuery(sqlStr2);			
    	while (rs2.next()) 
		{
    		password=rs2.getString("password_column");
		}
		System.out.println("the password from database is :"+password);
		Reporter.log("password is :"+password);
	}
	

}

