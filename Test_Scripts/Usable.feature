Feature: Weight Watchers functionality test

Scenario Outline: Weight Watchers Multiple functionality test

Given User Open a dafault Browser
When User in home weightwatchers page
And wait for 10 seconds

And user clicks on "Find_a_StudioButton"control 

And wait for 10 seconds

Examples:
|Zipcode| 
|10011|