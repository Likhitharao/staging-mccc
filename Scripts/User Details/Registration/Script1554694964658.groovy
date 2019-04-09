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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


WebUI.comment('Registration for MCCC')

'Enter First name'
WebUI.setText(findTestObject('User Details/Registration/Page_Laravel/Reg_First name'), 'John')

'Enter Lastname'
WebUI.setText(findTestObject('User Details/Registration/Page_Laravel/Reg_Last name'), 'Levis')

'Enter DOB'
WebUI.setText(findTestObject('User Details/Registration/Page_Laravel/Reg_Date of birth'), '02-03-1996')

'Random Selection'
Random rad = new Random()

int Email = rad.nextInt(2000)

	
'Random Email'
 String Regemail = WebUI.setText(findTestObject('User Details/Registration/Page_Laravel/Reg_Email'), ('MCCC' + Email) + 
    '@gmail.com')

'Set Password'
WebUI.setEncryptedText(findTestObject('User Details/Registration/Page_Laravel/Reg_Password'), 'nbPRAawFRnE=')

'Confirm Password'
WebUI.setEncryptedText(findTestObject('User Details/Registration/Page_Laravel/Reg_Confirm password'), 'nbPRAawFRnE=')

'Scroll upto Registration Button'
WebUI.scrollToElement(findTestObject('User Details/Registration/Page_Laravel/button_REGISTER'), 0)

'Click on registration'
WebUI.click(findTestObject('User Details/Registration/Page_Laravel/button_REGISTER'))

