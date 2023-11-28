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

WebUI.openBrowser('http://demoaut.katalon.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('CURA Objects/Page_CURA Healthcare Service/home_menu'))

WebUI.click(findTestObject('CURA Objects/Page_CURA Healthcare Service/sub_menu_login'))

username = 'John Doe'

pwd = 'ThisIsNotAPassword'

WebUI.setText(findTestObject('CURA Objects/Page_CURA Healthcare Service/input_username'), username)

WebUI.setText(findTestObject('CURA Objects/Page_CURA Healthcare Service/input_password'), pwd)

WebUI.click(findTestObject('CURA Objects/Page_CURA Healthcare Service/submit_login'))

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.verifyElementText(findTestObject('CURA Objects/Page_CURA Healthcare Service/login_successfully_page'), 'Make Appointment')

getText = WebUI.getText(findTestObject('CURA Objects/Page_CURA Healthcare Service/login_successfully_page'))

getText = getText.trim()

WebUI.verifyEqual(getText, 'Make Appointment')

WebUI.closeBrowser()

