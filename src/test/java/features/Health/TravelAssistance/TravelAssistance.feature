Feature: Serbia
  Create policy for all products of TravelAssistance in Serbia


  Scenario Outline: Health - Scenario: Create policy for all products of TravelAssistance.
    As I user should be able to create policy for all products

    Given login on app RS Test "PA-testData" "PA" "<row>"
    When enter username
    And enter password
    And click on Submit button
    Then Logged in
    And  page is Products

    Then choose LOB
    And choose product
    And choose Document type

    Then choose Contract type
    And choose Destination
    And input Duration of insurance
    And set Country
    And set Place
    And set Payment Method
    And click on tab Persons

    Then set Same person
    And click on add button

    And on Iframe input Identification number
    And click on button Search
    And click on button Preview
    And click on button Accept
    Then check Info message on top of page

    When click on Concerns tab
    Then check Info message after click on concerns tab on top of page
    And choose Package
    And choose Insured sum
    And choose Sum correction
    And choose Franchise
    Then add insured persons
    And click on button Calculate

    Then check calculated Premium
    And click on button Activate
    And click on button Print PUI
    And click on button Confirm Payment
    And click on button Certification of signature
    Then check Info message After Certification Of Signature
    And click on button Print conditions


    Examples:
      | row | TC ID         |
      | 1   | RS_NE_PA_100  |
      | 2   | RS_NE_PA_101  |
      | 3   | RS_NE_PA_102  |
      | 4   | RS_NE_PA_103  |











