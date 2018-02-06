@SeeyourQuote
Feature: Go to the homepage.

In Order to: become a site member
As a Vistor
I want to Go to homepage,enter Zipcode,Select Gender, Date of Birth,Select Height and enter Weight,Coverage Amount, Termlenght, 
and select two check box and enter Email and hit See Your Quote button.
  
Scenario Outline: Positive Selection
   
Given User visits homepage.
When user selects Gender,Date of Birth,Coverage Amount,Termlenght    
And user clicks yes radio button on Are you a AAA member  .
And user clicks yes radio button on Have you used nicotine in the last 12 months . 
And user enters Zip Code, Email, Weight "<11101>", "<abc@gmail.com>" ,"<Weight>" .
Then user clicks on SeeYourQuote button.

Examples:
|Zip Code| |    Email    |  |Weight|
| 11101  | |abc@gmail.com|  |  59  |
