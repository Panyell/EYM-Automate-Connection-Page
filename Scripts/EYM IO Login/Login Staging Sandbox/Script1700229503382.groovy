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

WebUI.openBrowser('https://staging-io-web.excelym.com/')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('EYM IO - Login Page/Username - Email'))

WebUI.setText(findTestObject('EYM IO - Login Page/Username - Email'), 'super@excelym.com')

WebUI.delay(2)

WebUI.click(findTestObject('EYM IO - Login Page/Password'))

WebUI.setEncryptedText(findTestObject('EYM IO - Login Page/Password'), 'SYb/3ow/20+o2oI9OaGCEA==')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('EYM IO - Login Page/Login Button'))

WebUI.click(findTestObject('EYM IO - Login Page/Login Button'))

