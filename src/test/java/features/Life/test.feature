Feature: Fill tab General by all products as different users for Life Insurance in Serbia
  Test will choose product from wizard and fill tab General

  Scenario Outline:

    Given login on app RS Test "TestData" "RSLife" "<row>"
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

    Then input duration of insurance and if product is Riziko kredit fill Izbor dužine trajanja
    And set place
    And set payment dynamic
    And set currency
    And set FXClause
    And set Payment Method and bank if method is Trajni nalog
    And choose vinculation option
    And click on next tab

    When tab is PersonConcerns
    And set Same person
    Then click on add button


    And on Iframe input Identification number
    And click on button Search
    And click on button Preview
    And click on button Accept
    Then check Info message on top of page
    And select payer option
    And choose legal representative
    #And add contract person

    When click on tab Concerns
    Then choose Calculation direction
    And input insured sum or premium
    And input height if product is not Favorit
    And input weight if product is not Favorit
    And input interest if product is Riziko kredit
    And check insured risks and sum or premium
    Then click on button Accept on top view
    And fill health questionnaire
    And click on button Save Questionnaire
    And click on button Calculate
    Then check calculation
    And click on button Activate
    Then check Info message on top of page
    Then check Warring message on top of page

    And fill Money laundry questionnaire
    Then check Info message on top of page
    And fill Associate money laundry questionnaire
    Then check Info message on top of page

    Then Print documents
    And upload documents on Documentation tab
    When click on Tile upload button
    And choose documents for upload
    And click on button load all
    Then select document type
    And select Confidentiality
    Then click on button Save
    And leave a iframe click on X button in right corner

    And click on button Certification of signature
    Then check Warring message After Certification Of Signature
    And check Info message After Certification Of Signature

    Examples:
      | row | TC ID          |
      | 1   | RS_LI_RK_100  |










