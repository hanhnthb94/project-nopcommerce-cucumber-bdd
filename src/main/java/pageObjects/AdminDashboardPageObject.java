package pageObjects;

import org.openqa.selenium.WebDriver;

public class AdminDashboardPageObject extends BaseElement {
    WebDriver driver;

    public AdminDashboardPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }



}
