package com.amdocs.ProjectDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	

	public static WebDriver driver;
	public static Properties prop;
	
	public static void loadConfig()
    {
        try {
            prop = new Properties();
            System.out.println("super construtor invoked");
            FileInputStream ip=new FileInputStream("D:\\AmdocsAQE\\ProjectDemo\\Configuration\\Config.properties");
            prop.load(ip);
            System.out.println("driver : "+driver);
            }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void launch()
    {
    	 WebDriverManager.edgedriver().setup();
		String browserName=prop.getProperty("browser");
         if(browserName.contains("Chrome"))
         {
             driver=new ChromeDriver();
         }
         else if(browserName.contains("Edge"))
         {
             driver=new EdgeDriver();
         }
         
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.get(prop.getProperty("url"));
    }

    
    public static String getUsername() {
	return prop.getProperty("username");
    }
    
    public static String getPassword() {
        return prop.getProperty("password");
       }


}
