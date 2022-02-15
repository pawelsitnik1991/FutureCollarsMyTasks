package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvaider {
    private static WebDriver driver = null;

    public static WebDriver prepareDriver(){
        if(driver==null){
            selectDriver();
        }
        return driver;
    }

    public static void quitWebdriver(){
        driver.quit();
        driver=null;
    }

    private static void selectDriver(){
        String chromePath = "C:\\DriverChrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver= new ChromeDriver();
    }

}
