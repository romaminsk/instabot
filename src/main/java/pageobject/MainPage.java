package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
    }

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'Ho')]")
    private WebElement notNowButton;


    public WebElement getSearchField(){
        return this.searchField;
    }

    public WebElement getNotNowButton(){
        return this.notNowButton;
    }

}
