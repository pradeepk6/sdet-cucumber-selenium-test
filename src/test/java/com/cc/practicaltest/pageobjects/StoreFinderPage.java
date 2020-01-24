package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;

public class StoreFinderPage extends BasePage {

    @Inject
    public StoreFinderPage(World driver) {
        super(driver);
    }

    public void visitPage() {
        driver.get("https://www.costcutter.co.uk/location-finder");
    }


}