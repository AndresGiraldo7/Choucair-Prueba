package co.com.choucair.project.one.tasks;

import co.com.choucair.project.one.model.UtestData;
import co.com.choucair.project.one.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.project.one.userinterface.FinalPage.*;
import java.util.List;

public class WriteFinal implements Task {

    private List<UtestData> data;

    public WriteFinal(List<UtestData> data) {
        this.data = data;
    }

    public static WriteFinal thePage(List<UtestData> data) {
        return Tasks.instrumented(WriteFinal.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(COMFIRM_PASSWORD),
                Click.on(CHECKBOX_1),
                Click.on(CHECKBOX_2),
                Click.on(CHECKBOX_3),
                Click.on(COMPLETE_BUTTON)
        );
    }
}
