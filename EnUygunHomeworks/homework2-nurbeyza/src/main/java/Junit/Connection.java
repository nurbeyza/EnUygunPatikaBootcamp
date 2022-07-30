package Junit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;


//Bu sınıf tüm gerekli path'leri verdiğimiz ChromeDriver'a bağlantı sağladığımız fonksiyonu barındıran sınıf
public class Connection {

    public static WebDriver driver;


    public WebDriver Browser() {
        //ChromeDriver.exe yolu ve gerekli url veriliyor
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver.exe");
        String url = "https://demoqa.com/webtables";
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get methodu ile ilgili url'nin yönlendirilmesi yapılıyor
        driver.get(url);

        return driver;
    }
}
