package pageObjects;

import org.openqa.selenium.WebDriver;
import pageUIs.SearchPageUI;

public class SearchPageObject extends BaseElement {
    WebDriver driver;
    public SearchPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToSearchTextbox(String value) {
        waitForElementVisible(driver, SearchPageUI.SEARCH_TEXTBOX);
        sendkeyToElement(driver, SearchPageUI.SEARCH_TEXTBOX, value);
    }

    public void clickSearchButton() {
        waitForElementClickable(driver, SearchPageUI.SEARCH_BUTTON);
        clickToElement(driver, SearchPageUI.SEARCH_BUTTON);
    }
}
