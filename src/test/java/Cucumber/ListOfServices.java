package Cucumber;

import NowaEra.MojaNowaEra.RegistrationPage;
import io.cucumber.java.en.When;

public class ListOfServices{

    RegistrationPage registrationPage = new RegistrationPage();

    @When("I see a list of services take it and show me it on List in Idea Java")
    public void iSeeAListOfServicesTakeItAndShowMeItOnListInIdeaJava() {
        registrationPage.listofElementListStream();
    }
}
