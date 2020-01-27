package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@ScenarioScoped
public class StoreFinderResultsPage extends BasePage {

    @Inject
    Header header;
    @Inject
    Footer footer;

    @FindBy(css = "div#totals h3")
    public WebElement resultsHeader;

    @FindBy(css = "div#filters")
    public WebElement filtersDiv;

    @FindBy(css = "div#map")
    public WebElement mapDiv;

    @FindBy(css = "div#results div.accordion-item")
    public List<WebElement> resultsList;

    @Inject
    StoreFinderWidget storeFinderWidget;

    @Inject
    RecipePageFragment recipePageFragment;

    @Inject
    public StoreFinderResultsPage(World driver) {
        super(driver);
    }

    public String getResultsHeaderText() {
        return wait.until(ExpectedConditions.visibilityOf(resultsHeader)).getAttribute("innerText");
    }

    public WebElement getMapDiv() {
        return mapDiv;
    }

    public List<WebElement> getSearchResults() {
        return resultsList;
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
