package com.lumen.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {

	
	public static WebDriver driver;
	public static Properties prop;
	
public Basepage() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\lumens assesment\\lumens assesment\\Lumens\\src\\main\\java\\com\\lumen\\config\\config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}


public static void browserlaunch(){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NEOTECH\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");	
		 driver = new ChromeDriver(); 
	}
	driver.get(prop.getProperty("url"));
	
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}



public String getReportConfigPath(){
	String reportConfigPath = prop.getProperty("reportConfigPath");
	if(reportConfigPath!= null) return reportConfigPath;
	else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
}


	
	
	
	
}
