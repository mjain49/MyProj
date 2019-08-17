Feature: New Admin Registeration  

Scenario: Invalid Category
Given User is on 'register' Page 
When User Enters Invalid Category 
Then display 'Please Enter Valid Category'

Scenario: Valid Category
Given User is on 'register' Page 
When User Enters Valid Category and Category="Admin"
And Display 'admin' page


Scenario: Invalid First Name
Given User is on 'admin' Page 
When User Enters Invalid First Name
Then display 'Please Enter Valid First Name'

Scenario: Invalid Last Name
Given User is on 'admin' Page 
When User Enters Invalid Last Name
Then display 'Please Enter Valid Last Name'

Scenario: Invalid EmailID
Given User is on 'admin' Page 
When User Enters Invalid EmailID 
Then display 'Please Enter Valid EmailID'

Scenario: Invalid Password
Given User is on 'admin' page
When User Enters Invalid Password
Then display 'Please Enter Valid Password'

Scenario: Invalid ConfirmPassword
Given User is on 'admin' page
When User Enters Invalid Password
Then display 'Please Enter Valid ConfirmPassword'

Scenario: Invalid Answer for SecrityQuestion1
Given User is on 'admin' page
When User Enters Invalid Answer for SecrityQuestion1
Then display 'Please Enter Valid Answer for SecrityQuestion1'

Scenario: Invalid Answer for SecrityQuestion2
Given User is on 'admin' page
When User Enters Invalid Answer for SecrityQuestion2
Then display 'Please Enter Valid Answer for SecrityQuestion2'

Scenario: Valid Details
Given User is on 'admin' Page
When User clicks on Create Account
Then display 'Yoursuccess' Page




