package EcommerceTest;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Fahad on 6/8/17.
 */
public class ecommerceHW_Fahad extends AbstractClass_MethodOverride {


    @Test(priority = 1)
    public static void SignUp() throws IOException, BiffException, InterruptedException, WriteException {
        //line below will declare that test will be used in this extent report
        test = reports.startTest("SignUp Test", "Ecommerce site Registration");
        test.log(LogStatus.INFO, "navigating Dummy Ecommerce page");

        try {
            test.log(LogStatus.INFO, "Clicking on SignIN");
            driver.findElement(By.className("login")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on the SignIN button " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "RegistrationClickError");

        }

        try {
            test.log(LogStatus.INFO, "Creating an account");
            //line below will enter first name
            driver.findElement(By.name("email_create")).sendKeys("testemail11219@gmail.com");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to create account" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "clicking on Creating an account");
            //line below will enter first name
            driver.findElement(By.id("SubmitCreate")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to create account" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        Thread.sleep(3000);

        try {
            test.log(LogStatus.INFO, "Clicking on the gender");
            //line below will enter last name
            driver.findElement(By.id("id_gender1")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to identify the gender" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "LastNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering the customers first name");
            //line below will enter phone number
            driver.findElement(By.id("customer_firstname")).sendKeys("Peter");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the first name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "PhoneError");

        }

        try {
            test.log(LogStatus.INFO, "Entering the last name on the field");
            //line below will enter e-mail
            driver.findElement(By.id("customer_lastname")).sendKeys("Burg");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the last name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "EmailError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            //line below will enter address
            driver.findElement(By.id("passwd")).sendKeys("testpassword123");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "AddressError");

        }

        try {
            test.log(LogStatus.INFO, "Entering birth day on the field");
            //line below will enter city
            reusableMethods.selectElementFromDropDownByIndex(driver.findElement(By.id("days")), 15);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter birth day on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "CityError");

        }

        try {
            test.log(LogStatus.INFO, "Entering birth month on the field");
            //line below will enter city
            reusableMethods.selectElementFromDropDownByIndex(driver.findElement(By.id("months")), 3);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter birth month on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "CityError");

        }

        try {
            test.log(LogStatus.INFO, "Entering birth year on the field");
            //line below will enter city
            driver.findElement(By.id("years")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(text(),'1990')]")).click();
            //reusableMethods.selectElementFromDropDownByIndex(driver.findElement(By.name("years")), "24");
            //reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("years")), "1980");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter birth year on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "CityError");

        }

        try {
            test.log(LogStatus.INFO, "Entering the customers first name");
            //line below will enter phone number
            driver.findElement(By.id("firstname")).sendKeys("Peter");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the first name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "PhoneError");

        }

        try {
            test.log(LogStatus.INFO, "Entering the last name on the field");
            //line below will enter e-mail
            driver.findElement(By.id("lastname")).sendKeys("Burg");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter the last name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "EmailError");

        }

        try {
            test.log(LogStatus.INFO, "Entering address on the field");
            //line below will enter address
            driver.findElement(By.name("address1")).sendKeys("355 Church Avenue");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter address on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "AddressError");

        }
        try {
            test.log(LogStatus.INFO, "Entering city on the field");
            //line below will enter city
            driver.findElement(By.name("city")).sendKeys("Brooklyn");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter city on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "CityError");

        }

        try {
            test.log(LogStatus.INFO, "Entering state on the field");
            //line below will enter state
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.id("id_state")), "New York");
            //driver.findElement(By.name("id_state")).sendKeys("New York");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter state on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "StateError");

        }

        try {
            test.log(LogStatus.INFO, "Entering postal code on the field");
            //line below will enter postal code
            driver.findElement(By.name("postcode")).sendKeys("11218");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter postal code on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "PostalCodeError");

        }
        try {
            test.log(LogStatus.INFO, "Entering Country on the field");
            //line below will enter state
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.id("id_country")), "United States");
            //driver.findElement(By.name("id_state")).sendKeys("New York");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter Country on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "StateError");

        }

        try {
            test.log(LogStatus.INFO, "Entering Phone Number on the field");
            //line below will enter postal code
            driver.findElement(By.name("phone_mobile")).sendKeys("3476547895");
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter phone number on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "PostalCodeError");

        }

        try {
            test.log(LogStatus.INFO, "clicking on Submit");
            //line below will enter first name
            driver.findElement(By.id("submitAccount")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Submit registration" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        Thread.sleep(3000);

    }


    @Test(dependsOnMethods = "SignUp")
    public static void shopDress() throws IOException, InterruptedException {

        test = reports.startTest("Shopping Test", "Shopping and verification");
        test.log(LogStatus.INFO, "Shopping and paying for a dress");

        try {
            test.log(LogStatus.INFO, "clicking on Dresses");
            //line below will enter first name
            driver.findElement(By.linkText("DRESSES")).click();
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on Dresses" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "Adding item to the cart");
            WebElement dress = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']"));
            Actions action = new Actions(driver);
            action.moveToElement(dress).perform();
            driver.findElement(By.linkText("Add to cart")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to add item to the cart" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }
        Thread.sleep(2000);
        try {
            test.log(LogStatus.INFO, "Proceeding to the checkout");
//reusableMethods.scrollIntoElement(driver,driver.findElement(By.linkText("Proceed to checkout")));
            driver.findElement(By.linkText("Proceed to checkout")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to proceed to the checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "Proceeding to the checkout");

            driver.findElement(By.linkText("Proceed to checkout")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to proceed to the checkout" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "Verifying address");

            driver.findElement(By.name("processAddress")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to verify address and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }
        try {
            test.log(LogStatus.INFO, "Agreeing with terms and continue");

            driver.findElement(By.name("cgv")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to agree with terms and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        try {
            test.log(LogStatus.INFO, "verify carrier and proceed");

            driver.findElement(By.name("processCarrier")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to verify carrier and continue" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        Thread.sleep(2000);
        try {
            test.log(LogStatus.INFO, "Pay By Check");
//reusableMethods.scrollIntoElement(driver,driver.findElement(By.linkText("Proceed to checkout")));
            driver.findElement(By.className("cheque")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Pay by Check" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        Thread.sleep(2000);

        reusableMethods.scrollIntoElement(driver, driver.findElement(By.className("page-subheading")));

        boolean elementExist = driver.findElements(By.className("page-subheading")).size() > 0;

        if (elementExist == true) {

            test.log(LogStatus.PASS, "Found Check Payment");
        } else {
            test.log(LogStatus.FAIL, "Unable to verify check payment");
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "FirstNameError");
        }

        Thread.sleep(2000);

        reusableMethods.scrollIntoElement(driver, driver.findElement(By.id("cart_navigation")));

        try {
            test.log(LogStatus.INFO, "Confirming Order");

            driver.findElement(By.xpath("//*[contains(text(),'I confirm my order')]")).click();


        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Confirm Order" + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "confirmationerror");
        }


        boolean success = driver.findElements(By.xpath("//*[contains(text(),'Your order on My Store is complete.')]")).size() > 0;

        if (success == true) {

            test.log(LogStatus.PASS, "Order Successful");
        } else {
            test.log(LogStatus.FAIL, "Unable complete order");
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\", "orderincomplete");
        }
    }


}

