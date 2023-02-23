Feature: Login
  login test as agent

  Scenario Outline: TEST login

    Given login on app RS Test "TestData" "RS" "<row>"
    When enter username
    And enter password
    And click on Submit button
    Then Logged in
    And  page is Products

    Then Choose LOB
    And Choose product
    And Choose NewContract
    And click on product icon
    Then opens a General tab

    Then input duration of insurance
    And set place
    And  set payment dynamic
    And set currency
    And set FXClause
    And set Payment Method
    And click on Tab Person
    Then we get info message and opens a Person tab

    Examples:
      | row |
      | 1   |









