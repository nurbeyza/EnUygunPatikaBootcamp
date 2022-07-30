import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;


//Bu sınıf tüm gerekli path'leri verdiğimiz ChromeDriver'a bağlantı sağladığımız fonksiyonu barındıran sınıf
public class Connection{
    public String url() {
        //ChromeDriver.exe yolu ve gerekli url veriliyor
        String url = "https://www.enuygun.com/";
        return url;
    }
    public String path(){
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        return absolutePath;
    }
}

