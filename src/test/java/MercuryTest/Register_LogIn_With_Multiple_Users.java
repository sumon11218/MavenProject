package MercuryTest;

import MercuryTestMethods.LogIn;
import MercuryTestMethods.Registration;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.Netapi32Util;
import driverScript.AbstractClass_MethodOverride;
import javafx.geometry.Pos;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sumon on 6/10/2017.
 */
public class Register_LogIn_With_Multiple_Users extends AbstractClass_MethodOverride{

    String abc;
    WebDriverWait wait;

    @Test()
    public void SignUp_LogIn() throws IOException, BiffException, InterruptedException, WriteException, BiffException {
        //line below will declare that test will be used in this extent report
        test = reports.startTest("Registration & LogIn Test", "Mercury Tour Registration and then LogIn");
        test.log(LogStatus.INFO, "navigating to Mercury Tour registration page");

        wait = new WebDriverWait(driver, 10);
        //define the path excel
        Workbook workbook = Workbook.getWorkbook(new File("src\\main\\java\\dataInput\\Book1.xls"));
        //line below will define the worksheet that we are using
        Sheet workSheet = workbook.getSheet(0); //can be used by index or string
        //line below will define writeable workbook
        WritableWorkbook writeableWorkbook = Workbook.createWorkbook(new File("src\\main\\java\\dataInput\\Book1_Result.xls"), workbook);
        //line below will define the writable sheet
        WritableSheet sheet2 = writeableWorkbook.getSheet(0);


        //line below will define the non empty rows within the sheet
        int rowNumber = workSheet.getRows();

        for (int i = 1; i <= rowNumber - 1; i++) {

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
            //calling reusable method called signup and storing as a variable to write confirmation message back to excel
            String message = Registration.SignUp(FirstName,LastName,Phone,Email,Address,City,State,PostalCode,UserName,Password,ConfirmPass);

            Label label = new Label(11, i, message);
            sheet2.addCell(label);

            //line below will call log in method to log in with the user name and password
            LogIn.LogIn(UserName,Password);

        }

        //only write anc close the Writable Workbook after for loop
        writeableWorkbook.write();
        writeableWorkbook.close();

    }






}
