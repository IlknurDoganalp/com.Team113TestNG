package tests.day16_POM_Assertions;

import org.testng.annotations.Test;

public class C02_SingletonPattern {

    @Test
    public void test01(){

        /*
            otomasyon icin elimiz ve kolumuz olarak
            Driver class'indaki WebDriver driver objesini kullaniyoruz
            ANCAK driver'in bizim istedigimiz islemleri yapabilmesi icin
            oncelikle getDriver() icinde yaptigimiz atama islemlerine ihtiyaci var

            Bir framework'de calisan kisilerin
            getDriver() kullanmadan direk driver objesine erisimini engellemek icin
            Singleton Pattern kullanimi TERCIH EDILMISTIR

            Singleton Pattern bir class'dan
            obje olusturulmasini ve o obje ile class'daki class uyelerine erisimi engellemek icin kullanilir

            OOP konsept cercevesinde
            Driver class'ini farkli farkli yontemlerle kullanabilirsiniz
            Ekip calismasinin tek duzen uzerinden gitmesi onemli oldugundan

            farkli yontemlerle WebDriver driver'in kullanimini engellemek istiyoruz

            !!! NOT:  SingletonPAttern'de OBJE OLUSTURULAMAZ!!!!

            SINGLETON PATTERN BIR CLASSDAN OBJE OLUSTURULAMAMAK ICIN KULLANILIR.


         */

            // Driver.driver.get(ConfigReader.getProperty("amazonUrl"));
            // getDriver() calismadigindan driver null olarak isaretlendiginden
            // NullPointerException verir

            // Driver driver = new Driver();
            // driver.get("https://www.amazon.com");

            // driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

            // Driver class'indaki constructor'i private yapinca
            // kimse Driver class'indan obje olusturamaz

            // System.out.println(Driver.driver);
        }
    }

