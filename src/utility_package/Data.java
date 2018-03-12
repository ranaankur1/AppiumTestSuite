package utility_package;

import java.io.FileInputStream;
import java.util.Properties;

public class Data {
public static String db_connection;

	
	public static void dbconnection() throws Exception
	{   FileInputStream	fileInput = new FileInputStream("src\\data_read_path\\Url_download_path.properties");
		Properties prop1 = new Properties();
		prop1.load(fileInput);
		db_connection=prop1.getProperty("database_address");
	}
	
}
