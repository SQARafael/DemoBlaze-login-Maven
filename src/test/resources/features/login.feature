Feature: Login demoblaze

  @login
  Scenario Outline:login successfully
    Given user open url
    When user inser the credentials user "<User>" and password "<Password>"
    Then user can see a welcome message
    Examples:
      | User    | Password |
      | Rafaelc |1234      |