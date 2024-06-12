package factoryEnvironment;

import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserStackFactory {
    private WebDriver driver;
    private String browserName;
    private String osName;

    public BrowserStackFactory(String browserName, String osName) {
        this.browserName = browserName;
        this.osName = osName;
    }

    public WebDriver createDriver() {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("platformName", osName);
        capability.setCapability("browserName", browserName);

        Map<String, Object> sauceEdOptions = new HashMap<>();
        sauceEdOptions.put("username", "hnhnguynth_ExoMns");
        sauceEdOptions.put("accessKey", "63e7uE8q3PQbrCakpqV3");
        sauceEdOptions.put("build", "selenium-build-W4TH2");
        sauceEdOptions.put("name", "Run on Nopcommerce UI");
        capability.setCapability("sauce:options", sauceEdOptions);

        try {
            driver = new RemoteWebDriver(new URL(GlobalConstants.BROWSER_STACK_URL), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
