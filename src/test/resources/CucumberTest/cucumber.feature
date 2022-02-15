Feature: Test in Cucumber

  Scenario: Load Page
    Given Page is loaded with "https://moja.nowaera.pl/"
    Then Page is closed

  Scenario: Create a Data for Registration Page and insert it to Page Moja Nowa Era
    Given Page is loaded with "https://moja.nowaera.pl/"
    When Click to Register
    And I miss something
    Then Insert Data FirstName with "Paweł"
    And Insert Data LastName with "Sitnik"
    And Insert Data Email
    And Insert Data Password with "SecretPassword123"
    And Confirm the Agreement
    And Scroll Down the Browser
    And Mark Checkbox by text "E-mailem"
    And Mark Checkbox by text "Drogą telefoniczną"
    And Mark Checkbox by text "SMS-em"
    And Submit the Registration
    Then Page is closed

  Scenario: Show me a list of services on site Moja Nowa Era
    Given Page is loaded with "https://moja.nowaera.pl/"
    When I see a list of services take it and show me it on List in Idea Java
    Then Page is closed

  Scenario: TestNG assertion
    Given Page is loaded with "https://moja.nowaera.pl/"
    When Click to Register
    And Title Create Account Find
    And Basic Assertion Are OK
    Then Page is closed

    Scenario Outline: Repeat Two Time with params
      Given Page is loaded with "https://moja.nowaera.pl/"
      When Click to Register
      And Insert Data FirstName with "<FirstName>"
      And Insert Data LastName with "<LastName>"
      Then Page is closed
      Examples:
      | FirstName |LastName  |
      |Pawel      |Sitnik    |
      |Krysia     |Szewc     |

      
      Scenario: Test for new page
        Given Page is loaded with "https://dlanauczyciela.pl/"
        Then Click to first Button
        And Click to Register on dla naczyciela
        And Page is closed

