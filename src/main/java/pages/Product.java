package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {

    public WebDriver driver;

    By quantityDropdown = By.cssSelector("[data-action='quantity-dropdown'] .a-button-inner");
    By quantityValueTwo = By.cssSelector("li:nth-of-type(2) > .a-dropdown-link");
    By addToBasketBtn = By.cssSelector("input#add-to-cart-button");
    By buyNowBtn = By.cssSelector("input#buy-now-button");
    By senderInfo = By.cssSelector(".a-button.a-button-dropdown  .a-button-text.a-declarative");

    public Product(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getQuantityDropdown() {
        return driver.findElement(quantityDropdown);
    }

    public WebElement getQuantityValueTwo() {
        return driver.findElement(quantityValueTwo);
    }

    public WebElement getAddToBasketBtn() {
        return driver.findElement(addToBasketBtn);
    }

    public WebElement getBuyNowBtn() {
        return driver.findElement(buyNowBtn);
    }

    public WebElement getSenderInfo() {
        return driver.findElement(senderInfo);
    }
}
