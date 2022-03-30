package co.com.choucair.project.one.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {

    public static final Target PASSWORD = Target.the("Clave de acceso")
            .located(By.id("password"));
    public static final Target COMFIRM_PASSWORD = Target.the("Confirmar Clave de acceso")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_1= Target.the("Checkbox_1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/div[1]"));
    public static final Target CHECKBOX_2= Target.the("Checkbox_2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label"));
    public static final Target CHECKBOX_3= Target.the("Checkbox_3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label"));
    public static final Target COMPLETE_BUTTON = Target.the("Boton Terminar registro de usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
