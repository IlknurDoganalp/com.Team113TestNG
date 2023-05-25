package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_DataProvider extends TestBaseRapor {

     /*
        dataProvider testNG'nin test method'u disindan
        test'e data saglamak icin olusturdugu ozel bir yapidir

        Bu yapi 2 katli bir Array dondurur!!!
         */



    @DataProvider

    public static Object[][] aranacaklarListesi() {

       String[][] aranacaklarArrayi={{"Java"},{"Apple"},{"Samsung"},{"Faker"},{"Cracker"}};

        return aranacaklarArrayi;
    }

    @Test(dataProvider = "aranacaklarListesi")

    public void test01(String aranacakKelime){

        extentTest= extentReports.createTest("Amazon Test",
                "Kullanici kelimeleri amazon sayfasinda aratabilmeli");

        //Amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon sayfasina gider.");
        // Bize test methodu disindan List olarak verilen urunlerin hepsi icin
        // arama kutusuna yazip arama yapin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
        extentTest.info("Kullanici arama kutusuna "+ aranacakKelime+" kelimesini arar");


        // sonuc yazisinin arattiginiz elementi icerdigini test edin
        String expectedIcerik=aranacakKelime;
        String actualAramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
        extentTest.pass("Arama sonuc yazisi "+aranacakKelime+" icerir");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
