package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterface.loginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login implements Task {

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    private String user;
    private String password;

    public static Login with(String user, String password) {
        return Tasks.instrumented(Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(EMAIL_FIELD),
                Click.on(CONTINUE_EMAIL_BUTTON),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(CONTINUE_PASSWORD_BUTTON),
               WaitUntil.the(LABEL_TEXT, isPresent()).forNoMoreThan(10).seconds()
        );
    }
}
