import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Name_firstName'), 'Razor')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Name_lastName'), '27')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Email_userEmail'), 'Razor27@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Male'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Female'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Female'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Other'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Male'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Male'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Other'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_(10 Digits)_userNumber'), '0123456789')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_27'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Subjects_subjectsInput'), 'com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Computer Science'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/label_Music'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/textarea_Current Address_currentAddress'), 'EVOS LEGEND')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Delhi'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Thanks for submitting the form'), 
    0)

