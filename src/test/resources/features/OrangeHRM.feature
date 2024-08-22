Feature: Basic Login Feateures of Commerce

  Scenario: Launch of Application
    Given I launch my crome Browser
    When  I open URL of application
    Then  I verify homepage of HRM
    And Close the Browser.


    @Regression
  Scenario: Login into Application
    Given I launch my crome Browser
    When  I open URL of application "http://admin-demo.nopcommerce.com/login"
    Then  I verify homepage of HRM
    And I enter email address "admin@yourstore.com"
    And I enter password "admin"
    And I click on login button.
    Then I verify homepage after login.
    And Close the Browser.

  @Regression
  Scenario Outline: Login into Application
    Given I launch my crome Browser
    When  I open URL of application "http://admin-demo.nopcommerce.com/login"
    Then  I verify homepage of HRM
    And I enter email address "<email>"
    And I enter password "<password>"
    And I click on login button.
    Then I verify homepage after login.
    And Close the Browser.

  Examples:
    |email|password|
    | admin@yourstore.com   |   admin     |