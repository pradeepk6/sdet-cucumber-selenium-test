package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class Header extends BasePage {

    //todo

    @Inject
    public Header(World driver) {
        super(driver);
    }
}
