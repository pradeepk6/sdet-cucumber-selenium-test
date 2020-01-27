package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(World world) {
        this.driver = world.driver;
        wait = new WebDriverWait(driver, 15, 1000);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}


