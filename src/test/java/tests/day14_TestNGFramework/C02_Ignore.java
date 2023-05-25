package tests.day14_TestNGFramework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {

    /*

    @Ignore notasyonu basina yazdigi testin IGNORE edilmesini saglar.
    yani test ne passed ne de failed olur. notr'dur.
     */


    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3) @Ignore
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}
