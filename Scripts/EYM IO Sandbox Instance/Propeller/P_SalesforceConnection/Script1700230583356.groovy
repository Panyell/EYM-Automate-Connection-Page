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

WebUI.callTestCase(findTestCase('EYM IO Login/Login Propeller Sandbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('EYM IO - Dashboard Page/IO Maintenance'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('EYM IO - Dashboard Page/IO Connection'))

WebUI.delay(2)

WebUI.click(findTestObject('EYM IO - Dashboard Page/IO Connection'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('EYM IO - Connection Page/Propeller/Propeller Sandbox/P_SalesforceTokenBased'))

WebUI.delay(2)

WebUI.click(findTestObject('EYM IO - Connection Page/Propeller/Propeller Sandbox/P_SalesforceTokenBased'))

WebUI.waitForJQueryLoad(30)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('EYM IO - Dashboard Page/Connection - Successful'), 0)

WebUI.verifyTextPresent('Connection Successful.', false)

if (WebUI.verifyTextPresent('Connection Successful.', true) == true) {
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

