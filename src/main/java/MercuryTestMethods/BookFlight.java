package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Sumon on 6/10/2017.
 */
public class BookFlight extends AbstractClass_MethodOverride {


    @Test(priority = 3)
    public void BookFlight(String value, String date, String arrival) throws IOException {
        try {
            test.log(LogStatus.INFO, "Selecting value "  + value + " on the deaprting field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), value);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), date);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "SelectionError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting arrival " + arrival + " on the arriving in field");
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
