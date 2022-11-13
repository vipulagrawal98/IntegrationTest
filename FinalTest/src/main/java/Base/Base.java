package Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    static FileInputStream fis = null;
    public static Properties prop = new Properties();
    public static WebDriver getDriver() {
        return driver.get();
    }



   static void  setDriver(WebDriver Driver) {
        driver.set(Driver);
    }
    static {



       try {
            File file = new File("./Resources/Config.properties");
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
