package pageObjects;

import commons.PageGeneratorManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageUIs.HomPageUI;

public class HomePageObject extends BaseElement {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Click to Register link")
    public RegisterPageObject clickToRegisterLink() {
        waitForElementClickable(driver, HomPageUI.REGISTER_LINK);
        clickToElement(driver, HomPageUI.REGISTER_LINK);
        return PageGeneratorManager.getRegisterPage(driver);
    }

    @Step("Click to Login link")
    public LoginPageObject clickToLoginLink() {
        waitForElementClickable(driver, HomPageUI.LOGIN_LINK);
        clickToElement(driver, HomPageUI.LOGIN_LINK);
        return PageGeneratorManager.getLoginPage(driver);
    }

    @Step("Get My Account link")
    public WebElement getMyAccountLink() {
        waitForElementVisible(driver, HomPageUI.MY_ACCOUNT_LINK);
        return getElement(driver, HomPageUI.MY_ACCOUNT_LINK);
    }

    @Step("Click to My Account link")
    public CustomerPageObject clickToMyAccountLink() {
        waitForElementVisible(driver, HomPageUI.MY_ACCOUNT_LINK);
        clickToElement(driver, HomPageUI.MY_ACCOUNT_LINK);
        return PageGeneratorManager.getCustomerPage(driver);
    }
    @Step("Open My Account link")
    public CustomerPageObject openMyAccountLink() {
        String myAccountLink = getElementAttribute(driver, HomPageUI.MY_ACCOUNT_LINK, "href");
        openUrl(driver, myAccountLink);
        return PageGeneratorManager.getCustomerPage(driver);
    }

    @Step("Verify Register link is display")
    public boolean isRegisterLinkDisplayed() {
        waitForElementVisible(driver, HomPageUI.REGISTER_LINK);
        return isElementDisplayed(driver, HomPageUI.REGISTER_LINK);
    }

    public boolean loginLinkUndisplayed() {
        return isElementUndisplayed(driver, HomPageUI.LOGIN_LINK);
    }

    public SearchPageObject clickToSearchLink() {
        waitForElementVisible(driver, HomPageUI.SEARCH_LINK);
        clickToElement(driver, HomPageUI.SEARCH_LINK);
        return PageGeneratorManager.getSearchPageObject(driver);
    }
}

