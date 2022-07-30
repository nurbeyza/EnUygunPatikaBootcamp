import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestRun {
    public static WebDriver driverChrome, driverFirefox;
    Browser browser = new Browser();
    Method method = new Method();

    //Teste başlamadan önceki adımı burada yapıyoruz, Browserları burada açıyoruz ve düzgün yükelnemsi için 15 saniye bekletiyoruz
    @Before
    public void Browser() throws Exception {
        driverChrome = browser.OpenBrowser("Chrome", browser.url(), browser.path());
        driverFirefox = browser.OpenBrowser("Firefox", browser.url(), browser.path());
        method.wait(driverChrome);
        method.wait(driverFirefox);
    }

    //Testleri bu adımda koşuyoruz, method sınıdından uygun fonksiyonları çağırıyoruz
    @Test
    public void LoginTest() throws Exception {

        method.openLoginPage(driverChrome);
        method.openLoginPage(driverFirefox);

    }
    @Test
    public void SignUpTest() throws Exception{
        method.openSignup(driverChrome);
        method.openSignup(driverFirefox);
    }



    //Son olarak açtığımız sayfamızı driver.quit diyerek kapatıyoruz
    @After
    public void Down() throws Exception{
        driverChrome.quit();
        driverFirefox.quit();
    }



}
