package configs;

import org.openqa.selenium.WebDriver;

public class MobileFlow extends CommonAppiumTests implements DiversionInterface {

    public MobileFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public String implementDifferentMethods(String text) {
        System.out.println("We are in mobile flow");
        return "In mobile flow"
                ;
    }






}
