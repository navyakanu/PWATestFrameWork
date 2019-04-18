package pages;

import configs.CommonAppiumTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePageObjects;

public class HomePage extends CommonAppiumTests {


    HomePageObjects homePageObjects = new HomePageObjects();


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, homePageObjects);
    }

    public void clickOnOneZero(){
        homePageObjects.HomeButton.click();
    }





}
