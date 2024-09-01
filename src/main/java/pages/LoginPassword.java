package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPassword {

    WebDriver driver;

    By passwordField = By.cssSelector("input#ap_password");
    By forgotPassword = By.cssSelector("a#auth-fpp-link-bottom");
    By loginButton = By.cssSelector("input#signInSubmit");

    public LoginPassword(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getForgotPassword() {
        return driver.findElement(forgotPassword);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
}
