package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

public class LoginStep extends BaseStep {


    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public void clickLogin(){
        WebElement userNameField = loginPage.getUsernameField();
        WaitUtils.waitForElementVisible(userNameField);
        CustomLogger.info("Clicking user's login");
        userNameField.click();
    }

    public void setLogin(String userName){
        WebElement userNameField = loginPage.getUsernameField();
        WaitUtils.waitForElementVisible(userNameField);
        CustomLogger.info("Entering user's login");
        userNameField.sendKeys(userName);
    }

    public void setPassword(String password){
        WebElement passwordField = loginPage.getPasswordField();
        WaitUtils.waitForElementVisible(passwordField);
        CustomLogger.info("Entering users password");
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement loginButton = loginPage.getLoginButton();
        WaitUtils.waitForElementClickable(loginButton);
        CustomLogger.info("Clicking on the login button");
        loginButton.click();
    }

}
