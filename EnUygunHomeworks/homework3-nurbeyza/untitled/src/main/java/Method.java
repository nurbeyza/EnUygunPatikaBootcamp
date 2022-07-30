import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Bu sınıf login ve signup testlerini yazdığımız sınıf
 */
public class Method {

    //Driver açıldıktan sonra ilgili elemente tıklıyor.
    public void openLoginPage(WebDriver driver){
        driver.findElement(By.id("ctx-LoginBtn")).click();
    }
    //Driver açıldıktan sonra ilgili elemente tıklıyor.
    public void openSignup(WebDriver driver) {
       driver.findElement(By.id("ctx-RegisterBtn")).click();
    }

    ////İlgili url açıldıktan sonra 15 saniye bekletip tüm sayfanın düzgün yüklenmesini bekliyoruz
    public void wait(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctx-LoginBtn")));
    }
}
