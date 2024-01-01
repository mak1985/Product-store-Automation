Feature: Product store login functionality


  Scenario Outline: User should able to login with valid credentials
    Given user is on product store url page
    When user clicks on logIn text link
    Then log in window popup display
    When user enters "<username>"
    And user enter "<password>"
    And user clicks on log in button
    Then user should navigate to home page successfuly

    Examples:
    |username|password|
    |admin   |admin|
#    |dev     |dev123  |




