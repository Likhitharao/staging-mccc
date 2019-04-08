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

WebUI.comment('Verifying Disabled buynow URL navigation')

'Opening browser'
WebUI.openBrowser('')

'Navigate to MCCC URL'
WebUI.navigateToUrl('http://192.168.0.28:90/list')

'scroll upto disabled buynow url'
WebUI.scrollToElement(findTestObject('URL Verifications/Buynow disabled URL/Disabled BUY NOW button'), 0)

'Click on disabled buynow url'
WebUI.click(findTestObject('URL Verifications/Buynow disabled URL/Disabled BUY NOW button'))

'Verifying actual url with expected url'
assert WebUI.getUrl() == 'http://192.168.0.28:90/detail/10/DISABLED_FULL/9'

