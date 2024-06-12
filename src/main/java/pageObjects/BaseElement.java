package pageObjects;

import commons.BasePage;
import commons.PageGeneratorManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.BaseElementUI;

public class BaseElement extends BasePage {
    WebDriver driver;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click to Home page logo")
    public HomePageObject clickToHomePageLogo() {
        waitForElementClickable(driver, BaseElementUI.HOMEPAGE_LOGO_IMAGE);
        clickToElement(driver, BaseElementUI.HOMEPAGE_LOGO_IMAGE);
        return PageGeneratorManager.getHomePage(driver);
    }
    public RewardPointPageObject openRewardPointPage(WebDriver driver) {
        waitForElementClickable(driver, BaseElementUI.REWARD_POINT_PAGE_LINK);
        clickToElement(driver, BaseElementUI.REWARD_POINT_PAGE_LINK);
        return PageGeneratorManager.getRewardPointPage(driver);
    }
    public DownloadableProductPageObject openDownloadableProductPage(WebDriver driver) {
        waitForElementClickable(driver, BaseElementUI.DOWNLOADABLE_PRODUCT_PAGE_LINK);
        clickToElement(driver, BaseElementUI.DOWNLOADABLE_PRODUCT_PAGE_LINK);
        return PageGeneratorManager.getDownloadableProductPage(driver);
    }
    public AddressesPageObject openAddressesPage(WebDriver driver) {
        waitForElementVisible(driver, BaseElementUI.ADDRESSES_PAGE_LINK);
        clickToElement(driver, BaseElementUI.ADDRESSES_PAGE_LINK);
        return PageGeneratorManager.getAddressesPage(driver);
    }
    public CustomerPageObject openCustomerInforPage(WebDriver driver) {
        waitForElementClickable(driver, BaseElementUI.CUSTOMER_INFOR_PAGE_LINK);
        clickToElement(driver, BaseElementUI.CUSTOMER_INFOR_PAGE_LINK);
        return PageGeneratorManager.getCustomerPage(driver);
    }
    public HomePageObject userAbleToLogout(WebDriver driver) {
        waitForElementClickable(driver, BaseElementUI.USER_LOGOUT_LINK);
        clickToElement(driver, BaseElementUI.USER_LOGOUT_LINK);
        return PageGeneratorManager.getHomePage(driver);
    }
    public AdminLoginPageObject adminAbleToLogout(WebDriver driver) {
        waitForElementClickable(driver, BaseElementUI.ADMIN_LOGOUT_LINK);
        clickToElement(driver, BaseElementUI.ADMIN_LOGOUT_LINK);
        return PageGeneratorManager.getAdminLoginPage(driver);
    }
    public void clickToButtonByText(String buttonText) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
        clickToElement(driver, BaseElementUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
    }
    public void enterTextboxByText(String restParamTextbox, String valueSend) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_TEXT, restParamTextbox);
        sendkeyToElement(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_TEXT, valueSend, restParamTextbox);
    }
    public void selectValueDropdown(String restParamDropdown, String selectDate) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_DROPDOWN_BY_TEXT, restParamDropdown);
        selectDropdown(driver, BaseElementUI.DYNAMIC_DROPDOWN_BY_TEXT, selectDate, restParamDropdown);
    }

    public void clickToHeaderLinkByName(String pageName) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_HEADER_LINK_BY_NAME, pageName);
        clickToElement(driver, BaseElementUI.DYNAMIC_HEADER_LINK_BY_NAME, pageName);
    }
    public String getAttributeValueInTextbox(String restParamTextbox) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_TEXT, restParamTextbox);
        return getElementAttribute(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_TEXT, "value", restParamTextbox);
    }
    public String getValueSelectedInDropdown(String restParamDropdown) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_DROPDOWN_BY_TEXT, restParamDropdown);
        return getFirstSelectOption(driver, BaseElementUI.DYNAMIC_DROPDOWN_BY_TEXT, restParamDropdown);
    }

}
