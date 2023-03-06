Feature: Fill tab General by all products as different users for Life Insurance in Serbia
  Test will choose product from wizard and fill tab General

  Scenario Outline:

    Given login on app RS Test "TestData" "RS" "<row>"
    When enter username
    And enter password
    And click on Submit button
    Then Logged in
    And  page is Products

    Then Choose LOB
    And Choose product
    And Choose Product type
    And click on product icon
    Then tab is General

    Then input duration of insurance
    And set place
    And set payment dynamic
    And set currency
    And set FXClause
    And set Payment Method
    And click on next tab
    Then tab is PersonConcerns


    Examples:
      | row | TC ID          |
      | 1   | RS_LI_FA_1001  |
      | 2   | RS_LI_FA_1002  |
      | 3   | RS_LI_FA_1003  |
      | 4   | RS_LI_FA_1004  |
      | 5   | RS_LI_FA_1005  |
      | 6   | RS_LI_FA_1006  |
      | 7   | RS_LI_FA_1007  |
      | 8   | RS_LI_FA_1008  |
      | 9   | RS_LI_FA_1009  |
      | 10  | RS_LI_FA_10010 |
      | 11  | RS_LI_FA_10011 |
      | 12  | RS_LI_FA_10012 |
      | 13  | RS_LI_FA_10013 |
      | 14  | RS_LI_FA_10014 |










