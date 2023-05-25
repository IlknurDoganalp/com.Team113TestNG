package Practice;

import org.testng.annotations.Test;

public class P01 {

    /*
    TestNG'de yazilan kodun calisma sirasi genellikle alfabetik siraya uygun olarak calisir.
    (Siralama method signature'ina uygun olarak calisir.)
     */

    @Test (priority = 10)
    public void Didem(){
        System.out.println("Didem");
    }

    @Test
    public void Zeynep(){
        System.out.println("Zeynep");
    }
    @Test (priority = -5)
    public void Kadir(){
        System.out.println("H.Kadir");
    }




}
