package BaseClasses;

import Utils.ReportUtils;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static BaseClasses.BaseWebdriver.takeScreenShot;

public class BasePage {

    // Click on Element by one of the locators
    public By clickElement(By locator) throws Exception {
        try{
         getWebElement(locator).click();

        } catch (NoSuchElementException e){
            String timeNow = String.valueOf(System.currentTimeMillis());
            ReportUtils.test.info("Element Was Not Found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }
        return locator;
    }

    // SendKeys(text) to one of the locators
    public By sendKeysToElement(By locator, String text) throws Exception {
        try{
        getWebElement(locator).sendKeys(text);

        }catch (NoSuchElementException e){
            String timeNow = String.valueOf(System.currentTimeMillis());
            ReportUtils.test.info("Element Was Not Found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());

        }
        return locator;
    }

    //Get Element
    private WebElement getWebElement(By locator) throws Exception {

        try {
            WebElement findLocator = BaseWebdriver.getDriverInstance().findElement(locator);
            System.out.println(findLocator);

        } catch (NoSuchElementException e) {
            String timeNow = String.valueOf(System.currentTimeMillis());
            ReportUtils.test.info("Element Was Not Found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }
        return BaseWebdriver.getDriverInstance().findElement(locator);

    }

}
