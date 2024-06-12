package pageUIs;

public class BaseElementUI {
    public static final String HOMEPAGE_LOGO_IMAGE = "xpath=//div[@class='header-logo']//img";
    public static final String REWARD_POINT_PAGE_LINK = "xpath=//div[@class='listbox']//a[text()='Reward points']";
    public static final String DOWNLOADABLE_PRODUCT_PAGE_LINK = "xpath=//div[@class='listbox']//a[text()='Downloadable products']";
    public static final String ADDRESSES_PAGE_LINK = "xpath=//div[@class='listbox']//a[text()='Addresses']";
    public static final String CUSTOMER_INFOR_PAGE_LINK = "xpath=//div[@class='listbox']//a[text()='Customer info']";
    public static final String USER_LOGOUT_LINK = "xpath=//a[text()='Log out']";
    public static final String ADMIN_LOGOUT_LINK = "xpath=//a[text()='Logout']";
    public static final String UPLOAD_FILE_TYPE = "xpath=//input[@type='file']";
    public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
    public static final String DYNAMIC_TEXTBOX_BY_TEXT = "xpath=//input[@id='%s']";
    public static final String DYNAMIC_DROPDOWN_BY_TEXT = "xpath=//select[@name='%s']";
    public static final String DYNAMIC_HEADER_LINK_BY_NAME = "xpath=//div[@class='header-links']//a[contains(string(),'%s')]";
}
