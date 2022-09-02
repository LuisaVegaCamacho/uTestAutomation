package co.com.utest.automation.questions;

import co.com.utest.automation.userinterface.uTestForm4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titleLanding = Text.of(uTestForm4Page.LANDING_PAGE).viewedBy(actor).asString();
        if (question.equals(titleLanding)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}
