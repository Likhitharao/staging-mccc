import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Buynow Process/Buynow for Premium'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('User Details/Signin/Page_Laravel/a_SIGN IN INSTEAD'), 0)

WebUI.click(findTestObject('User Details/Signin/Page_Laravel/a_SIGN IN INSTEAD'))

WebUI.setText(findTestObject('User Details/Signin/Page_Laravel/input_Email_email'), Regemail)

WebUI.click(findTestObject('User Details/Signin/Page_Laravel/button_NEXT'))

WebUI.setEncryptedText(findTestObject('User Details/Signin/Page_Laravel/input_Password_password'), 'nbPRAawFRnE=')

WebUI.click(findTestObject('User Details/Signin/Page_Laravel/button_LOGIN'))

