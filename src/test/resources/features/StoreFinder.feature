Feature: Store Finder

  Background:
    Given I am on the store finder page

  Scenario Outline: Find stores by entering a search term

    When I search for <searchTerm>
    Then results message should show <numResults> and <searchTerm>
    And num of results populated should be <numResults>
    And first result should contain <resultTerms>
    And resultsFilter fragment should be loaded
    And google map should be loaded
    And recipe fragment should be loaded
    And store-finder fragment should be loaded
    Examples:
      | searchTerm  | resultTerms    | numResults |
      | "edinburgh" | "lothian road" | 5          |
      | "b15 1hn"   | "birmingham"   | 61         |

  Scenario: Search for location where there are no stores
    When I search for <searchTerm>
    Then results message should show <numResults> and <searchTerm>
      | searchTerm | resultTerms | numResults |
      | "wick"     | "wick"      | 0          |

  @pending
  Scenario: Search for invalid location
    When I search for <searchTerm>
    Then store finder does not do anything but shows the invalid location in the search text box
      | searchTerm        |
      | "invalidLocation" |
