package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

public class MainStep extends BaseStep {

    public MainStep(WebDriver driver){
        super(driver);
    }


    public void setPerson(String person){
        WebElement searchField = mainPage.getSearchField();
        WaitUtils.waitForElementVisible(searchField);
        CustomLogger.info("Setting person in search field");
        searchField.sendKeys(person);
    }

    public void clickNotNowButton(){
        WebElement notNowButton = mainPage.getNotNowButton();
        WaitUtils.waitForElementClickable(notNowButton);
        CustomLogger.info("Clicking not now button");
        notNowButton.click();
    }


}
