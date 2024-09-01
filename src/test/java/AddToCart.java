import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BestSellers;
import pages.HomePage;
import pages.Product;

import java.time.Duration;

public class AddToCart {

    public static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;

    @BeforeTest
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.amazon.com.tr/");

        // Initialize ExtentReports and attach reporter
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void cleanup() {
        extent.flush();
    }

    @Test
    public void testAddToCart() throws InterruptedException {
        // Create a test in the ExtentReports
        test = extent.createTest("Add To Cart", "This test adds items to the cart");

        // Navigate through the website
        HomePage homePage = new HomePage(driver);
        homePage.getRejectCookiesBtn().click();
        homePage.getBestSellers().click();

        BestSellers bestSellers = new BestSellers(driver);
        bestSellers.getFirstCarouselItemOne().click();

        Product product = new Product(driver);
        product.getQuantityDropdown().click();
        product.getQuantityValueTwo().click();
        product.getAddToBasketBtn().click();

        // Wait for the confirmation text to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Sepete Eklendi')]"))
        );

        // Check if the confirmation text is displayed and log the result
        if (confirmationText.isDisplayed()) {
            test.log(Status.PASS, "Test Passed");
        } else {
            test.log(Status.FAIL, "Test Failed");
        }
    }
}
