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

// Login to admin
WebUI.callTestCase(findTestCase('Admin/TC_Login_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

// Click Menu User
WebUI.click(findTestObject('for_UOB_Admin/for_User_Menu/menu_User'))

// Click Sub menu User Set Up
WebUI.click(findTestObject('for_UOB_Admin/for_User_Menu/submenu_User Setup'))

WebUI.setText(findTestObject('for_UOB_Admin/for_User_Menu/for_UserSetup/textbox_User Id'), 'puji')

WebUI.click(findTestObject('for_UOB_Admin/for_User_Menu/for_UserSetup/button_Search(inUserSetup)'))

// Verify the User Name Found in Admin
String expected_Name = 'puji'

String actual_Name = WebUI.getText(findTestObject('for_UOB_Admin/for_User_Menu/for_UserSetup/column_NameNo1'))

if (actual_Name.contains(expected_Name)) {
    println("User Found, username: $expected_Name")
} else {
    println("User Not Found, username: $expected_Name")
}



