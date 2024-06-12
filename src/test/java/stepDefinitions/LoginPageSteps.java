package stepDefinitions;

import commons.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

public class LoginPageSteps {
    WebDriver driver;
    HomePageObject homePage;
    LoginPageObject loginPage;
    String emailAddress = "automationTestABC1@gmail.com", password = "123456";

    public LoginPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePage(driver);
    }
    @Then("Click to My Account link")
    public void clickToMyAccountLink() {
        homePage.clickToMyAccountLink();
    }
    @Given("Open Login page")
    public void openLoginPage() {
        loginPage = homePage.clickToLoginLink();
    }
    @When("Input Email login textbox")
    public void inputEmailLoginTextbox() {
        loginPage.enterEmailTextbox(emailAddress);
    }
    @When("Input Password login textbox")
    public void inputPasswordLoginTextbox() {
        loginPage.enterPasswordTextbox(password);
    }
    @When("Click to Login button")
    public void clickToLoginButton() {
        homePage = loginPage.clickToLoginButton();
    }
    @Then("Verify My account link is display")
    public void verifyMyAccountLinkIsDisplay() {
        Assert.assertTrue(homePage.getMyAccountLink().isDisplayed());
    }
}
