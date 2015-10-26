import io.appium.java_client.AppiumDriver;
import org.apache.xerces.util.URI;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lzaremba on 06/08/15.
 */
public class AppiumTest {
    private AppiumDriver driver;


    @BeforeMethod
    public void setUpTest() throws MalformedURLException, URI.MalformedURIException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platform-version", "8.1");
        capabilities.setCapability("deviceName", "Krzysztof's Ipad");
        java.lang.String appBundle = "com.harimata.Launcher";
        capabilities.setCapability("app", appBundle);
        driver = new AppiumDriver(new URL("http://127.0.0.1:4273/wd/hub"), capabilities);


    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

/*
    @Test
    public void simpleTest() {
        WebElement ParCon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]"));
        WebElement liczba1 = ParCon;
        String liczba2 = ParCon.substring(3, 4);

        System.out.println(ParCon);

    }
}


*/
}