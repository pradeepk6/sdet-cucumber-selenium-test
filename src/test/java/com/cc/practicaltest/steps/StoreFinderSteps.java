package com.cc.practicaltest.steps;

import com.cc.practicaltest.pageobjects.StoreFinderPage;
import com.cc.practicaltest.pageobjects.StoreFinderResultsPage;
import com.cc.practicaltest.support.World;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class StoreFinderSteps {

    @Inject
    private StoreFinderPage storeFinderPage;
    @Inject
    private StoreFinderResultsPage storeFinderResultsPage;
    @Inject
    World world;

    @Given("I am on the store finder page")
    public void i_am_on_the_store_finder_page() {
        storeFinderPage.visitPage();
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        storeFinderPage.getStoreFinderWidget().findStores(string);
    }

    @Then("results message should show {int} and {string}")
    public void results_message_should_show(Integer numResults, String searchTerm) {
        String resultsHeader = storeFinderResultsPage.getResultsHeaderText().toLowerCase();
        assertTrue(resultsHeader.contains(numResults.toString())
                && resultsHeader.contains(searchTerm.toLowerCase()));
    }

    @Then("num of results populated should be {int}")
    public void num_of_results_populated_should_be(Integer numResults) {
        assertTrue(storeFinderResultsPage.getSearchResults().size() == numResults);
    }

    @Then("first result should contain {string}")
    public void first_result_should_contain_edinburgh(String resultTerm) {
        String storeDetails = storeFinderResultsPage.getSearchResults().get(0).getAttribute("innerText");
        assertTrue(storeDetails.toLowerCase().contains(resultTerm.toLowerCase()));
    }
}