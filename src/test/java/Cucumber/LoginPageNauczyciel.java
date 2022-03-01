package Cucumber;

import NowaEra.MojaNowaEra.Logowanie;
import io.cucumber.java.en.Then;

public class LoginPageNauczyciel {
    Logowanie logowanie = new Logowanie();

    @Then("Login on Page dlanauczyciela")
    public void loginOnPageDlanauczyciela() {
        logowanie.LoginOnPage();
    }
}
