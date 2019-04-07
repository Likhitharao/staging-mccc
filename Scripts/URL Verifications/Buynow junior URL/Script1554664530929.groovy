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

WebUI.comment('Verfying junior URL navigation')

'opening browser'
WebUI.openBrowser('')

'Navigate to MCCC URL'
WebUI.navigateToUrl('https://mccc-staging.jmangroup.com/list')

'Scroll upto junior buynow button'
WebUI.scrollToElement(findTestObject('URL Verifications/Buynow junior URL/junior BUY NOW button'), 0)

'click on junior buynow button'
WebUI.click(findTestObject('URL Verifications/Buynow junior URL/junior BUY NOW button'))

'Verifying actual url with expected url'
assert WebUI.getUrl() == 'https://mccc-staging.jmangroup.com/detail/10/JUNIOR/12'

