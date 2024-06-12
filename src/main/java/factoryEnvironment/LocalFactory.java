package factoryEnvironment;

import commons.BrowserList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LocalFactory {
    private WebDriver driver;
    private String browserName;

    public LocalFactory(String browserName) {
        this.browserName = browserName;
    }

    public WebDriver createDriver() {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            case CHROME_HEADLESS:
                ChromeOptions chHeadlessOptions = new ChromeOptions();
                chHeadlessOptions.addArguments("--headless");
                chHeadlessOptions.addArguments("window-size=1920x1080");
                driver = new ChromeDriver(chHeadlessOptions);
                break;
            case FIREFOX_HEADLESS:
                FirefoxOptions ffHeadlessOptions = new FirefoxOptions();
                ffHeadlessOptions.addArguments("--headless");
                ffHeadlessOptions.addArguments("window-size=1920x1080");
                driver = new FirefoxDriver(ffHeadlessOptions);
                break;
            case EDGE_HEADLESS:
                EdgeOptions eHeadlessOptions = new EdgeOptions();
                eHeadlessOptions.addArguments("--headless");
                eHeadlessOptions.addArguments("window-size=1920x1080");
                driver = new EdgeDriver(eHeadlessOptions);
                break;
            default:
                throw new RuntimeException("Browser name is not valid");
        }
        return driver;
    }
}
