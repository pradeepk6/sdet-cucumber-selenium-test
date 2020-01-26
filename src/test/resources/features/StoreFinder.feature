Feature: Store Finder

  Background:
    Given I am on the store finder page

  Scenario Outline: Find stores by entering a search term
    When I search for <searchTerm>
    Then results message should show <numResults> and <resultTerm>
    And num of results populated should be <numResults>
    Examples:
      | searchTerm | numResults | resultTerm  |
      | "london"   | 93         | "london"    |
      | "b15 1hn"  | 61         | "b15 1hn"   |
      | "b15"      | 62         | "b15"       |
      | "perth uk" | 2          | "perth, uk" |
      | "perth,uk" | 2          | "perth, uk" |
      | "wick"     | 0          | "wick"      |


  @pending
  Scenario Outline: Search for invalid location
    When I search for <searchTerm>
    Then store-finder does not do anything but show the invalid location in the search text box
    Examples:
      | searchTerm |
      | "zzzzz"    |
      | " "        |

  @pending
  Scenario Outline: Search results should be listed in increasing order of distance
    When I search for <searchTerm>
    Then results should be listed in increasing order of distance
    Examples:
      | searchTerm  |
      | "edinburgh" |

  @pending
  Scenario Outline: A search result should contain all details of the Store
    When I search for <searchTerm>
    Then should contain store header <header>
    And should contain store distance <distance>
    And should contain store address1 <addr1>
    And should contain store address2 <addr2>
    And should contain store telephone <tel>

    And should contain store operating info <operatingInfo>
    And should contain store opening hours <openingHours>
    And should contain services and facilities <servicesAndFacilities>
    Examples:
      | searchTerm  | header                        | addr1                         | addr2                | tel          | operatingInfo   | openingHours                                    | servicesAndFacilities |
      | "edinburgh" | "125 LOTHIAN ROAD, EDINBURGH" | "125 LOTHIAN ROAD, EDINBURGH" | "EDINBURGH, EH4 1HJ" | 01313 327131 | "hours,minutes" | "Monday,Sunday,6:00am - 9:00pm,7:00am - 9:00pm" | "cash,lottery"        |

    # many more tests to be written

