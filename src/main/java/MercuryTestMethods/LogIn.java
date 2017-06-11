package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;

import java.io.IOException;

/**
 * Created by Sumon on 6/10/2017.
 */
public class LogIn extends AbstractClass_MethodOverride{

    public static void LogIn(String userName, String password) throws IOException {
        try {
            test.log(LogStatus.INFO, "Clicking on home on the field");
            driver.findElement(By.xpath("//*[text()='Home']")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on home on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "HomeClickError");

        }

        try {
            test.log(LogStatus.INFO, "Entering user name on the field");
            driver.findElement(By.name("userName")).sendKeys(userName);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
            reusableMethods.getScreenShot(driver, test, "C:\\Users\\Sumon\\Documents\\extentreport\\screenshots", "UserNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("password")).sendKeys(password);

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











}
