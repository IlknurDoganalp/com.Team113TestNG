package tests.day15POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest  {

    @Test
    public void test01() {
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();
        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        // login butonuna basin
        qualitydemyPage.loginButton.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrol.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();
    }
}
