Feature: Create policy for all products of Meduniqa in Serbia


  Scenario Outline:

    Given login on app RS Test "PA-testData" "MU" "<row>"
    When enter username
    And enter password
    And click on Submit button
    Then Logged in
    And  page is Products

    Then choose LOB
    And choose product
    And choose Document type

    Then input Duration of insurance
    #And set Country
    And set Place
    Then choose Tariff groups
    And choose Classification types
    And choose Premium calculation types

    Then set payment dynamic
    And set currency
    And set FXClause
    And set Payment Method
    Then click on tab Persons


    Then click on add button
    And set Same person

    And on Iframe input Identification number
    And click on button Search
    And click on button Preview
    And click on button Accept
    Then check Info message on top of page

    Then input height
    And input weight
    And status of insured person
    And choose Package
    And choose insured risks and sums
    And fill health questionnaire
    Then click on button Accept
    And click on button Calculate

    Then check calculated Premium
    And click on button Activate
    Then print offer document and health questionnaire
    And upload offer document
    And click on button Certification of signature
    Then check Warring message After Certification Of Signature
    And check Info message After Certification Of Signature


    Examples:
      | row | TC ID         |
      | 1   | RS_NE_MU_101  |
      | 2   | RS_NE_MU_102  |
      #| 3   | RS_NE_MU_103  |
      #| 4   | RS_NE_MU_104  |










