Scenario: Valid login
  Given User is on the homepage
  When User enters username and password
  And clicks login button
  Then User should be redirected to dashboard
