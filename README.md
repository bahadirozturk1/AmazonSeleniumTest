# Amazon Testing Automation

## Overview
This project involves automated testing of Amazon's website using Selenium WebDriver with Java and TestNG. It includes tests for adding products to the cart and logging in, using ExtentReports for detailed reporting.

## Features
### Test Cases:

AddToCart: Tests adding an item from the "Best Sellers" carousel to the shopping cart.

Login: Tests the login functionality using email and password.

### Pages:

HomePage: Represents the homepage of Amazon with elements like search bar, login button, and various sections.

BestSellers: Represents the "Best Sellers" carousel on Amazon.

Product: Represents the product page where items can be added to the cart.

LoginEmail: Represents the login page where the email is entered.

LoginPassword: Represents the login page where the password is entered.

### Reporting:

Uses ExtentReports to generate HTML reports with test results.


### Output
ExtentReports: The test execution results are captured and displayed in an HTML report located in the target directory. The report includes details of test execution, pass/fail status, and logs.

### Example
Test Output

AddToCart Test: Validates if an item was successfully added to the cart with a confirmation message.

Login Test: Validates successful login by checking the presence of the Amazon homepage element after login.
