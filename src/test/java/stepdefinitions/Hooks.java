package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Hooks {


    public static WebDriver driver;
    public static final String platform = System.getProperty("platform");

    @Before
    public void BeforeScenario() throws MalformedURLException {

        String browser = System.getProperty("browser");
        String device = System.getProperty("device");
        String osVersion = System.getProperty("osVersion");



        String udid = System.getProperty("udid");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (browser) {

            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
                Integer viewPortHeight = Integer.parseInt(System.getProperty("viewportHeight"));
                Integer viewPortWidth = Integer.parseInt(System.getProperty("viewportWidth"));
                Dimension d = new Dimension(viewPortWidth, viewPortHeight);
                capabilities.setBrowserName("chrome");
                capabilities.setVersion("73.0");
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", true);

                driver = new RemoteWebDriver(
                        URI.create("http://localhost:4444/wd/hub").toURL(),
                        capabilities
                );


                driver.manage().window().setSize(d);
                break;
            case "android_chrome":
                capabilities.setCapability("deviceName", device);
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("browserName", "chrome");
                capabilities.setCapability("setJavaScriptEnabled", true);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;

            case "ios_safari":
                capabilities.setCapability("deviceName", device);
                capabilities.setCapability("udid", udid);
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("browserName", "safari");
                capabilities.setCapability("automationName", "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }


    }

    @After
    public void AfterScenario() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
