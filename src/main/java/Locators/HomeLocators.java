package Locators;

import org.openqa.selenium.By;

//Home Page Locators
public class HomeLocators {


    public static final By AMOUNT_DROPDOWN = new By.ByXPath("//form/div/a/span[contains(text(),\"סכום\")]");

    public static final By AREA_DROPDOWN = new By.ByXPath("//form/div/a/span[contains(text(),\"אזור\")]");

    public static final By CATEGORY_DROPDOWN = new By.ByXPath("//form/div/a/span[contains(text(),\"קטגוריה\")]");

    public static final By FIND_A_GIFT_BTN = new By.ByXPath("//a[@class=\"ui-btn search ember-view\"]");

    public static By chooseFromDropDown(int index) {
        return new By.ByXPath("//ul/li[@data-option-array-index="+index+"]");
    }

}
