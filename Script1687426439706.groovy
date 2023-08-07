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

WebUI.click(findTestObject('for_UOB_Admin/for_SystemParam/submenu_System Parameter'))

boolean UOBAdminPage = WebUI.verifyElementText(findTestObject('for_UOB_Admin/for_SystemParam/text_System Parameter'), 'System Parameter')

if (UOBAdminPage) {
    println('You are in System Parameter Page')
} else {
    println('You are not in System Parameter Page')
}

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/teks_Button Legend'))

println('Button Legend is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_Parameter Key'))

println('Parameter Type is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_No'))

println('No.Column is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_Parameter Key'))

println('Column Parameter Value is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_Value'))

println(' Column Value is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_Last Updated'))

println('Column LastUpdated is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/column_Action'))

println('Column Action is Exist')

// Click icon legend
WebUI.click(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/icon_legend'))

// Verify page "Editing System Parameter"
String expected_Editing_System_Parameter = 'Editing System Parameter'

String actual_Editing_System_Parameter = WebUI.getText(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/text_Editing System Parameter detail'))

if (actual_Editing_System_Parameter.contains(expected_Editing_System_Parameter)) {
    println("Open Page: $expected_Editing_System_Parameter")
} else {
    println("Cant Open The Page : $expected_Editing_System_Parameter")
}

// Verify parts in Editing System Parameter Page
WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/teks_Parameter Type'))

println('Textbox Parameter Type is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/text_Last Updated'))

println('Textbox Last Updated is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/text_Parameter Key'))

println('Textbox Parameter Key is Exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/for_SystemParameter/text_Value'))

println('Textbox Value* is Exist')

WebUI.closeBrowser()

