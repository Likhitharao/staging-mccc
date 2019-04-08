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

WebUI.comment('Verifying Whether Links are Working or not when we click on Delivery,Returns and cancellations link page')

'Open browser\r\n'
WebUI.openBrowser('')

'MCCC URL'
WebUI.navigateToUrl('http://192.168.0.28:90/list')

'Click on Delivery,Returns and cancellations link'
WebUI.click(findTestObject('All links are Accessible/Delivery,Returns and cancellations/Page_Middlesex Cricket Memberships/small_Delivery Returns and Cancellations'))

'As above link is Navigating to another window we are using Switch to window index'
WebUI.switchToWindowIndex(1)

'Verifying whether it is actual page or not '
WebUI.verifyTextPresent('DELIVERY, RETURNS & CANCELLATIONS', false)

'Getting Total Number of links in that particular page'
WebUI.getAllLinksOnCurrentPage(false, [])

'Verifying all Links on that particular page or working or not'
WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

