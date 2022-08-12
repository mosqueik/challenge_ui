Feature: Search Wikipedia


  Scenario: Search Voyager 1 in wikipedia
    Given I open the base url
    Then I should see the "Wikipedia" title of the page
    When I type the search string "Voyager 1" and click on search button
    Then I should see the "Voyager 1" title of the page
    And I should see the searched page title containing "Voyager 1"
