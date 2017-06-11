package common;

import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

/**
 * Created by Sumon on 6/7/2017.
 */
public class CommonActions extends AbstractClass_MethodOverride{



    public static void logTestFailure(WebDriver wDriver, String logMessage) {
        try {
            test.log(LogStatus.FAIL, logMessage);
            Reporter.log(logMessage, true);
            //Assert.fail();
        } catch (Exception e) {
            Reporter.log("Exception: " + e.getMessage(), true);
            test.log(LogStatus.INFO, "✗✗✗ Failed while logging failure in logTestFailure method");
        }
    }







}
