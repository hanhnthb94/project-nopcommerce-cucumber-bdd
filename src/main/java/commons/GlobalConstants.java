package commons;

import java.io.File;

public class GlobalConstants {
    public static final String DEV_USER_URL = "https://demo.nopcommerce.com/";
    public static final String DEV_ADMIN_URL = "https://admin-demo.nopcommerce.com/";
    public static final String PANDA_USER_URL = "http://live.techpanda.org/";
    public static final String PANDA_ADMIN_URL = "http://live.techpanda.org/index.php/backendlogin";
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 30;
    public static final String DEV_ADMIN_USERNAME = "admin@yourstore.com";
    public static final String DEV_ADMIN_PASSWORD = "admin";
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "downloadFiles" + File.separator;
    public static final String REPORTING_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator + "reportNGImage" + File.separator;
    public static final String BROWSER_EXTENSION = RELATIVE_PROJECT_PATH + File.separator + "browserExtensions" + File.separator;

    public static final String RESOURCE_PATH = RELATIVE_PROJECT_PATH + File.separator + "resources" + File.separator;
    public static final String ADMIN_ORANGE_HRM_USERNAME = "Admin"; //"automationfc";
    public static final String ADMIN_ORANGE_HRM_PASSWORD = "admin123";//"automationfcA@1";
    public static final String DATA_TEST_PATH = RELATIVE_PROJECT_PATH + File.separator + "testdata" + File.separator;
    public static final String ENVIRONMENT_CONFIG_PATH = RELATIVE_PROJECT_PATH + File.separator + "environmentConfig" + File.separator;
    public static final String BROWSER_USERNAME = "hnhnguynth_ExoMns";
    public static final String BROWSER_AUTOMATE_KEY = "63e7uE8q3PQbrCakpqV3";
    public static final String BROWSER_STACK_URL = "https://" + BROWSER_USERNAME + ":" + BROWSER_AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final String SAUCE_URL = "https://ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    public static final String CROSS_URL = "";
    public static final String LAMBDA_URL = "https://nguyenthihanhcvtv:CDm6BLqiLL9WG4nC4WK5UAP1V0p2jyX3GqpI6PGEOnHYFJ2iGg@hub.lambdatest.com/wd/hub";

}
