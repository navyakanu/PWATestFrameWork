package stepdefinitions;

import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    public static  WebDriver driver;

    @Before
    public void navigateToURLBeforeScenario() throws MalformedURLException {

        System.out.println(System.getProperty("browser"));
        String browser = System.getProperty("browser");
        String device = System.getProperty("device");
        String osVersion = System.getProperty("osVersion");

        DesiredCapabilities capabilities = new DesiredCapabilities();



        switch (browser) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver();
                driver = new FirefoxDriver();
                break;
            case "android":
                capabilities.setCapability("deviceName", device);
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", osVersion);
                capabilities.setCapability("browserName", "chrome");
                capabilities.setCapability("setJavaScriptEnabled", true);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;

            default:    WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                break;


        }


    }


}
