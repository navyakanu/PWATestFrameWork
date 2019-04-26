package pages;

import configs.CommonAppiumTests;
import configs.DiversionInterface;
import configs.PlatformDecider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePageObjects;
import stepdefinitions.Hooks;

public class HomePage extends CommonAppiumTests  {
    String platform = Hooks.platform;

    HomePageObjects homePageObjects = new HomePageObjects();
    public DiversionInterface viewDecider;
    PlatformDecider platformDecider = new PlatformDecider(driver);

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, homePageObjects);
    }

    public void clickOnOneZero(){
        viewDecider = platformDecider.getPlatform(platform);
        viewDecider.implementDifferentMethods("sending view");
        homePageObjects.HomeButton.click();
    }
//




}
