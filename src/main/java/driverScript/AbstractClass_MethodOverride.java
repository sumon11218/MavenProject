package driverScript;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by Sumon on 6/3/2017.
 */
public abstract class AbstractClass_MethodOverride {

    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;
    public static String reportPath = null;

    @BeforeSuite
    @Parameters("BrowserUrl")
    public static void openBrowser(String BrowserUrl) throws InterruptedException, IOException {
        System.out.println(":::::::::::::::::: CLOSING ALL INSTANCES OF CHROME DRIVER ::::::::::::::::::");
        //Kill ALL instances and services of Chrome and ChromeDriver then free memory
        Runtime.getRuntime().exec("src\\main\\resources\\CleanUp.cmd");
        reportPath = "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\extentReport.html";
        reports = new ExtentReports(reportPath, true);
        driver = reusableMethods.wDriver();
        Thread.sleep(3000);
        driver.navigate().to(BrowserUrl);

    }


    @AfterSuite()
    public static void closeBrowser() {
        //to end extent test you need to call the command below
        reports.endTest(test);
        //line below will flush the report
        reports.flush();
        //line below will open the report
       // WebDriver reportDriver = new ChromeDriver();
       // reportDriver.manage().window().maximize();
        driver.get(reportPath);
        //line below will close the report
       // reports.close();

        // driver.quit();
    }


    public static void getScreenShot(WebDriver wDriver, String imageName) {
        try {
            String fileName = imageName + ".png";
            String directory = "C:\\Users\\Sumon\\Documents\\extentreport\\reports\\screenshots\\";
            File sourceFile = ((TakesScreenshot) wDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            String image = test.addScreenCapture(directory + fileName);
            test.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            test.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }


}
