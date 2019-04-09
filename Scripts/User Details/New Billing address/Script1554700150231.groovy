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

WebUI.comment('Adding New Billing Address')

'Click on New billing address'
WebUI.click(findTestObject('User Details/New Billing address/Page_/Same as billing address_button'))

'Get total options in Title dropdown'
Totaltitle = WebUI.getNumberOfTotalOption(findTestObject('User Details/New Billing address/Absolute_Title'))

'Random Selection'
Random rad = new Random()

int count = 1 + rad.nextInt(Totaltitle - 1)

'Select title dropdown Randomly'
WebUI.selectOptionByIndex(findTestObject('User Details/New Billing address/Absolute_Title'), count, FailureHandling.STOP_ON_FAILURE)

'If in random count = Company'
if (count == 5) {
    'then Enter Comapny name'
    WebUI.setText(findTestObject('User Details/New Billing address/Absolute_Company'), 'AB')
}

'Enter First name'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/new_First name'), 'Williams')

'Enter last name'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_Last name'), 'denim')

'Enter street'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_Street'), 'Link street')

'Enter Address'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_Address'), '56/7')

'Enter city'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_City'), 'chennai')

'Get total county options'
Totalcounty = WebUI.getNumberOfTotalOption(findTestObject('User Details/New Billing address/Absolute-county'))

'Random Selection'
Random rad1 = new Random()

int count1 = 1 + rad1.nextInt(Totalcounty - 1)

'Select Random value from County dropdown'
WebUI.selectOptionByIndex(findTestObject('User Details/New Billing address/Absolute-county'), count1)

'Enter postalcode'
WebUI.setText(findTestObject('User Details/New Billing address/Page_/New_Postal code'), '562396')

'Get total Country dropdown options'
Totalcountry = WebUI.getNumberOfTotalOption(findTestObject('User Details/New Billing address/Absolute_country'))

'Random Selection'
Random rad2 = new Random()

int count2 = 1 + rad2.nextInt(Totalcountry - 1)

'Select Randomly from Country Dropdown'
WebUI.selectOptionByIndex(findTestObject('User Details/New Billing address/Absolute_country'), count2)

'click on next button'
WebUI.click(findTestObject('User Details/New Billing address/Page_/button_Next'))

