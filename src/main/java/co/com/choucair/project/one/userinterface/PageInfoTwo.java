package co.com.choucair.project.one.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInfoTwo {

    public static final Target CITY = Target.the("Ciudad")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Codigo Postal")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Contenedor Paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS = Target.the("Pais")
           .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_TWO = Target.the("Boton Proxima seccion")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
