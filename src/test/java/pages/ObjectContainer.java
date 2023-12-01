package pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
public class ObjectContainer{
    @FindBy(name = "account.country")
    public static  WebElementFacade INPUT_COUNTRY;
    @FindBy(xpath = "/html/body/div[1]/div[4]/a[2]")
    public static WebElementFacade DOG_CATEGORY;
    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")
    public static WebElementFacade PRODUCT_DALMATION;
    @FindBy(xpath = "//tbody/tr[2]/td[5]/a[1]")
    public static WebElementFacade BTN_ADD_TO_CART;
    @FindBy(name = "EST-9")
    public static WebElementFacade INPUT_QUANTITY;
    @FindBy(name = "updateCartQuantities")
    public static WebElementFacade BTN_UPDATE_CART;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/a")
    public static WebElementFacade BTN_PROCEED_TO_CHECKOUT;
    @FindBy(xpath = "//p[contains(text(),'Please enter your username and password.')]")
    public static WebElementFacade SMS_LOGIN;
    @FindBy(xpath = "//div[1]/div[2]/div/a[2]")
    WebElementFacade BTN_SIGN_IN;
    @FindBy(xpath = "//a[contains(text(),'Register Now!')]")
    public static WebElementFacade BTN_REGISTER_NOW;
    @FindBy(name = "newAccount")
    public static WebElementFacade BTN_SAVE_ACCOUNTS;
    @FindBy(name = "username")
    public static WebElementFacade INPUT_USER_ID;
    @FindBy(name = "password")
    public static WebElementFacade INPUT_NEW_PASSWORD;
    @FindBy(name = "repeatedPassword")
    public static WebElementFacade INPUT_REPEAT_PASSWORD;
    @FindBy(name = "account.firstName")
    public static WebElementFacade INPUT_FIRST_NAME;
    @FindBy(name = "account.lastName")
    public static WebElementFacade INPUT_LAST_NAME;
    @FindBy(name = "account.email")
    public static WebElementFacade INPUT_EMAIL;
    @FindBy(name = "account.phone")
    public static WebElementFacade INPUT_PHONE;
    @FindBy(name = "account.address1")
    public static WebElementFacade INPUT_ADRESS_1;
    @FindBy(name = "account.city")
    public static WebElementFacade INPUT_CITY;
    @FindBy(name = "account.state")
    public static WebElementFacade INPUT_STATE;
    @FindBy(name = "account.zip")
    public static WebElementFacade INPUT_ZIP;
}
