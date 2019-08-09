package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver){
    }

    @FindBy(xpath = "//div[@class = 'eLAPa']")
    private WebElement accountFirstImg;

    @FindBy(xpath = "//span[@aria-label = 'Like']")
    private WebElement likeButton;

    @FindBy(xpath = "//*[contains(@class,'coreSpriteRightPaginationArrow')]")
    private WebElement nextPhotoButton;

    @FindBy(xpath = "//button[@type = 'submit']/preceding::textarea")
    private WebElement commentField;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement postCommentButton;

    @FindBy(xpath = "//span[@aria-label = 'Comment']")
    private WebElement commentButton;


    public WebElement getAccountFirstImg(){
        return this.accountFirstImg;
    }

    public WebElement getLikeButton(){
        return this.likeButton;
    }

    public WebElement getNextPhotoButton(){
        return this.nextPhotoButton;
    }

    public WebElement getCommentField(){
        return this.commentField;
    }

    public WebElement getPostCommentButton(){
        return this.postCommentButton;
    }

    public WebElement getCommentButton(){
        return this.commentButton;
    }

}
