package co.com.devco.utils;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.Before;


public class Hooks {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
