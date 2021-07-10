package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;
import Locators.HomeLocators;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static BaseClasses.BaseWebdriver.takeScreenShot;


public class HomePage extends BasePage  {
    private WebDriver driver;
    private WebDriverWait wait;

    public void pickFromHome() throws Exception {
        pickPrice(6);
        pickArea(2);
        pickCategory(2);
        findMeGiftBtn();
    }

    public HomePage() throws Exception {
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void pickPrice(int index) throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.AMOUNT_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));
    }
    private void pickArea(int index) throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.AREA_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));

    }

    private void pickCategory(int index) throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.CATEGORY_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));
    }

    private void findMeGiftBtn() throws Exception {
        clickElement(HomeLocators.FIND_A_GIFT_BTN);
    }

    public String getUrl()  {
      return driver.getCurrentUrl();
    }

}