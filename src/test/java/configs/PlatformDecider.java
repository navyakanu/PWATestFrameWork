package configs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

public class PlatformDecider extends CommonAppiumTests {

        private MobileFlow mobileFlow;
        private WebFlow webFlow;

        public PlatformDecider(WebDriver driver) {
            super(driver);
            // TODO Auto-generated constructor stub
        }

        public DiversionInterface getPlatform(String platform) {
            if (platform == null) {
                return null;
            }
            if (platform.equalsIgnoreCase("android")) {
                if (mobileFlow == null) {
                    return mobileFlow = new MobileFlow(driver);
                }
                return mobileFlow;
            }

            if (platform.equalsIgnoreCase("web")) {
                if (webFlow == null) {
                    return webFlow = new WebFlow(driver);
                }
                return webFlow;

            }
            return null;

        }
}
