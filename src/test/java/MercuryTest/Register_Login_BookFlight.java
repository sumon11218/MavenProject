package MercuryTest;

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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static common.CommonActions.logTestFailure;

/**
 * Created by Sumon on 6/3/2017.
 */
public class Register_Login_BookFlight extends AbstractClass_MethodOverride {

    WebDriverWait wait;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void SignUp() throws IOException, BiffException, InterruptedException, WriteException, BiffException {
        //line below will declare that test will be used in this extent report
        test = reports.startTest("Registration Test", "Mercury Tour Registration");
        test.log(LogStatus.INFO, "navigating to Mercury Tour registration page");

        wait = new WebDriverWait(driver, 10);
        //define the path excel
        Workbook workbook = Workbook.getWorkbook(new File("src\\main\\java\\dataInput\\Book1.xls"));
        //line below will define the worksheet that we are using
        Sheet workSheet = workbook.getSheet(0 ); //can be used by index or string
        //line below will define writeable workbook
        WritableWorkbook writeableWorkbook = Workbook.createWorkbook(new File("src\\main\\java\\dataInput\\Book1_Result.xls"),workbook);
        //line below will define the writable sheet
        WritableSheet sheet2 = writeableWorkbook.getSheet(0);


        //line below will define the non empty rows within the sheet
        int rowNumber = workSheet.getRows();

        for(int i = 1; i<= rowNumber-1; i++) {

            String FirstName = workSheet.getCell(0, i).getContents();
            String LastName = workSheet.getCell(1, i).getContents();
            String Phone = workSheet.getCell(2, i).getContents();
            String Email = workSheet.getCell(3, i).getContents();
            String Address = workSheet.getCell(4, i).getContents();
            String City = workSheet.getCell(5, i).getContents();
            String State = workSheet.getCell(6, i).getContents();
            String PostalCode = workSheet.getCell(7, i).getContents();
            String UserName = workSheet.getCell(8, i).getContents();
            String Password = workSheet.getCell(9, i).getContents();
            String ConfirmPass = workSheet.getCell(10, i).getContents();

            driver.navigate().to("http://newtours.demoaut.com/index.php");
            Thread.sleep(3000);

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
                String message = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Your user name is')]"))).get(0).getText();
                Label label = new Label(11, i, message);
                sheet2.addCell(label);
            } catch (Exception err) {
                test.log(LogStatus.FAIL, "Unable to get text - " + err.getMessage());
                reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "confirmError");
            }



        }
        //only write anc close the Writable Workbook after for loop
        writeableWorkbook.write();
        writeableWorkbook.close();

    }

    //dependsOnMethods = "SignUp"
    @Test(priority = 2)
    public void LogIn() throws IOException, BiffException, InterruptedException{
        //line below will declare that test will be used in this extent report
        test = reports.startTest("Log In Test", "Mercury Tour Log In Page");
        test.log(LogStatus.INFO, "navigating to Mercury Tour registration page");


        try {
            test.log(LogStatus.INFO, "Clicking on home on the field");
            driver.findElement(By.xpath("//*[text()='Home']")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on home on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "HomeClickError");

        }



        try {
            test.log(LogStatus.INFO, "Entering user name on the field");
            driver.findElement(By.name("userName")).sendKeys("P.Hemminway");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "UserNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("password")).sendKeys("Peter11215");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "PasswordError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on submit on the field");
            driver.findElement(By.name("login")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on submit on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SubmitError");

        }
    }

    //dependsOnMethods = "LogIn"
    @Test(priority = 3)
    public void BookFlight() throws IOException {
        test = reports.startTest("Book a flight test", "Book flight page");
        test.log(LogStatus.INFO, "navigating to book a flight page");
        try {
            test.log(LogStatus.INFO, "Selecting New York on the deaprting field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), "New York");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), "25");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting Paris on the arriving in field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toPort")), "Paris");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select Paris on the arriving in field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return month on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toMonth")), "August");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toDay")), "25");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking service class on the field");
            driver.findElement(By.name("servClass")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError");

        }


        try {
            test.log(LogStatus.INFO, "Selecting airline on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("airlin")), "Blue Skies Airlines");

        } catch (Exception err) {
           // logTestFailure(driver,"Unable to select airline on the field - " + err.getMessage());
            test.log(LogStatus.FAIL, "Unable to select airline on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "airlineError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking the continue button on the field");
            driver.findElement(By.name("findFlights")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError2");

        }
    }


}
