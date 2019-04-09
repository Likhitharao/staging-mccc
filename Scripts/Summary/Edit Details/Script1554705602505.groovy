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

WebUI.comment('Edit Basket Details')

'Scroll upto edit details button'
WebUI.scrollToElement(findTestObject('Summary/Edit Details/Page_/Edit Details button'), 0)

'click on edit details'
WebUI.click(findTestObject('Summary/Edit Details/Page_/Edit Details button'))

'Get total quantity'
Totalquantity = WebUI.getNumberOfTotalOption(findTestObject('Summary/Edit Details/Page_/select Quantity in Basket'))

'Random selection'
Random rad = new Random()

int count = 1 + rad.nextInt(Totalquantity - 1)

'Select Random Quantity from dropdown'
WebUI.selectOptionByIndex(findTestObject('Summary/Edit Details/Page_/select Quantity in Basket'), count)

'Scroll upto Checkout button'
WebUI.scrollToElement(findTestObject('Summary/Edit Details/Page_/Basket Checkout'), 0)

'Click on Checkout button'
WebUI.click(findTestObject('Summary/Edit Details/Page_/Basket Checkout'))

'scroll upto Agreement'
WebUI.scrollToElement(findTestObject('Summary/Edit Details/Page_/agreement'), 10)

'Click on agreement'
WebUI.click(findTestObject('Summary/Edit Details/Page_/agreement'))

'Scroll upto buynow button in summary page'
WebUI.scrollToElement(findTestObject('Summary/Edit Details/over/Page_/button_Buy now'), 20)

'Click on buynow button in summary page'
WebUI.click(findTestObject('Summary/Edit Details/over/Page_/button_Buy now'))

assert WebUI.getUrl() =='http://192.168.0.28:90/checkout/process'

