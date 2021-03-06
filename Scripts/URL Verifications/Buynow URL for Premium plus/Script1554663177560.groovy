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

WebUI.comment('Verifying Premium plus URL navigation')

'Opening browser'
WebUI.openBrowser('')

'Navigating to MCCC URL'
WebUI.navigateToUrl('http://192.168.0.28:90/list')

'scroll to premium plus buynow button'
WebUI.scrollToElement(findTestObject('URL Verifications/Buynow premium plus URL/premium plus BUY NOW button'), 0)

'Click on premium buynow button'
WebUI.click(findTestObject('URL Verifications/Buynow premium plus URL/premium plus BUY NOW button'))

'Verifying actual URLvwith expected URL'
assert WebUI.getUrl() == 'http://192.168.0.28:90/detail/9/PREMIER_PLUS/8'

