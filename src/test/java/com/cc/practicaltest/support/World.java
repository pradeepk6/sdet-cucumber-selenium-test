package com.cc.practicaltest.support;

import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.support.events.EventFiringWebDriver;

@ScenarioScoped
public class World {
    public EventFiringWebDriver driver = new DriverFactory().getDriver();
}
