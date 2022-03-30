package co.com.choucair.project.one.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageDivices {

    public static final Target CONTAINER_DIVICE_MOVIL =Target.the("Contenedor de dispositivos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    public static final Target DIVICE_MOVIL = Target.the("Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));


    public static final Target CONTAINER_MODEL_MOVIL =Target.the(" Contenedor Modelo de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    public static final Target MODEL_MOVIL = Target.the("Modelo de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));


    public static final Target CONTAINER_OS =Target.the("Contenedor Sistema operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    public static final Target OS = Target.the("Sistema operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target FINAL_BUTTON = Target.the("Boton para ir a la secion final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
