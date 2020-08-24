Feature: Weight Watchers functionality test

Scenario Outline: Weight Watchers Multiple functionality test

Given User Open a dafault Browser
When User in home weightwatchers page
 
And Verify that the loaded page title Contains Weight Loss
#And wait for 10 seconds
When User click on Find a studio
#And wait for 10 seconds
And Verify that loaded page title contains Meetings Near You
#And wait for 10 seconds
When User enters zip code as "<Zipcode>" search for meetings In the search field
#And wait for 10 seconds
And Click on arrow Button
#And wait for 10 seconds
And Print the title of the first result and the distance
#And wait for 10 seconds
When User click on the first search result
#And wait for 10 seconds
And User Verify that displayed location name matches with the name of the first searched
#And wait for 10 seconds
And User Print TODAYs hours of operation from this location page
#And wait for 10 seconds
Then User cloes the browser
#And wait for 10 seconds
Examples:
|Zipcode|
|10011|