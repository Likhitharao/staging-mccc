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

WebUI.comment('Edit coupon')

'Scroll upto edit button'
WebUI.scrollToElement(findTestObject('Summary/Edit Coupon/Page_/i_Payment using credit or debit card_fa fa-edit'), 0)

'Click on edit coupon button'
WebUI.click(findTestObject('Summary/Edit Coupon/Page_/i_Payment using credit or debit card_fa fa-edit'))

'Enter coupon code'
WebUI.setText(findTestObject('Summary/Edit Coupon/Page_/input_41500_b_coupon'), 'Wisden')

'Scroll upto Apply Button'
WebUI.scrollToElement(findTestObject('Summary/Edit Coupon/Page_/button_Apply'), 0)

'Click on apply button'
WebUI.click(findTestObject('Summary/Edit Coupon/Page_/button_Apply'))

WebUI.delay(5)

'Scroll upto checkout button'
WebUI.scrollToElement(findTestObject('Buynow process/Buynow for premium/Page_/Basket Checkout'), 0)

'Click on checkout button'
WebUI.click(findTestObject('Buynow process/Buynow for premium/Page_/Basket Checkout'))

