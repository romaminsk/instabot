package pageobject;

import driver.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

}
