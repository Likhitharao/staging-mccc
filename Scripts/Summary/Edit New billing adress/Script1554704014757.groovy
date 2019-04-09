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

WebUI.comment('Edit New Billing Address')

'Scroll upto edit button'
WebUI.scrollToElement(findTestObject('Summary/Edit Billing/Page_/Edit new billing button'), 0)

'Click on edit button'
WebUI.click(findTestObject('Summary/Edit Billing/Page_/Edit new billing button'))

'Edit first name'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/new_First name'), 'Levis')

'Edit last name'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_Last name'), 'hary')

'Scroll upto button next\r\n'
WebUI.scrollToElement(findTestObject('User Details/New Billing address/Page_/button_Next'), 0)

'Click on button next'
WebUI.click(findTestObject('User Details/New Billing address/Page_/button_Next'))

