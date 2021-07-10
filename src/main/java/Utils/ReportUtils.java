package Utils;

import BaseClasses.BaseWebdriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class ReportUtils {
    private static WebDriver driver;

    public ReportUtils() throws Exception {
        driver = BaseWebdriver.getDriverInstance();
    }

    // create ExtentReports and attach reporter(s)
    private static ExtentReports extent = new ExtentReports();
    // creates a toggle for the given test, adds all log events under it
    public static ExtentTest test = extent.createTest("BuyMeProject Tests", "Test BuyMe App " +
            "Including 4 Tests - Sign-UP, HomePage, PickABusiness and SenderAndReceiverInfo");

    @BeforeClass
    public static void beforeClass(){
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("/extent.html");
        extent.attachReporter(htmlReporter);
        test.log(Status.INFO, "before test method");
    }

    @AfterClass
    public static void afterClass() {
        extent.flush();
        driver.quit();

    }

}
