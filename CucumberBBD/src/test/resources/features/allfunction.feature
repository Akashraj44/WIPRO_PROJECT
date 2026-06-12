Feature: Tutorials Ninja Functionality
@smoke
Scenario Outline: Register Login Search Add To Cart check full function

Given browser opens

When user clicks My Account menu
And user clicks Register option
And user enters first name <firstname>
And user enters last name <lastname>
And user enters email <email>
And user enters phone number <phone>
And user enters password <password>
And user confirms password <cpassword>
And user accepts privacy policy
And user clicks continue button
And user clicks My Account again
And user clicks Login option
And user enters login email <email>
And user enters login password <password>
And user clicks login button
And user clicks search field
And user enters product name <product>
And user clicks search button
And user clicks add to cart button
Then product added successfully
And user checkout product
And user remove product
And user logout account
Then process completed successfully
Examples:

| firstname | lastname | email | phone | password | cpassword | product |
| Akash | Raj | akash6254154@gmail.com | 9876543210 | 12345 | 12345 | iphone |
| Aman | Kumar | test698157@gmail.com | 9876543211 | test123 | test123 | macbook |
