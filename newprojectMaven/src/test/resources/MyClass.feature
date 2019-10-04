@Login
Feature: LoginTest

  Scenario Outline: I want to check if I can Login successfully
    Given I go to the landing page
    And I enter username "<username>"
    And I enter password "<password>"
    When I click on Login
    Then I verify title of Homepage
    Then I click on sign out
    And I successfully Logout

    Examples: 
      | username | password |
      |     1303 | Guru99   | 


@Login
    Scenario Outline: I want to check if I can Login incorrectly
    Given I go to the landing page
    And I enter username "<username>"
    And I enter password "<password>"
    When I click on Login
    And I see an error message

    Examples: 
    
      | username | password |  
      |     1304 | Guru99   | 
      |     1303 | Guru98   |
      |     1304 | Guru98   |
      
      
      
      