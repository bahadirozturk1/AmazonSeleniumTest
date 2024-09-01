package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginEmail {

    public WebDriver driver;

    By loginWithEmail = By.cssSelector("input#ap_email");
    By continueBtn = By.cssSelector("input#continue");
    By createAccountBtn = By.cssSelector("a#createAccountSubmit");

    public LoginEmail (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginWithEmail() {
        return driver.findElement(loginWithEmail);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }

    public WebElement getCreateAccountBtn() {
        return driver.findElement(createAccountBtn);
    }
}
