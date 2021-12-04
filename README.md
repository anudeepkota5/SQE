## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.  Verify if the user is able to place the order with Credit card successfully
 2.  Verify if the user is able to place the order with Cash On Pickup successfully
 3.  Verify if the values of the Fields in the page are updated to default values when user clicks on Reset after providing the details
 4.  Verify if Cost is automatically calculated on updating the pizza1 and Quantity Fields
 5.  Verify if Quality accepts negitive values and aplha numeric charecters
 6.  Verify if Cost is a readonly Fields
 7.  Verify if Name and Phone Fields are mandatory and gives a dialog box if not provided during order creation
 8.  Verify if user is able to select only one payment type for one order at a time

#### Defects
1. Reset is not updating the values of Toppins1 and Toppings2
2. Quantity accpets negitive and alpha numberic charecters
3. User is able to select both payment types for one specific order
4. Email validation is not happening in email Fields
5. Phone number is accepting numeric values
6. Name is accepting numbers
