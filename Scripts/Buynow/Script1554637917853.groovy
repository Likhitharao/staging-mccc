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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mccc-staging.jmangroup.com/list')

WebUI.scrollToElement(findTestObject('Buynow/Page_Middlesex Cricket Memberships/a_BUY NOW'), 0)

WebUI.click(findTestObject('Buynow/Page_Middlesex Cricket Memberships/a_BUY NOW'))

qualitytotal = WebUI.getNumberOfTotalOption(findTestObject('Buynow/Page_PREMIER/select quantity'))

Random rad = new Random()

quantity = (1 + rad.nextInt(qualitytotal - 1))

WebUI.selectOptionByIndex(findTestObject('Buynow/Page_PREMIER/select quantity'), quantity)

WebUI.click(findTestObject('Buynow/Page_PREMIER/button_Add to Basket  Checkout'))

qua = WebUI.getAttribute(findTestObject('Buynow/Page_/select_12345678910'), 'value')
