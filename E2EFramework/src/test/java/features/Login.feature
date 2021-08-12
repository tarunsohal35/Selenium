Feature: Applicaation login

Scenario Outline:: Application Login

Given : intiate the browser
And : open "http://www.qaclickacademy.com/" and click on login button
When : sign in with <username> and <password>
Then : get the error message
And : close the browser

Examples:
|username      |password  |
|tarunsohal    |3000084136|
|samuel        |2314kla   |