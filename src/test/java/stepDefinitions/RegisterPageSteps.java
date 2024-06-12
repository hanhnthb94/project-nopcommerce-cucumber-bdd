package stepDefinitions;

import commons.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import java.util.Random;

public class RegisterPageSteps {
    WebDriver driver;
    RegisterPageObject registerPage;
    HomePageObject homePage;
    LoginPageObject loginPage;

    static String firstName = "Automation", lastName = "FC", emailAddress = "automationTestABC1@gmail.com", password = "123456";

    public RegisterPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePage(driver);
    }
    @Given("Open Register page")
    public void openRegisterPage() {
        registerPage = homePage.clickToRegisterLink();
    }
    @When("Input First name textbox")
    public void inputFirstNameTextbox() {
        registerPage.enterFirstNameTextbox(firstName);
    }
    @When("Input Last name textbox")
    public void inputLastNameTextbox() {
        registerPage.enterLastNameTextbox(lastName);
    }
    @When("Input Email textbox")
    public void inputEmailTextbox() {
        registerPage.enterEmailTextbox(emailAddress);
    }
    @When("Input Password textbox")
    public void inputPasswordTextbox() {
        registerPage.enterPasswordTextbox(password);
    }
    @When("Input ConfirmPassword textbox")
    public void inputConfirmPasswordTextbox() {
        registerPage.enterConfirmPasswordTextbox(password);
    }
    @When("Click to Submit")
    public void clickToSubmit() {
        registerPage.clickToRegisterButton();
    }
    @Then("Verify Success Message is displayed")
    public void verifySuccessMessageIsDisplayed() {
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
    }
    @And("Click to Logout")
    public void clickToLogout() {
        registerPage.clickToLogoutButton();
    }
    public static String getEmailAddress() {
        Random rand = new Random();
        return "automation" + rand.nextInt(99999) + "@gmail.com";
    }
}
