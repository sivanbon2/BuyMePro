package Pages;


import BaseClasses.BaseWebdriver;
import BaseClasses.BasePage;
import Locators.PickBusinessLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PickBusiness extends BasePage {

        private WebDriver driver;
        private WebDriverWait wait;

        public void pickABusiness()throws Exception{
            pickOneBusiness(1);
            enterAmount();
            choose();

        }

        public PickBusiness () throws Exception {
            this.driver = BaseWebdriver.getDriverInstance();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

    private void pickOneBusiness(int index)throws Exception{
            clickElement(PickBusinessLocators.PickBusiness(1));

    }

    private void enterAmount()throws Exception{
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(PickBusinessLocators.ENTER_AMOUNT, "590")));
    }

    private void choose()throws Exception{
        clickElement(PickBusinessLocators.CHOOSE_BTN);
    }

    public String getUrl()  {
        return driver.getCurrentUrl();
    }
}
