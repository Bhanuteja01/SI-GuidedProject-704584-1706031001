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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Online Shopping site in India Shop Onl_10c5f3/a_Start here'))

WebUI.setText(findTestObject('Object Repository/User_Registration/Page_Amazon Registration/input_customerName'), 'ARNAB BARUA')

WebUI.setText(findTestObject('Object Repository/User_Registration/Page_Amazon Registration/input_email'), '9798810632')

WebUI.setText(findTestObject('Object Repository/User_Registration/Page_Amazon Registration/input_secondaryLoginClaim'), 
    'baruaarnab12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User_Registration/Page_Amazon Registration/input_password'), '8s2V7lLGyYS0p41NUiUZpA==')

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Amazon Registration/inputcontinue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Authentication required/i_a-icon a-icon-logo'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/User_Registration/Page_Amazon Sign In/input_email'), '9798810632')

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/User_Registration/Page_Amazon Sign In/input_password'), '9N/NeoNUwAmOpqY2L/5HEg==')

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/User_Registration/Page_Online Shopping site in India Shop Onl_10c5f3/a_in'))

WebUI.closeBrowser()

