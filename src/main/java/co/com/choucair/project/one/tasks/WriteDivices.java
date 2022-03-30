package co.com.choucair.project.one.tasks;

import co.com.choucair.project.one.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.project.one.userinterface.PageDivices.*;
import java.util.List;

public class WriteDivices implements Task {

    private List<UtestData> data;

    public WriteDivices(List<UtestData> data) {
        this.data = data;
    }

    public static WriteDivices thePage(List<UtestData> data) {
        return Tasks.instrumented(WriteDivices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTAINER_DIVICE_MOVIL),
                Enter.theValue(data.get(0).getStrMovilDivice()).into(DIVICE_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTAINER_MODEL_MOVIL),
                Enter.theValue(data.get(0).getStrMovilModel()).into(MODEL_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTAINER_OS),
                Enter.theValue(data.get(0).getStrSoMovil()).into(OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(FINAL_BUTTON)
        );

    }
}
