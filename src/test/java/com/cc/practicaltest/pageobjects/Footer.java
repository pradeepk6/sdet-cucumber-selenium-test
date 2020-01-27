package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class Footer extends BasePage {

    //todo

    @Inject
    public Footer(World driver) {
        super(driver);
    }

}
