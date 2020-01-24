package com.cc.practicaltest.support;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverFactory {
    private WebDriver driver;

    public EventFiringWebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            driver = new ChromeDriver();
        }
        return new EventFiringWebDriver(driver);
    }
}
