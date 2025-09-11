package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverSetup {
    //commandline theke code run
    private static String browserName = System.getProperty("browser", "chrome");

    // prottekta testcase individually run korte hobe nahole test atke gele baki gulo run hobena tai threadlopcal use
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        DriverSetup.LOCAL_DRIVER.set(driver);
    }

    public static WebDriver getDriver() {
        return LOCAL_DRIVER.get();
    }

    public WebDriver getBrowser(String browser_name) {
        if (browser_name.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browser_name.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browser_name.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        } else {
            throw new RuntimeException("Browser not available" + browser_name);
        }
    }


    //2ta methods create korlam method er khetre ekta ekta kore hobe
    //Beforesuite er khetre shobar age hobe
    @BeforeMethod
    public void openBrowser() {
        WebDriver driver = getBrowser(browserName);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        setDriver(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        getDriver().quit();
    }

}
