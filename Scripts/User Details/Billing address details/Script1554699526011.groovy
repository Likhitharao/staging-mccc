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

WebUI.comment('Billing Address Details')

WebUI.delay(5)

'Get total options in Title dropdown'
Totaltitle = WebUI.getNumberOfTotalOption(findTestObject('User Details/Billing address details/Page_/Absolute_title'))

'Random Selection'
Random rad = new Random()

int count = 1 + rad.nextInt(Totaltitle - 1)

WebUI.scrollToElement(findTestObject('User Details/Billing address details/Page_/Absolute_title'), 0)

'Select title dropdown Randomly'
WebUI.selectOptionByIndex(findTestObject('User Details/Billing address details/Page_/Absolute_title'), count)

'If in random count = Company'
if (count == 5) {
    'then Enter Comapny name'
    WebUI.setText(findTestObject('User Details/Billing address details/Page_/absolute_company'), 'AB')
}

'Scroll upto Street  text field'
WebUI.scrollToElement(findTestObject('User Details/Billing address details/Page_/Abs -street'), 0)

'Enter Street field'
WebUI.setText(findTestObject('User Details/Billing address details/Page_/Abs -street'), 'SN puram')

'Enter Address'
WebUI.setText(findTestObject('User Details/Billing address details/Page_/Absolute-Address'), '3rd link Street')

'Enter City'
WebUI.setText(findTestObject('User Details/Billing address details/Page_/Absolute_City'), 'Chennai')

'Get total county options'
Totalcounty = WebUI.getNumberOfTotalOption(findTestObject('User Details/New Billing address/Page_/County'))

'Random Selection'
Random rad1 = new Random()

int count1 = 1 + rad1.nextInt(Totalcounty - 1)

'Select Random value from County dropdown'
WebUI.selectOptionByIndex(findTestObject('User Details/New Billing address/Page_/County'), count1)

'Enter postalcode'
WebUI.setText(findTestObject('User Details/Billing address details/Page_/Absolute_postalcode'), '562396')

'Get total Country dropdown options'
Totalcountry = WebUI.getNumberOfTotalOption(findTestObject('User Details/New Billing address/Page_/Country'))

'Random Selection'
Random rad2 = new Random()

int count2 = 1 + rad2.nextInt(Totalcountry - 1)

'Select Randomly from Country Dropdown'
WebUI.selectOptionByIndex(findTestObject('User Details/New Billing address/Page_/Country'), count2)

'Enter telephone Number'
WebUI.setText(findTestObject('User Details/Billing address details/Page_/Absolute_telephone'), '96632587412')

