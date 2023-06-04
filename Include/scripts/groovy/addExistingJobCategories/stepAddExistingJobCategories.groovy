package addExistingJobCategories

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class stepAddExistingJobCategories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is navigated to Job Categories Page")
	def userNavigatedToJobCategories() {
		WebUI.callTestCase(findTestCase('Common/Login'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/li_Job'))

		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/li_Job Categories'))
	}

	@When("User click on the add Job Categories button")
	def userClickButton() {
		WebUI.click(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/button_Add'))
	}

	@And("User enters exist Job Categories (.*)")
	def enterDetails(String jobCategories) {
		WebUI.setText(findTestObject('Object Repository/JobCategory/AddJobCategory/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'),
				jobCategories)
	}

	@And("User clicks on Save button at Job Categories page")
	def userClicksButton() {
		WebUI.click(findTestObject('JobCategory/AddJobCategory/Page_OrangeHRM/button_Save'))
	}

	@Then("User is shown popup messages on already exist")
	def Popupmessagealreadyexist() {
		WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/span_Already exist'), 0)
	}
}