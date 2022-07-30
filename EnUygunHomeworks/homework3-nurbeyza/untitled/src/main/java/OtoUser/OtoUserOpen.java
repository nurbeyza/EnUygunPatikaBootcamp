package OtoUser;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ödev 1 olarak verilen ödev bu sınıf altında yazılmıştır.
 * Browser açıldığında otomatik olarak profilimiz ile açılması sağlanmıştır.
 */

public class OtoUserOpen {
    public static void main(String[] args) throws InterruptedException {

        //Driver yolları ve gerekli url veriliyor
        Path resourceDirectory = Paths.get("untitled", "src","main", "resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");

        //Bir options oluşturulup, options olarak profilimiz veriliyor.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\nuroz\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.quit();
    }



}
