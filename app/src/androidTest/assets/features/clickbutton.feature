Feature: Click the button
  Click the button and check text is changed

  Scenario Outline: Click the button and check text is changed =
    Given I have a MainActivity
    When I click button
    Then I should see new text on the display

    Examples:
      |  |  |  |
      |  |  |  |

    # Add N + 1 rows to Examples table so that it runs N times the test.

