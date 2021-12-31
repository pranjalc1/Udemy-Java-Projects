# Udemy-Java-Projects
This is a compilation of my Java projects (completed in Winter 2021) from prompts from Tim Short's Udemy course _Practice Java by Building Projects_.

## Email-Admin-Application
* Email Administration Application Project
* Generates email with syntax _firstname.lastname@department.company.com_
* Determines department (if none, leave blank)
* Generates random String for password
* Creates set methods to change password, mailbox capacity, and an alternate email address
* Creates get methods to display name, email, and mailbox capacity

## Student-Database-Application
* Student Database Application Project
* Asks user how many new students will be added to database
* User will be prompted to enter name and year for each student
* Each student has 5-digit unique ID, with first number being grade level
* Student can enroll in the _History 101, Math 101, English 101, Chemistry 101, or Computer Science 101_, each costing $600 to enroll
* Student should be able to view balance and pay tuition
* To see status of the student, we should see the name, ID, courses enrolled, and balance

## New-Bank-Account-Application
* Bank Application Project
* Reads a .csv file of names, social security numbers, account types, and initial deposits
* Uses a proper data structure to hold accounts
* Both savings and checking accounts share: _deposit(), withdraw(), transfer(), showInfo(), 11 digit account number (generated with a process)_
* Savings account holders given safety deposit box, identified by 3-digit number and acessed with 4-digit code
* Checking account holders assigned a debit card with a 12-digit number and a 4-digit PIN
* Both accounts use an interface to determine base interest rate (saving is 0.25 points less than the base rate, checking accounts use 15% of the base rate)
* ShowInfo method reveals relevant account information and info specific to Checking/Savings account