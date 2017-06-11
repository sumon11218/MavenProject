package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sumon on 6/10/2017.
 */
public class Registration extends AbstractClass_MethodOverride{

    public static String SignUp(String FirstName,String LastName, String Phone, String Email, String Address, String City, String State,String PostalCode,String UserName,String Password,String ConfirmPass) throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver,10);
        String message = null;
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            try {
                test.log(LogStatus.INFO, "Clicking on register on the field");
                driver.findElement(By.xpath("//*[text()='REGISTER']")).click();

            } catch (Exception err) {
                test.log(LogStatus.FAIL, "Unable to click on register on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "RegistrationClickError");

            }

            try {
                test.log(LogStatus.INFO, "Entering first name on the field");
                //line below will enter first name
                driver.findElement(By.name("firstName")).sendKeys(FirstName);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter first name on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "FirstNameError");
            }

            try {
                test.log(LogStatus.INFO, "Entering last name on the field");
                //line below will enter last name
                driver.findElement(By.name("lastName")).sendKeys(LastName);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter last name on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "LastNameError");

            }

            try {
                test.log(LogStatus.INFO, "Entering phone number on the field");
                //line below will enter phone number
                driver.findElement(By.name("phone")).sendKeys(Phone);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter phone number on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "PhoneError");

            }

            try {
                test.log(LogStatus.INFO, "Entering e-mail on the field");
                //line below will enter e-mail
                driver.findElement(By.id("userName")).sendKeys(Email);
            }catch (Exception err){
                test.log(LogStatus.FAIL, "Unable to enter e-mail on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "EmailError");

            }

            try {
                test.log(LogStatus.INFO, "Entering address on the field");
                //line below will enter address
                driver.findElement(By.name("address1")).sendKeys(Address);
            }catch (Exception err){
                test.log(LogStatus.FAIL, "Unable to enter address on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "AddressError");

            }

            try {
                test.log(LogStatus.INFO, "Entering city on the field");
                //line below will enter city
                driver.findElement(By.name("city")).sendKeys(City);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter city on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "CityError");

            }

            try {
                test.log(LogStatus.INFO, "Entering state on the field");
                //line below will enter state
                driver.findElement(By.name("state")).sendKeys(State);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter state on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "StateError");

            }

            try {
                test.log(LogStatus.INFO, "Entering postal code on the field");
                //line below will enter postal code
                driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter postal code on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "PostalCodeError");

            }

            try {
                test.log(LogStatus.INFO, "Entering user name on the field");
                //line below will enter user name
                driver.findElement(By.id("email")).sendKeys(UserName);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "UserNameError");

            }

            try {
                test.log(LogStatus.INFO, "Entering password on the field");
                //line below will enter password
                driver.findElement(By.name("password")).sendKeys(Password);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "PasswordError");

            }

            try {
                test.log(LogStatus.INFO, "Entering to confirm password on the field");
                //line below will enter confirm password
                driver.findElement(By.name("confirmPassword")).sendKeys(ConfirmPass);
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to enter in confirm password on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "ConfirmPassError");

            }

            try {
                test.log(LogStatus.INFO, "Clicking submit on the field");
                //line below will click on register button to sign up
                driver.findElement(By.name("register")).click();
            }catch(Exception err){
                test.log(LogStatus.FAIL, "Unable to click register on the field - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "RegistrationClickError");

            }

            Thread.sleep(6000);
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            if(driver.findElements(By.name("register")).size() > 0){
                test.log(LogStatus.FAIL,"Register button still appears...Show Stopper & stopping execution");
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "RegisterButtonError");
                Assert.fail();
            }

            try{
                message = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Your user name is')]"))).get(0).getText();
            } catch (Exception err) {
                test.log(LogStatus.FAIL, "Unable to get text - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "confirmError");
            }

            return message;
    }



}
