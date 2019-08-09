package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
    }


    @FindBy(xpath = "//input[@name = 'username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement loginButton;


    public WebElement getUsernameField(){
        return this.usernameField;
    }

    public WebElement getPasswordField(){
        return this.passwordField;
    }

    public WebElement getLoginButton(){
        return this.loginButton;
    }

}
