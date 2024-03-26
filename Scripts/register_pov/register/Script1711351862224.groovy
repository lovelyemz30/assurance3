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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/login')

WebUI.click(findTestObject('Object Repository/register/Page_ELearningWeb/a_Register'))

WebUI.setText(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-input ng-unto_35239c'), 
    'Emmy')

WebUI.setText(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-input ng-unto_35239c_1'), 
    'Tanilon')

WebUI.setText(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-input ng-unto_35239c_1_2'), 
    'emmyabapo11@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-input ng-unto_35239c_1_2_3'), 
    'yNcMOYwB9Uk=')

WebUI.selectOptionByValue(findTestObject('Object Repository/register/Page_ELearningWeb/select_RoleTeacherStudent'), 'student', 
    true)

WebUI.click(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-btn'))

WebUI.click(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-btn'))

WebUI.setEncryptedText(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-input ng-unto_35239c_1_2_3'), 
    'spYgzdrOA/5Rpzpp5nfzRQ==')

WebUI.click(findTestObject('Object Repository/register/Page_ELearningWeb/input_Create new account_form-btn'))

