
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;


public class DemoClass {
   @Test
    public void goToURL(){
    open("https://www.imdb.com/");
    $(By.name("q")).setValue("games of thrones").pressEnter();
    $(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[4]/td[2]/a")).pressEnter();
    $("#title-overview-widget > div.vital > div.title_block > div > div.titleBar > div.title_wrapper > h1").shouldHave(Condition.text("Game of Thrones ")).getScreenshotAs(OutputType.FILE);
   }
}
