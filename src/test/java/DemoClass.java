
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class DemoClass {

   @Test
    public void goToURL(){
       ScreenShooterExtension screenShooterExtension = new ScreenShooterExtension().to("target/selenide");
       open("https://www.imdb.com/");
       screenshot("Open_URL");
       $(By.name("q")).setValue("games of thrones").pressEnter();
       screenshot("Search_Text");
       $(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[4]/td[2]/a")).pressEnter();
       screenshot("Search_Result");
       $("#title-overview-widget > div.vital > div.title_block > div > div.titleBar > div.title_wrapper > h1").shouldHave(Condition.text("Game of Thrones "));
       screenshot("Verify_LandingPage");
   }
}
