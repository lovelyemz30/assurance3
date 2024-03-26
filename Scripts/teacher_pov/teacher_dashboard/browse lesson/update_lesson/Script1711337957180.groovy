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

WebUI.navigateToUrl('http://localhost:4200/teacher-login')

WebUI.setText(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Log in as Teacher_form-input ng-untou_b5f5a2'), 
    'duka.5@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Log in as Teacher_form-input ng-untou_b5f5a2_1'), 
    'lRjbE94itQ3ju8v1ytceHg==')

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Log in as Teacher_form-btn'))

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/a_Browse Lessons'))

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/path_lesson 3_fill-neutral-900'))

WebUI.setText(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Update Lesson_form-input ng-untouched_40578f'), 
    'lesson 4')

WebUI.setText(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Update Lesson_form-input ng-untouched_40578f_1'), 
    'https://www.youtube.com/watch?v=KvmzCbjopkE')

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Update Lesson_form-input ng-untouched_40578f_1'))

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/app-update-lesson_Update Lesson'))

WebUI.setText(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Update Lesson_form-input ng-untouched_40578f_1'), 
    'https://www.youtube.com/watch?v=KvmzCbjopkE')

WebUI.click(findTestObject('Object Repository/update_lesson/Page_ELearningWeb/input_Log in as Teacher_form-btn'))

