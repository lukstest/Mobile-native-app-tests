import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

/**
 * Created by lzaremba on 07/09/15.
 */
public class creativity {




        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "8.1");
            capabilities.setCapability("deviceName", "Krzysztof's iPad");
            java.lang.String appBundle = "com.harimata.Launcher";
            capabilities.setCapability("app", appBundle);
            AppiumDriver wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Parental Gate
            String ParCon = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
            String Liczba1 = ParCon.substring(0, 1);
            String Liczba2 = ParCon.substring(4, 5);
            int Liczba1Int = Integer.parseInt(Liczba1);
            int Liczba2Int = Integer.parseInt(Liczba2);
            int ParConResult = Liczba1Int * Liczba2Int;
            String ParConResultStr = String.valueOf(ParConResult);
            wd.findElement(By.name(ParConResultStr)).click();

// Logowanie mail
            wd.findElement(By.name("Sign In")).click();
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("lukasz.z@harimata.co");
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("wisla1906");
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();


            try {
                Thread.sleep(32000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // handle the exception...
                // For example consider calling Thread.currentThread().interrupt(); here.
            }

// Parental Gate 2
            String ParCon_1 = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).getAttribute("name");
            String Liczba1_1 = ParCon_1.substring(0, 1);
            String Liczba2_1 = ParCon_1.substring(4, 5);
            int Liczba1Int_1 = Integer.parseInt(Liczba1_1);
            int Liczba2Int_1 = Integer.parseInt(Liczba2_1);
            int ParConResult_1 = Liczba1Int_1 * Liczba2Int_1;
            String ParConResultStr_1 = String.valueOf(ParConResult_1);
            wd.findElement(By.name(ParConResultStr_1)).click();



// Take assessment
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[3]")).click();
            /*
            (JavascriptExecutor)wd.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", 1); put("touchCount", 1); put("duration", 0.5); put("x", 525); put("y", 543); }});
            (JavascriptExecutor)wd.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", 1); put("touchCount", 1); put("duration", 0.5); put("x", 496); put("y", 598); }});
            (JavascriptExecutor)wd.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", 1); put("touchCount", 1); put("duration", 0.5); put("x", 535); put("y", 455); }});
            (JavascriptExecutor)wd.executeScript("mobile: swipe", new HashMap<String, Double>() {{ put("touchCount", 1); put("startX", 817); put("startY", 447); put("endX", 294); put("endY", 292); put("duration", 0.5); }});
            wd.close(); */
        }
}






