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

WebUI.comment('Verifying Premium Buynow URL Navigation')

'Opening browser\r\n'
WebUI.openBrowser('')

'Navigating to MCCC URL'
WebUI.navigateToUrl('http://192.168.0.28:90/list')

'Scroll upto Premium buynow button'
WebUI.scrollToElement(findTestObject('Buynow process/Buynow for premium/Page_Middlesex Cricket Memberships/Premium buynow button'), 
    0)

'Click on Premium Buynow button'
WebUI.click(findTestObject('Buynow process/Buynow for premium/Page_Middlesex Cricket Memberships/Premium buynow button'))

'Verifying Actual URL with expected URL'
assert WebUI.getUrl() == 'http://192.168.0.28:90/detail/5/PREMIER/0'

