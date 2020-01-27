package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class StoreFinderPage extends BasePage {

    @Inject
    Header header;
    @Inject
    Footer footer;
    @Inject
    StoreFinderWidget storeFinderWidget;

    @Inject
    public StoreFinderPage(World driver) {
        super(driver);
    }

    public void visitPage() {
        driver.get("https://www.costcutter.co.uk/location-finder");
    }

    public StoreFinderWidget getStoreFinderWidget() {
        return storeFinderWidget;
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

}