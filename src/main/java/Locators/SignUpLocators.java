package Locators;
import org.openqa.selenium.By;

//SignUp page locators
public class SignUpLocators {

    public static final By NAVBARBUTTONS = new By.ByCssSelector("ul[class=\"nav-bar buttons\"]");

    public static final By ENTERANDREGISTRATION = new By.ByCssSelector("span[class=\"seperator-link\"]");

    public static final By REGISTRATION = new By.ByCssSelector("span[class=\"text-link theme\"]");

    public static final By FULLNAME = new By.ByCssSelector("input[class=\"ember-view ember-text-field\"]");

    public static final By EMAIL = new By.ByCssSelector("input[data-parsley-type=\"email\"]");

    public static final By PASSWORD = new By.ByXPath("//input[contains(@placeholder, 'סיסמה')]");

    public static final By PASSWORDAUTHENTICATION = new By.ByXPath("//input[contains(@placeholder, 'אימות סיסמה')]");

    public static final By REGISTRATIONBUTTON = new By.ByXPath("//button[@type=\"submit\"][@class=\"ember-view bm-btn no-reverse main md stretch\"]");


}
