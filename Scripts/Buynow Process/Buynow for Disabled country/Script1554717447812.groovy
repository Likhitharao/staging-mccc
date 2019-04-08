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

WebUI.comment('Buynow for Disabled Full ')

'Opening Browser'
WebUI.openBrowser('')

'Navigate to MCCC URL'
WebUI.navigateToUrl('http://192.168.0.28:90/list')

'Scroll upto disabled full button'
WebUI.scrollToElement(findTestObject('URL Verifications/Buynow disabled country URL/Disabled country BUY NOW button'), 0)

'Click on Disabled full button'
WebUI.click(findTestObject('URL Verifications/Buynow disabled country URL/Disabled country BUY NOW button'))

'Get total options in Quantity dropdown and store it in variable (quantitytotal)'
quantitytotal = WebUI.getNumberOfTotalOption(findTestObject('Buynow process/Buynow for premium/Page_PREMIER/select quantity'))

'Random selection'
Random rad = new Random()

quantity = (1 + rad.nextInt(quantitytotal - 1))

'Select Quantity from dropdown randomly'
WebUI.selectOptionByIndex(findTestObject('Buynow process/Buynow for premium/Page_PREMIER/select quantity'), quantity)

'Get qunatity from Membership page'
Totalquantity1 = WebUI.getAttribute(findTestObject('Buynow process/Buynow for premium/Page_PREMIER/select quantity'), 'value')

'Click on add to basket button'
WebUI.click(findTestObject('Buynow process/Buynow for premium/Page_PREMIER/Add to Basket button'))

'Get quantity from Basket page'
Totalquantity2 = WebUI.getAttribute(findTestObject('Buynow process/Buynow for premium/Page_/Quantity in basket'), 'value')

'Verifying Quantity in membership page and basket equals are not'
assert Totalquantity1 == Totalquantity2

'Scroll upto Basket checkout button'
WebUI.scrollToElement(findTestObject('Buynow process/Buynow for premium/Page_/Basket Checkout'), 0)

'click on Basket checkout button'
WebUI.click(findTestObject('Buynow process/Buynow for premium/Page_/Basket Checkout'))

