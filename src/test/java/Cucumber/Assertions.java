package Cucumber;

import NowaEra.MojaNowaEra.RegistrationPage;
import io.cucumber.java.en.And;

public class Assertions  {
    RegistrationPage registrationPage = new RegistrationPage();

    @And("Title Create Account Find")
    public void titleCreateAccountFind() {
        registrationPage.getCreateAccountTilte();
    }

    @And("Basic Assertion Are OK")
    public void basicAssertionAreOK() {
        registrationPage.returnAssertionExamples();
    }
}
