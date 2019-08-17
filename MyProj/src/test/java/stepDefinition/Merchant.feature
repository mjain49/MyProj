Feature: New Merchant Registeration  

Scenario: Invalid Category
Given User is on 'register' Page 
When User Enters Invalid Category 
Then display 'Please Enter Valid Category'

Scenario: Valid Category
Given User is on 'register' Page 
When User Enters Valid Category and Category="Merchant"
And Display 'merchant' page


Scenario: Invalid First Name
Given User is on 'merchant' Page 
When User Enters Invalid First Name
Then display 'Please Enter Valid First Name'

Scenario: Invalid Last Name
Given User is on 'merchant' Page 
When User Enters Invalid Last Name
Then display 'Please Enter Valid Last Name'

Scenario: Invalid Company Name
Given User is on 'merchant' Page 
When User Enters Invalid Company Name
Then display 'Please Enter Valid Company Name'

Scenario: Invalid Mobile Number
Given User is on 'merchant' Page 
When User Enters Invalid Mobile Number
Then display 'Please Enter Valid Mobile Number'

Scenario: Invalid Address
Given User is on 'merchant' Page 
When User Enters Invalid Address 
Then display 'Please Enter Your Valid Address'

Scenario: Invalid Password
Given User is on 'merchant' page
When User Enters Invalid Password
Then display 'Please Enter Valid Password'

Scenario: Invalid ConfirmPassword
Given User is on 'merchant' page
When User Enters Invalid Password
Then display 'Please Enter Valid ConfirmPassword'

Scenario: Invalid Answer for SecrityQuestion1
Given User is on 'merchant' page
When User Enters Invalid Answer for SecrityQuestion1
Then display 'Please Enter Valid Answer for SecrityQuestion1'

Scenario: Invalid Answer for SecrityQuestion2
Given User is on 'merchant' page
When User Enters Invalid Answer for SecrityQuestion2
Then display 'Please Enter Valid Answer for SecrityQuestion2'

Scenario: Valid Details
Given User is on 'merchant' Page
When User clicks on Create Account
Then display 'Yoursuccess' Page




