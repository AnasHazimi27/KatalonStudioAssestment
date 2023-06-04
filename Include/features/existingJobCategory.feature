Feature: Existing Job Category
Scenario Outline: Fail to add existing job categories

	Given User is navigated to Job Categories Page
	When User click on the add Job Categories button
	And User enters exist Job Categories <Job Categories>
	And User clicks on Save button at Job Categories page
	Then User is shown popup messages on already exist
	
Examples:
			
		|Job Categories|
		|Technicians|
			