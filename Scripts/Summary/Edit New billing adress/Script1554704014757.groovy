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

WebUI.comment('')

WebUI.scrollToElement(findTestObject('Summary/Edit Billing/Page_/i_Mr  sam samfdgdfgdfgCaithness5643213Australiasgmailcom124545645_fa fa-edit'), 
    0)

WebUI.click(findTestObject('Summary/Edit Billing/Page_/i_Mr  sam samfdgdfgdfgCaithness5643213Australiasgmailcom124545645_fa fa-edit'))

WebUI.setText(findTestObject('User Details/New Billing address/Page_/input_First name_ca_deliveryorderbaseaddressfirstname'), 
    'Levis')

WebUI.setText(findTestObject('User Details/New Billing address/Page_/input_Last name_ca_deliveryorderbaseaddresslastname'), 
    'hary')

WebUI.scrollToElement(findTestObject('User Details/New Billing address/Page_/button_Next'), 0)

WebUI.click(findTestObject('User Details/New Billing address/Page_/button_Next'))

