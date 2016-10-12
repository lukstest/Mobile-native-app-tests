/**
 * Created by lzaremba on 13/08/15.
 */
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.By;
import java.lang.String;


public class AccountSettings {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "iPad 2");
        java.lang.String appBundle = "com.harimata.Launcher";
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

// Login
        wd.findElement(By.name("Log In")).click();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("lukasz.z@harimata.co");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("test1234");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Parental Control 2
        String ParCon_1 = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
        String Liczba1_1 = ParCon_1.substring(0, 1);
        String Liczba2_1 = ParCon_1.substring(4, 5);
        int Liczba1Int_1 = Integer.parseInt(Liczba1_1);
        int Liczba2Int_1 = Integer.parseInt(Liczba2_1);
        int ParConResult_1 = Liczba1Int_1 * Liczba2Int_1;
        String ParConResultStr_1 = String.valueOf(ParConResult_1);
        wd.findElement(By.name(ParConResultStr_1)).click();
        
// Account settings
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAStaticText[1]")).click();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIATextField[1]")).clear();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIATextField[1]")).sendKeys("Lukasz123");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIATextField[1]")).clear();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIATextField[1]")).sendKeys("Zar123");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]/UIATextField[1]")).clear();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]/UIATextField[1]")).sendKeys("Autotest@harimata.co");
        
// Change password
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[4]")).click();
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("wisla1906");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[2]")).sendKeys("newpass");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[3]")).sendKeys("newpass");
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[3]/UIAButton[1]")).click();
    }
}
