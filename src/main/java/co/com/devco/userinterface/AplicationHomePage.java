package co.com.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AplicationHomePage {
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("org.wordpress.android:id/continue_with_wpcom_button"));
}
