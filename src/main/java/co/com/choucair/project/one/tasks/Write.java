package co.com.choucair.project.one.tasks;

import co.com.choucair.project.one.model.UtestData;
import co.com.choucair.project.one.userinterface.PageInfoOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.project.one.userinterface.PageInfoOne.*;
import java.util.List;

public class Write implements Task {
    private List<UtestData> data;

    public Write(List<UtestData> data) {
        this.data = data;
    }

    public static Write thePage(List<UtestData> data) {
        return Tasks.instrumented(Write.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(data.get(0).getStrSecondName()).into(SECOND_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(YEAR),
                Click.on(BUTTON_NEXT)
        );
    }
}
