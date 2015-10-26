/**
 * Created by lzaremba on 10/08/15.
 */
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.By;
import java.lang.String;


public class login {
public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "Krzysztof's iPad");
        java.lang.String appBundle = "com.harimata.Launcher";
        capabilities.setCapability("app", appBundle);
        AppiumDriver wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

/* Parental Gate
        String ParCon = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
        String Liczba1 = ParCon.substring(0, 1);
        String Liczba2 = ParCon.substring(4, 5);
        int Liczba1Int = Integer.parseInt(Liczba1);
        int Liczba2Int = Integer.parseInt(Liczba2);
        int ParConResult = Liczba1Int * Liczba2Int;
        String ParConResultStr = String.valueOf(ParConResult);
        wd.findElement(By.name(ParConResultStr)).click(); */

// Logowanie mail
        wd.findElement(By.name("Sign In")).click();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("lukasz.z@harimata.co");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("wisla1906");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Parental Gate 2
        String ParCon_1 = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
        String Liczba1_1 = ParCon_1.substring(0, 1);
        String Liczba2_1 = ParCon_1.substring(4, 5);
        int Liczba1Int_1 = Integer.parseInt(Liczba1_1);
        int Liczba2Int_1 = Integer.parseInt(Liczba2_1);
        int ParConResult_1 = Liczba1Int_1 * Liczba2Int_1;
        String ParConResultStr_1 = String.valueOf(ParConResult_1);
        wd.findElement(By.name(ParConResultStr_1)).click();

// Wylogowanie
        wd.findElement(By.name("Account Settings")).click();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[11]/UIAStaticText[1]")).click();

// Tworzenie konta





        }
}
