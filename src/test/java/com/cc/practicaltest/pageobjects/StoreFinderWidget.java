package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class StoreFinderWidget extends BasePage {

    @FindBy(css = "input[name='searchLocation']")
    public WebElement findMyStore_txtBox;

    @FindBy(xpath = "//button[contains(., 'Find my store')]")
    public WebElement findMyStore_submitButton;

    @Inject
    public StoreFinderWidget(World driver) {
        super(driver);
    }

    public void findStores(String location) {
        findMyStore_txtBox.sendKeys(location);
        findMyStore_submitButton.submit();
    }
}
