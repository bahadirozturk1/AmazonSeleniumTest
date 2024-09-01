package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellers {

    public WebDriver driver;

    // Locators for the first four carousel items
    By firstCarouselItemOne = By.xpath("(//ol[@class='a-carousel']//li[@class='a-carousel-card'])[1]");
    By firstCarouselItemTwo = By.xpath("(//ol[@class='a-carousel']//li[@class='a-carousel-card'])[2]");
    By firstCarouselItemThree = By.xpath("(//ol[@class='a-carousel']//li[@class='a-carousel-card'])[3]");
    By firstCarouselItemFour = By.xpath("(//ol[@class='a-carousel']//li[@class='a-carousel-card'])[4]");

    // Constructor to initialize the WebDriver
    public BestSellers(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to retrieve individual carousel items
    public WebElement getFirstCarouselItemOne() {
        return driver.findElement(firstCarouselItemOne);
    }

    public WebElement getFirstCarouselItemTwo() {
        return driver.findElement(firstCarouselItemTwo);
    }

    public WebElement getFirstCarouselItemThree() {
        return driver.findElement(firstCarouselItemThree);
    }

    public WebElement getFirstCarouselItemFour() {
        return driver.findElement(firstCarouselItemFour);
    }

    /*// Method to extract and print details from a carousel item
    public void printCarouselItemDetails(WebElement carouselItem) {
        String productTitle = carouselItem.findElement(By.xpath(".//span[contains(@class, 'p13n-sc-truncate')]")).getText();
        String productPrice = carouselItem.findElement(By.xpath(".//span[contains(@class, 'p13n-sc-price')]")).getText();
        String productImageUrl = carouselItem.findElement(By.xpath(".//img")).getAttribute("src");

    }*/
}
