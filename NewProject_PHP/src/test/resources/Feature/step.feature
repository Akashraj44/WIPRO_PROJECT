Feature: PHPTravels Automation

@Smoke
Scenario Outline: Login

Given user launches browser

When user enters "<username>" and "<password>"

And clicks login button

Then validate login

Examples:

| username | password |
| user@phptravels.com | demouser |
| invalid@gmail.com | invalid |

@Regression
Scenario: Registration

Given user opens registration page

When user enters registration details

And clicks signup button

Then registration should be a successful

@Regression
Scenario: Search Hotel

Given user opens hotel search page

When user enters destination

And clicks hotel search

Then hotels should display