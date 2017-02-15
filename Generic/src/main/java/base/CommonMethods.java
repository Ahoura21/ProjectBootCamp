package base;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by ahoura on 1/20/17.
 */
public class CommonMethods {
    protected WebDriver driver = null;

    @Parameters({"useCloudEnv", "userName", "accessKey", "os", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("ahoura21") String userName, @Optional("")
            String accessKey, @Optional("mac") String os, @Optional("firefox") String browserName, @Optional("")
                              String browserVersion, @Optional("") String url) throws IOException {
        if (useCloudEnv == true) {
            //run in cloud
            getCloudDriver(userName, accessKey, os, browserName, browserVersion);

        } else {
            //run in local
            getLocalDriver(os, browserName);
        }

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("Mac")) {
                System.setProperty("webdriver.chrome.driver", "/Users/ahoura/IdeaProjects/Testpractice-2017-jan20/Generic/driver/chromedriver");
            } else if (OS.equalsIgnoreCase("Win")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("Mac")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
            } else if (OS.equalsIgnoreCase("Win")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }

    public WebDriver getCloudDriver(String userName, String accessKey, String os, String browserName,
                                    String browserVersion) throws IOException {
        {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platform", os);
            cap.setBrowserName(browserName);
            cap.setCapability("version", browserVersion);
            cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
            driver = new RemoteWebDriver(new URL("http://" + userName + ":" + accessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
            return driver;
        }
    }




    @AfterMethod
    public void tearDown(){
        driver.close();
        driver =null;
    }
}
