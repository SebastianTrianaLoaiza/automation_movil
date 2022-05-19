package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.userinterface.loginPage.LABEL_TEXT;

public class VarifyWith implements Question<Boolean> {

    String question;
    public VarifyWith(String question) {
        this.question = question;
    }
    public static VarifyWith the(String question) {
        return new VarifyWith(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String text = Text.of(LABEL_TEXT).viewedBy(actor).asString();
        if(text.equals(question)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
