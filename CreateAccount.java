import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.By;
import java.lang.String;

/**
 * Created by lzaremba on 12/08/15.
*/
public class CreateAccount {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "iPad 2");
        java.lang.String appBundle = "com.hari.Launcher";
        capabilities.setCapability("app", appBundle);
        AppiumDriver wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Parental Control
        String ParCon = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
        String Liczba1 = ParCon.substring(0, 1);
        String Liczba2 = ParCon.substring(4, 5);
        int Liczba1Int = Integer.parseInt(Liczba1);
        int Liczba2Int = Integer.parseInt(Liczba2);
        int ParConResult = Liczba1Int * Liczba2Int;
        String ParConResultStr = String.valueOf(ParConResult);
        wd.findElement(By.name(ParConResultStr)).click();
        wd.findElement(By.name("     Sign up with e-mail")).click();

//  Validate all fields
        wd.findElement(By.name("Save")).click();
        wd.findElement(By.name("Type your name")).isDisplayed();
        wd.findElement(By.name("Type your e-mail address")).isDisplayed();
        wd.findElement(By.name("Type your password")).isDisplayed();
        wd.findElement(By.name("Type your sialala")).isDisplayed();
    }
}
