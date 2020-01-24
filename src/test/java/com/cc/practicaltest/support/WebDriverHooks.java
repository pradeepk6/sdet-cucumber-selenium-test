package com.cc.practicaltest.support;

import com.google.inject.Inject;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

public class WebDriverHooks {

    @Inject
    private World world;

    @Before
    public void setUp() {
        world.driver.manage().window().maximize();
    }

    @After
    public void finish(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = world.driver.getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        if (world.driver != null) {
            world.driver.quit();
        }
    }
}
