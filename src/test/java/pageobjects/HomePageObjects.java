package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {


    @FindBy(linkText = "HOME")
    public WebElement HomeButton;

    @FindBy(linkText = "OneZero")
    public WebElement OneZeroButton;


}
