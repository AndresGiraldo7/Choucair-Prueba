package co.com.choucair.project.one.tasks;

import co.com.choucair.project.one.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.project.one.userinterface.PageInfoTwo.*;
import java.util.List;

public class WriteTwo implements Task {
    private List<UtestData> data;

    public WriteTwo(List<UtestData> data) {
        this.data = data;
    }

    public static WriteTwo thePage(List<UtestData> data) {
       return Tasks.instrumented(WriteTwo.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(data.get(0).getStrPais()).into(PAIS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_TWO)
        );
    }
}
