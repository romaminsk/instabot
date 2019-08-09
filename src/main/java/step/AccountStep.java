package step;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

public class AccountStep extends BaseStep {

    public AccountStep(WebDriver driver){
        super(driver);
    }


    public void clickFirstImg(){
        WebElement firstImg = accountPage.getAccountFirstImg();
        WaitUtils.waitForElementClickable(firstImg);
        CustomLogger.info("Clicking on the first image");
        firstImg.click();
    }

    public void clickLikeButton(){
        WebElement likeButton = accountPage.getLikeButton();
        WaitUtils.waitForElementClickable(likeButton);
        CustomLogger.info("Clicking on the like button");
        likeButton.click();
    }

    public boolean isLikeButtonDisplayed(){
        WebElement likeButton = accountPage.getLikeButton();
        WaitUtils.waitForElementClickable(likeButton);
        CustomLogger.info("Checking presence of the like button");
        return likeButton.isDisplayed();
    }

    public void clickNextPhotoButton(){
        WebElement nextPhotoButton = accountPage.getNextPhotoButton();
        WaitUtils.waitForElementClickable(nextPhotoButton);
        CustomLogger.info("Clicking on the next photo button");
        nextPhotoButton.click();
    }

    public boolean isNextPhotoButtonDisplayed(){
        WebElement nextPhotoButton = accountPage.getNextPhotoButton();
        WaitUtils.waitForElementClickable(nextPhotoButton);
        CustomLogger.info("Checking presence of the next photo button");
        return nextPhotoButton.isDisplayed();
    }

    public void clickLikeForAllPhotos() {
        try {
        do {
            WaitUtils.sleep(2000);
            clickLikeButton();
            WaitUtils.sleep(1000);
            clickNextPhotoButton();
        } while (isNextPhotoButtonDisplayed()) ;

        } catch (TimeoutException e){
            CustomLogger.info("There wasn't sms found, test is going on " + e);
        }
    }


    public void setPostComment(String comment){
        WebElement commentField = accountPage.getCommentField();
        WaitUtils.waitForElementClickable(commentField);
        CustomLogger.info("Setting a comment");
        commentField.sendKeys(comment);
    }

    public void clickCommentButton() {
        WebElement commentButton = accountPage.getCommentButton();
        WaitUtils.waitForElementClickable(commentButton);
        CustomLogger.info("Clicking a comment button");
        commentButton.click();
    }

    public void clickPostCommentButton(){
        WebElement postButton = accountPage.getPostCommentButton();
        WaitUtils.waitForElementClickable(postButton);
        CustomLogger.info("Clicking post comment button");
        postButton.click();
    }

    public void setCommentsForAllPhotos(String comment){
        do {
            WaitUtils.sleep(2000);
            clickCommentButton();
            setPostComment(comment);
            clickPostCommentButton();
            WaitUtils.sleep(1000);
            clickNextPhotoButton();
        } while (isNextPhotoButtonDisplayed());
    }


}
