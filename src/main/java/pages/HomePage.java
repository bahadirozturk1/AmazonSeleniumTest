package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;

public class HomePage {

    public WebDriver driver;

        By acceptCookiesBtn = By.cssSelector(".a-button-input");
        By rejectCookiesBtn = By.cssSelector("button");
        By amazonHomepage = By.cssSelector("[aria-label='Amazon\\.com\\.tr']");
        By updateDeliveryLocation = By.cssSelector("#nav-global-location-popover-link");
        By searchbar = By.cssSelector("input#twotabsearchtextbox");
        By login = By.cssSelector("#nav-link-accountList");
        By refundsAndOrders = By.cssSelector("a#nav-orders");
        By cart = By.cssSelector("#nav-cart");
        By allItems = By.cssSelector("a#nav-hamburger-menu");
        By bestSellers = By.cssSelector("div#nav-xshop > a:nth-of-type(2)");
        By dailyDeals = By.cssSelector("div#nav-xshop > a:nth-of-type(3)");
        By prime = By.cssSelector("a#nav-link-amazonprime > span:nth-of-type(1)");
        By newReleases = By.cssSelector("div#nav-xshop > a:nth-of-type(5)");
        By giftIdeas = By.cssSelector("div#nav-xshop > a:nth-of-type(6)");
        By electronics = By.cssSelector("div#nav-xshop > a:nth-of-type(7)");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getacceptCookiesBtn() {
        return driver.findElement(acceptCookiesBtn);
    }

    public WebElement getRejectCookiesBtn() {
        return driver.findElement(rejectCookiesBtn);
    }

    public WebElement getAmazonHomepage() {
        return driver.findElement(amazonHomepage);
    }

    public WebElement getUpdateDeliveryLocation() {
        return driver.findElement(updateDeliveryLocation);
    }

    public WebElement getSearchbar() {
        return driver.findElement(searchbar);
    }

    public WebElement getLogin() {
        return driver.findElement(login);
    }

    public WebElement getRefundsAndOrders() {
        return driver.findElement(refundsAndOrders);
    }

    public WebElement getCart() {
        return driver.findElement(cart);
    }

    public WebElement getAllItems() {
        return driver.findElement(allItems);
    }

    public WebElement getBestSellers() {
        return driver.findElement(bestSellers);
    }

    public WebElement getDailyDeals() {
        return driver.findElement(dailyDeals);
    }

    public WebElement getPrime() {
        return driver.findElement(prime);
    }

    public WebElement getNewReleases() {
        return driver.findElement(newReleases);
    }

    public WebElement getGiftIdeas() {
        return driver.findElement(giftIdeas);
    }

    public WebElement getElectronics() {
        return driver.findElement(electronics);
    }

}
