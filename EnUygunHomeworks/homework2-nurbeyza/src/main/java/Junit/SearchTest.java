package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertNotNull;

public class SearchTest {
    public static WebDriver driver;

    //Connection sınıfından bir nesne üretiyoruz
    Connection Connection = new Connection();

    //Teste başlamadan önceki adımı burada yapıyoruz, Connection sınıfında bulunan fonksiyonu çalıştırıyoruz
    @Before
    public void Browser() throws Exception {
        driver = Connection.Browser();
    }


    //Testi bu adımda yapıyoruz
    @Test
    public void Test() throws Exception {

        //İlgili url açıldıktan sonra 15 saniye bekletip tüm sayfanın düzgün yüklenmesini bekliyoruz
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='searchBox']")));

        //Aradığımız elementi bulup assert yardımıyla varlığını kontrol ediyoruz
        //Eğer elementi doğru bulabilirsek assert bize passed değer döndürecek
        WebElement Search_box = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
        assertNotNull(Search_box);
    }

    //Son olarak açtığımız sayfamızı driver.quit diyerek kapatıyoruz
    @After
    public void Down() throws Exception{
        driver.quit();
    }


}
