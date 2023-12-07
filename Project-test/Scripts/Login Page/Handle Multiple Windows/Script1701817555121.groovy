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

WebUI.navigateToUrl('https://katalon.com/community-hub')

WebUI.click(findTestObject('Page_Katalon Community Hub/btn_Accept All Cookies'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Katalon Community Hub/btn_Join us now'))

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

actual_title = WebUI.getWindowTitle()

expected_title = 'Katalon Community'

WebUI.verifyEqual(actual_title, expected_title)

WebUI.verifyElementPresent(findTestObject('Page_Katalon Community Hub/Page_Katalon Community/text_Welcome to Katalon Community'), 
    5)

WebUI.focus(findTestObject('Page_Katalon Community Hub/Page_Katalon Community/btn_Maybe later'))

WebUI.rightClick(findTestObject('Page_Katalon Community Hub/Page_Katalon Community/btn_Maybe later'))

not_run: WebUI.switchToWindowTitle('Katalon Community')

not_run: WebUI.switchToWindowUrl('https://forum.katalon.com/latest')

not_run: WebUI.closeWindowUrl('https://forum.katalon.com/latest')

not_run: WebUI.closeBrowser()

