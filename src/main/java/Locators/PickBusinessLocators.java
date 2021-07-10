package Locators;

import org.openqa.selenium.By;

public class PickBusinessLocators {

    public static By PickBusiness(int index) {
        return new By.ByXPath("//ul[@class='grid bm-product-cards']/li["+index+"]");
    }

    public static final By ENTER_AMOUNT = new By.ByXPath("//input[@type=\"tel\"][1]");
    public static final By CHOOSE_BTN = new By.ByXPath("//button[@class=\"ember-view bm-btn no-reverse main md stretch\"][1]");

}
