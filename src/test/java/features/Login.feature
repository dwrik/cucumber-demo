Feature: Login Feature

  Scenario Outline: Login is successful with valid credentials
    Given driver is initialized
    And user is on the login page "https://demo.guru99.com/V4/index.php"
    When user logs in using "<username>" and "<password>"
    Then verify user is logged in
    And close browser

    Examples:
    | username   | password |
    | mngr395438 | tAqAhAn  |
    | mngr395441 | hEzYdUv  |

  Scenario: Login fails with invalid credentials
    Given driver is initialized
    And user is on the login page "https://demo.guru99.com/V4/index.php"
    When user logs in using "mngr395438" and "secret"
    Then verify user is not logged in
    And close browser
