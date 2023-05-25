package tests.day14_TestNGFramework;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    /*

    Depends On Method oncelik sirasina karismaz.

    Depends On Methods bir test methodunun calismasini baska bir methodun calisip Passed olmasina baglar.

    Baglanilan method calismaz veya calisir ama Failed olursa baglanan method hic calismaz.

    Test notasyonu sayesinde her test bagimsiz olarak calistirilabilir.
    Ancak bir test depends on methods ile baska bir methoda baglanmis ise tek basina calistirilmasi istendiginde
    once bagli oldugu tets methodunu calistirir. O method calisip passed olursa
     asil calistirmak istedigimiz methodda calisir.

     Bu baglanti 3 veya daha fazla method arasinda olursa
     calistirmak istedigimiz method baska bir methoda o da baska bir methoda bagli ise 3'u birden calismaz!!!
     No Tests Were Found yazar ve hicbiri calismaz.


     */

    @Test(dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}
