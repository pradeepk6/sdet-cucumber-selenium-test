package com.cc.practicaltest.pageobjects;

import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class StoreFinderResultsPage extends BasePage {

    @FindBy(css = "div#totals h3")
    public WebElement resultsHeader;

    @FindBy(css = "div#filters")
    public WebElement filtersDiv;

    @FindBy(css = "div#map")
    public WebElement mapDiv;

    @FindBy(css = "div#results div.accordion-item")
    public List<WebElement> resultsList;

    @Inject
    public StoreFinderResultsPage(World driver) {
        super(driver);
    }

    public String getResultsHeaderText() {
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#totals h3")));
        return wait.until(ExpectedConditions.visibilityOf(resultsHeader)).getAttribute("innerText");
    }

    public WebElement getMapDiv() {
        return mapDiv;
    }

    public List<WebElement> getSearchResults() {
        return resultsList;
    }
}
