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

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Dual Control'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Dual Control is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submeny_SystemParameter'), FailureHandling.STOP_ON_FAILURE)

println('submenu_SystemParameter is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Lookup Parameter'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Lookup Parameter is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Portfolio Model Set'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Portfolio Model Set is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_DivID Retagging'), FailureHandling.STOP_ON_FAILURE)

println('submenu_DivID Retagging is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Label Management'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Label Management is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Email Setup'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Email Setup is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Release Entity'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Release Entity is exist')

WebUI.verifyElementVisible(findTestObject('for_UOB_Admin/for_SystemMenu/submenu_Approval Model'), FailureHandling.STOP_ON_FAILURE)

println('submenu_Approval Model is exist')

println('all sub menu is exist Menu System')

WebUI.closeBrowser()

