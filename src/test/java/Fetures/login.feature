Feature: Login functionality
  This feature deals with login functionality

  Scenario:Loin with correct username and password
    Given I navigates to a webpage
    And I enter the following details
      | username | password      |
      | admin    | adminpassword |
    # And I username as "admin" and password "adminpwd"
    And I click on login button
    And I should see the userform

  Scenario Outline: Loin with correct username and password
    Given I navigates to a webpage
    And I enter my Email: Admin
    And I enter <username> and <password>
    And I click on login button
    And I should see the userform

    Examples:
      | username | password      |
      | execute     | automation |