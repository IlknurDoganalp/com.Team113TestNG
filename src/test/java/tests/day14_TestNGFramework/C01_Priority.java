package tests.day14_TestNGFramework;

import org.testng.annotations.Test;

public class C01_Priority {

    /*
    JUnit Framework'te testlerin calisma sirasi ongorulemez ve duzenlenemezdi.

    TestNG testleri HARF SIRASINA GORE CALISTIRIR.
    Hangisinin calisacagini onceden ongorebiliriz.

    Ayrica Priority degerini girerek testleri istedigimiz sira ile de calistirabiliriz.
    Kontrol edilebilir.

    Priority sayisal olarak kucukten buyuge dogru testleri calistirir.

    Eger priority degeri ayni olan birden fazla test varsa yine harf sirasina bakar.

     */
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test(groups = "smoke")
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }

}
