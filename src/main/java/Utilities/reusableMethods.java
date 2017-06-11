package Utilities;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sumon on 5/7/2017.
 */
public class reusableMethods {

    public static WebDriver wDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","--incognito");
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }

    //line below will select element by visible text from a 'select' tag name
    public static void selectElementFromDropDownByText(WebElement element, String visibleText){
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(visibleText);

    }

    //line below will select element by index from a 'select' tag name
    public static void selectElementFromDropDownByIndex(WebElement element, int indexNumber){
        Select dropdown = new Select(element);
        dropdown.selectByIndex(indexNumber);

    }

    //line below will select element by value from a 'select' tag name
    public static void selectElementFromDropDownByValue(WebElement element, String value){
        Select dropdown = new Select(element);
        dropdown.selectByValue(value);

    }

    public static void scrollIntoElement(WebDriver driver, WebElement element){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);",element);

    }

    //method below will define webdriverwait
    public static void webDriverWait(WebDriver driver, int seconds, String xpathExpression){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
    }

    //method below will take a screenshot
    public static void getScreenShot(WebDriver wDriver, ExtentTest test, String path, String screenshotName) throws IOException {
        String fileName = screenshotName + ".png";
        File sourceFile = ((TakesScreenshot) wDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(path + fileName));
        //String imgPath = directory + fileName;
        String image = test.addScreenCapture(path + fileName);
        test.log(LogStatus.FAIL, "", image);

    }

}
