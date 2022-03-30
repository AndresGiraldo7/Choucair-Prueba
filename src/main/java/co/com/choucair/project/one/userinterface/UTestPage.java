package co.com.choucair.project.one.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Boton join today para iniciar el registro")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/home/div/ut-unauthenticated-home/div/div[1]/div[2]/div/a"));
}
