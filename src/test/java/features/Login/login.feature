@Smoke

Feature: Fill tab General by all products as different users for Life Insurance in Serbia
  Test will check users credentials


  Scenario Outline: "<username>"

    Given login on app RS Test
    When enter username "<username>"
    And enter password "<password>"
    And click on Submit button
    Then Logged in "<loggedUser>"
    And  page is Products

    Examples:
      | username   | password  | loggedUser    |
      | sCoreAgent | OvoJ3Test | sCoreAgent    |
      | sCoreBOC   | OvoJ3Test | sCoreBOC      |
      | sCoreUW    | OvoJ3Test | sCoreUW       |
      | dkerkez    | OvoJ3Test | Dragan Kerkez |
      | pkrasic    | OvoJ3Test | Petar Krasic  |










