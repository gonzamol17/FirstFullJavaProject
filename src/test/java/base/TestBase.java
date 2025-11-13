package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utilities.ExtentManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;



public class TestBase {
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static Logger log = Logger.getLogger(TestBase.class.getName());
    public ExtentReports rep = ExtentManager.getInstance();
    public static ExtentTest test;
    public static WebDriverWait wait;



    @BeforeSuite
    public void setUp() {
        configureLogging();
        loadProperties();

        if (driver == null) {
            driver = initDriver(config.getProperty("browser"));
            driver.get(config.getProperty("testsiteurl"));
            log.debug("Navigated to: " + config.getProperty("testsiteurl"));

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }
    }

    private void configureLogging() {
        try {
            PropertyConfigurator.configure(TestBase.class.getClassLoader().getResource("log4j.properties"));
            log.info("Log4j configured successfully");
        } catch (Exception e) {
            System.err.println("Error configuring log4j: " + e.getMessage());
        }
    }

    private void loadProperties() {
        try {
            config.load(getClass().getClassLoader().getResourceAsStream("Config.properties"));
            OR.load(getClass().getClassLoader().getResourceAsStream("OR.properties"));
            log.info("Properties loaded successfully");
        } catch (IOException e) {
            log.error("Failed to load properties", e);
        }
    }

    private WebDriver initDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                // chromeOptions.addArguments("--headless"); // descomentar si se quiere headless
                log.debug("Chrome launched!!!");
                return new ChromeDriver(chromeOptions);

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                log.debug("Firefox launched!!!");
                return new FirefoxDriver();

            case "edge":
                WebDriverManager.edgedriver().setup();
                log.debug("Edge launched!!!");
                return new EdgeDriver();

            default:
                log.error("Browser no soportado: " + browser);
                throw new RuntimeException("Browser no soportado: " + browser);
        }
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            log.info("Browser closed and test execution completed");
        }
    }
}
