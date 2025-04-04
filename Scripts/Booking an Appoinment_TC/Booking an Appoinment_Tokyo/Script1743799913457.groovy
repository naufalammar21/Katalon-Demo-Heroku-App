import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_TC/Login Pre Condition'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/td_30'))

WebUI.setText(findTestObject('Object Repository/Page_Booking_an_Appoinment_select_Tokyo/textarea_Comment_comment'), 'Something')

WebUI.click(findTestObject('Page_Booking_an_Appoinment_select_Hongkong/button_Book Appointment'))

WebUI.verifyTextPresent('Something', true)

WebUI.closeBrowser()

