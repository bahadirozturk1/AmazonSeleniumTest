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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginEmail;
import pages.LoginPassword;

import java.time.Duration;

public class Login {

    public static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        extent.flush();
    }

    @Test
    public void testLogin() throws InterruptedException {

        // Access environment variables
        /*String userMail = System.getenv("USERNAME");
        String userPassword = System.getenv("PASSWORD");*/

        // Create a test entry in ExtentReports

        test = extent.createTest("Test Login", "This test logs in to the site");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        homePage.getLogin().click();
        Thread.sleep(1000);

        LoginEmail loginEmail = new LoginEmail(driver);
        loginEmail.getLoginWithEmail().sendKeys("xxx@gmail.com");
        loginEmail.getContinueBtn().click();

        LoginPassword loginPassword = new LoginPassword(driver);
        loginPassword.getPasswordField().sendKeys("xxx");
        loginPassword.getLoginButton().click();

        // Wait for the confirmation text to appear
        WebElement confirmationText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Amazon\\.com\\.tr']"))
        );

        // Check if the confirmation text is displayed and log the result
        if (confirmationText.isDisplayed()) {
            test.log(Status.PASS, "Test Passed");
        } else {
            test.log(Status.FAIL, "Test Failed");
        }
    }
}
