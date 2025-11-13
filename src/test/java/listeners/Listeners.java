package listeners;

import base.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utilities.TestUtil;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Listeners extends TestBase implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        //test= rep.startTest(result.getName().toUpperCase());
        Logger log = Logger.getLogger(result.getInstance().getClass());
        log.info("========== STARTING TEST: " + result.getName()+ " ==========");
        test = rep.startTest(result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logger log = Logger.getLogger(result.getInstance().getClass());

        log.info("========== TEST PASSED: " + result.getName()+ " ==========");
        test.log(LogStatus.PASS, result.getName() + " -- Pass OK");
        rep.endTest(test);
        rep.flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {
       // Logger log = Logger.getLogger(result.getInstance().getClass());
       // try {
       //     TestUtil.captureScreenshot();
       // } catch (IOException e) {
       //     e.printStackTrace();
        //}
        //test.log(LogStatus.FAIL, result.getName().toUpperCase()+"-- Failed with exception: "+result.getThrowable());
        //test.log(LogStatus.INFO,test.addScreenCapture(TestUtil.screenshotName));

        //Reporter.log("Click to see the screenshot");
        //Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
        //Reporter.log("<a href=\"C:\\Users\\User\\Desktop\\Automation\\Selenium webdriver with java-Basics to Advanced+Frameworks\\DataDrivenFramework\\src\\test\\java\\Screenshot\\"+TestUtil.screenshotName+"\">Screenshot</a>");
        //Reporter.log("<br>");
        //Reporter.log("<br>");
        //Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height='600' width='600'></img></a>");

        //rep.endTest(test);
        //rep.flush();
        Logger log = Logger.getLogger(result.getInstance().getClass());

        log.error("========== TEST FAILED: " + result.getName() + " ==========");
        log.error("Exception: ", result.getThrowable());

        try {
            TestUtil.captureScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

        test.log(LogStatus.FAIL, result.getName() + " -- Failed with exception: " + result.getThrowable());
        test.log(LogStatus.INFO, test.addScreenCapture(TestUtil.screenshotName));

        rep.endTest(test);
        rep.flush();

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Logger log = Logger.getLogger(result.getInstance().getClass());
        log.warn("========== TEST SKIPPED: " + result.getName()+ " ==========");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        Logger log = Logger.getLogger(Listeners.class);
        log.info("========== STARTING TEST SUITE: " + context.getName() + " ==========");
    }

    @Override
    public void onFinish(ITestContext context) {
        Logger log = Logger.getLogger(Listeners.class);
        log.info("========== FINISHED TEST SUITE: " + context.getName() + " ==========");
    }
}
