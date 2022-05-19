package co.com.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginPage {
    public static final Target EMAIL_FIELD = Target.the("Email field").located(By.id("org.wordpress.android:id/input"));
    public static final Target CONTINUE_EMAIL_BUTTON = Target.the("Continue email button").located(By.id("org.wordpress.android:id/login_continue_button"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.id("org.wordpress.android:id/input"));
    public static final Target CONTINUE_PASSWORD_BUTTON = Target.the("Continue password button").located(By.id("org.wordpress.android:id/bottom_button"));
    public static final Target LABEL_TEXT = Target.the("Text label").located(By.id("org.wordpress.android:id/login_epilogue_header_subtitle"));
}
