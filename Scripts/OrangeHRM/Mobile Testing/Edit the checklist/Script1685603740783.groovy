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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('ColornoteBasic/android.widget.TextView - Hello'), 0)

Mobile.tap(findTestObject('Object Repository/Colornote-TestAddNote/note_OptionButton'), 0)

Mobile.tap(findTestObject('Object Repository/Colornote-TestAddNote/note_EditButton'), 0)

Mobile.setText(findTestObject('Object Repository/Colornote-TestAddNote/note_EditText'), 'Hello guys', 0)

Mobile.tap(findTestObject('Colornote-TestAddNote/note_OKButton'), 0)

Mobile.tap(findTestObject('ColornoteBasic/note_SavedButton1'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Colornote-TestAddNote/noted_SavedHelloGuys'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('ColornoteBasic/note_SavedHello'), 0)

Mobile.pressBack()

Mobile.closeApplication()

