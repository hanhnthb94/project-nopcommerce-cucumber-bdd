package factoryEnvironment;

import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SaucelabFactory {
    private WebDriver driver;
    private String browserName;
    private String osName;

    public SaucelabFactory(String browserName, String osName) {
        this.browserName = browserName;
        this.osName = osName;
    }

    public WebDriver createDriver() {

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("platformName", osName);
        capability.setCapability("browserName", browserName);

        Map<String, Object> sauceEdOptions = new HashMap<>();
        sauceEdOptions.put("username", "oauth-nguyenthihanhcvtv-9b28e");
        sauceEdOptions.put("accessKey", "15c18989-f264-47bc-b23f-073c662789eb");
        sauceEdOptions.put("build", "selenium-build-W4TH2");
        sauceEdOptions.put("name", "Run on Nopcommerce UI");
        capability.setCapability("sauce:options", sauceEdOptions);

        try {
            driver = new RemoteWebDriver(new URL(GlobalConstants.SAUCE_URL), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
