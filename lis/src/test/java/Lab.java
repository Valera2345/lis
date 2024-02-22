import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;

public class Lab {
    
    //Лаб 6
    @Test
    public void TestName(){
        Configuration.holdBrowserOpen = true;
        open("https://www.google.ru/webhp?hl=ru");
        $x("//textarea[@name='q']").setValue("Школяренко Валерий").pressEnter();
    }
}


