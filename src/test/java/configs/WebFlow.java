package configs;

import org.openqa.selenium.WebDriver;

public class WebFlow extends CommonAppiumTests implements DiversionInterface {

    public WebFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public String implementDifferentMethods(String text) {
        System.out.println("We are in web flow");
        return "In web flow";
    }
}
