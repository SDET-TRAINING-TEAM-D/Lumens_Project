Feature: This is to test  Lumen page 


Scenario Outline:  Lumen Create a new register scenario
 Given user opens browser
 Then user clicks on register button
 When user is  going to  enter uid "<SheetName>" and pwd <RowNumber> 
Then user click on continue button
Examples:
|SheetName|RowNumber|
|DataSheet|0| 

Scenario Outline: Validate Lumen login livechat  Page Test

 Given user Lumen login livechat  Page open the browser
 
 Then user  Lumen login livechat  Page 
 
Examples:
|SheetName|RowNumber|
|User|0| 

Scenario Outline: Validate Lumen Login Page Test

 Given user Lumen open the browser
 Then user enters the username "<SheetName>" and password <RowNumber>  
 Then user click on Login button
 Then user gets the title of the page
 Then user navigate the Home page to product page
Examples:
|SheetName|RowNumber|
|User|0| 


Scenario Outline: Validate Lumen product navigation Page Test

 Given user Lumen product navigation open the browser
 Then user product navigation enters the username "<SheetName>" and password <RowNumber>  
 Then user product navigation click on Login button
 Then user  product navigation the Home page to product page
 Then user moves to zip and product cart page
 
Examples:
|SheetName|RowNumber|
|User|0| 

Scenario Outline: Validate Lumen Product Page Test

 Given user Lumen Product open the browser
 Then user  Lumen Product enters the username "<SheetName>" and password <RowNumber>  
 Then user  Lumen Product  click on Login button
 Then user  serach the product on the page to add cart
 Then user enter the promocode on th cart page
Examples:
|SheetName|RowNumber|
|User|0|

#

Scenario Outline: Validate Lumen Product remove Page Test

 Given user  Product remove open the browser
 Then user   Product remove enters the username "<SheetName>" and password <RowNumber>  
 Then user   Product remove  click on Login button
 Then user   product remove on the page to add cart
Examples:
|SheetName|RowNumber|
|User|0|


Scenario Outline: Validate Lumen mouse over product  Page Test

 Given user Lumen mouse over product Page open the browser
 Then user Lumen mouse over product  Page enters the username "<SheetName>" and password <RowNumber>  
 Then user Lumen mouse over product  Page click on Login button
 Then user Lumen mouse over product  Page 
 Then user Lumen  productPage and quantity add
Examples:
|SheetName|RowNumber|
|User|0|



Scenario Outline: Validate Lumen product shipping  Page Test

 Given user Lumen product shipping open the browser
 Then user product shipping enters the username "<SheetName>" and password <RowNumber>  
 Then user pproduct shipping click on Login button
 Then user  add product in cart and details in page
 
Examples:
|SheetName|RowNumber|
|User|0| 




Scenario Outline: Validate Lumen product adding quantity  Page Test

 Given user Lumen product adding quantity open the browser
 Then user product adding quantity enters the username "<SheetName>" and password <RowNumber>  
 Then user product adding quantity click on Login button
 Then user  product adding quantity in page
 
Examples:
|SheetName|RowNumber|
|User|0| 


Scenario Outline: Validate Lumen logout Page Test

 Given user  Product logout open the browser
 Then user    enters the username "<SheetName>" and password <RowNumber>  
 Then user   enter   click on Login button
 Then user   logout on the page 
Examples:
|SheetName|RowNumber|
|User|0|