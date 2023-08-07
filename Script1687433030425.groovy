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

WebUI.callTestCase(findTestCase('Admin/TC_Login_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('for_UOB_Admin/for_SystemParam/menu_System'))

WebUI.click(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Lookup Parameter'))

boolean UOBAdminPage = WebUI.verifyElementText(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Look Up'), 
    'Look Up')

if (UOBAdminPage) {
    println('You are in Look Up Parameter Page')
} else {
    println('You are not in Look Up Parameter Page')
}

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/teks_Button Legend'))

println('Button Legend is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Edit Look Up'))

println('Edit Look Up is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Lookup Type'))

println('Lookup Type Exist')

// Check Look Up Type Drop Down List
WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Lookup Type'))

WebUI.click(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/dropdownlist_LookupType'))

WebUI.click(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/dropdownlist_LookupType'))

println('Dropdown List Lookup Type is Exist')

// Verify Table Look Up Parameter 
WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_NO'))

println('Column No is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Lookup Key'))

println(' Column Look Up Key is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Value'))

println('Column Row is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Default'))

println('Column Default is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Last Updated'))

println('Column Last Updated is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Status'))

println('Column Status is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/row_Action'))

println('Column Action is Exist')

// Click icon legend
WebUI.click(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/icon_legend in LookUp'))

// Verify page "Editing System Parameter"
String expected_Editing_LookUP = 'Editing Look Up'

String actual_Editing_LookUP = WebUI.getText(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Editing Look Up detail'))

if (actual_Editing_LookUP.contains(expected_Editing_LookUP)) {
    println("Open Page: $expected_Editing_LookUP")
} else {
    println("Cant Open The Page : $expected_Editing_LookUP")
}

// Verify parts in Editing Look Up details
WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Lookup Type (1)'))

println('Textbox Lookup Type* is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/text_Last Updated'))

println('Textbox Last Updated is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Lookup Key'))

println('Textbox Lookup Key is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Crm Key'))

println('Textbox CRM* is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Value'))

println('Textbox Value* is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Default'))

println('Textbox Default is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/text_Status'))

println('Textbox Status is Exist')

WebUI.verifyElementClickable(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/button_Back(For Editing Look Up)'))

WebUI.verifyElementClickable(findTestObject('for_UOB_Admin/for_SystemMenu/for_Look_Up/button_Save(for Editing Look UP)'))

WebUI.closeBrowser()

