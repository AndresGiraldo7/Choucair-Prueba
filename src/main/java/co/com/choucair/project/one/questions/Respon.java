package co.com.choucair.project.one.questions;

import co.com.choucair.project.one.model.UtestData;
import co.com.choucair.project.one.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Respon implements Question<Boolean> {

    private List<UtestData> data;

    public Respon(List<UtestData> data) {
        this.data = data;
    }

    public static Respon toThe(List<UtestData> data) {
        return new Respon(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Complete_Button = Text.of(FinalPage.COMPLETE_BUTTON).viewedBy(actor).asString();
        return data.get(0).getStrFinalText().equals(Complete_Button);
    }
}
