package co.com.choucair.project.one.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInfoOne {

    public static final Target FIRST_NAME = Target.the("Nombre")
            .located(By.id("firstName"));
    public static final Target SECOND_NAME = Target.the("Apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("Mes de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DAY = Target.the("Dia de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target YEAR = Target.the("Año de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BUTTON_NEXT = Target.the("Boton para la proxima pagina")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
