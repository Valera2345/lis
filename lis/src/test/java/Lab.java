import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;

public class Lab {
    
    @Test
    public void lib1()
    {
        //Test1(Открытие сайта)
        Configuration.holdBrowserOpen = true;
        open("https://author.today/");
    }
    @Test
    public void lib2() {
        //Test2
        $x("/html/body/header/div/nav/div[2]/ul/li[2]/a").click();
        
    }
    @Test
    public void lib3() {
        //Test3
        $x("/html/body/header/div/nav/div[1]/a").click();
        
    }
    @Test
    public void lib4() {
        //Test4
        $x("/html/body/header/div/nav/div[1]/a").click();
        
    }
    @Test
    public void lib5() {
        //Test5
        $x("/html/body/div[1]/div/section/div[1]/div/div[1]/div[2]/div/h2/a").click();
        
    }
    @Test
    public void lib6() {
        //Test6
        $x("/html/body/div[1]/div/section/div/div/div[1]/div/form/div[1]/div[1]/select").click();
        
    }
    @Test
    public void lib7() {
        //Test7
        $x("/html/body/div[1]/div/section/div/div/div[1]/div/form/div[1]/div[1]/select").click();
        
    }
    @Test
    public void lib8() {
        //Test8
        $x("/html/body/div[1]/div/section/div/div/div[1]/div/form/div[1]/div[1]/select/option[12]").click();
        
    }
    @Test
    public void lib9() {
        //Test9
        $x("/html/body/header/div/nav/div[1]/a").click();
        
    }
    @Test
    public void lib10() {
        //Test10
        $x("/html/body/div[1]/div/section/div/div/div[1]/div[2]/div/h2/a").click();
        
    }
    @Test
    public void lib11() {
        //Test11
        $x("/html/body/div[1]/div/section/div/div/div[1]/div/div/div[3]/div[2]/div[1]/a").click();
        
    }
    @Test
    public void lib12() {
        //Test12
        $x("/html/body/div[1]/div/section/div/div/div[1]/div[1]/div/div/div[1]/a").click();
        
    }
    @Test
    public void lib13() {
        //Test13
        $x("/html/body/div[1]/section/header/nav/div[1]/button/span").click();
        
    }
    @Test
    public void lib14() {
        //Test14
        $x("/html/body/div[1]/aside/div[4]/ul/li[3]").click();
        
    }
    @Test
    public void lib15() {
        //Test15
        $x("/html/body/div[1]/section/header/nav/div[1]/a").click();
        
    }
    @Test
    public void lib16() {
        //Test16
        $x("/html/body/div[1]/div/section/div/div/div[1]/div[1]/div/div/div[2]/div[4]/span/a[1]").click();
        
    }
    @Test
    public void lib17() {
        //Test17
        $x("/html/body/div[1]/div/section/div/div/div[1]/div/div/div[7]/div[2]/div[1]/a").click();
        
    }
    @Test
    public void lib18() {
        //Test18
        $x("/html/body/div[1]/div/section/div/div/div[1]/div[1]/div/div/div[2]/div[2]/div[3]/a").click();
        
    }
    @Test
    public void lib19() {
        //Test19
        $x("/html/body/header/div/nav/div[1]/a").click();
        
    }
    @Test
    public void lib20() {
        //Test20
        $x("/html/body/div[1]/div/section/div/div/div[1]/div[3]/div/div/a[5]").click();
        
    }
   
    
}


