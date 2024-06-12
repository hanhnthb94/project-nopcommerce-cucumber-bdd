package factoryEnvironment;

import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class LambdaFactory {
    private WebDriver driver;
    private String browserName;
    private String osName;

    public LambdaFactory(String browserName, String osName) {
        this.browserName = browserName;
        this.osName = osName;
    }

    public WebDriver createDriver() {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("platformName", osName);
        capability.setCapability("browserName", browserName);

        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", "nguyenthihanhcvtv");
        ltOptions.put("accessKey", "CDm6BLqiLL9WG4nC4WK5UAP1V0p2jyX3GqpI6PGEOnHYFJ2iGg");
        ltOptions.put("video", true);
        ltOptions.put("project", "Untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-java");
        capability.setCapability("LT:Options", ltOptions);

        try {
            driver = new RemoteWebDriver(new URL(GlobalConstants.LAMBDA_URL), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
