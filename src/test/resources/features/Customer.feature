Feature: Add Customer


  @Regression1
  Scenario Outline: Add New Customer
    Given I launch my crome Browser
    When  I open URL of application "http://admin-demo.nopcommerce.com/login"
    Then  I verify homepage of HRM
    And I enter email address "<email>"
    And I enter password "<password>"
    And I click on login button.
    Then I verify homepage after login.
    And I click on customers Dropdown
    Then I click on customers option from list
    Then I click on add button from customer page
    And Close the Browser.
    #And Close the Browser.

    Examples:
      |email|password|
      | admin@yourstore.com   |   admin     |