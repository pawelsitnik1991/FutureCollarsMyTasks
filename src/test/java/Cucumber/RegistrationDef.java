package Cucumber;

import Common.Browser;
import NowaEra.MojaNowaEra.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationDef {

    RegistrationPage registrationPage = new RegistrationPage();
    Browser browser = new Browser();

    @When("Click to Register")
    public void clickToRegister() {
        registrationPage.clickToCreateAccountButton();
    }

    @Then("Insert Data FirstName with {string}")
    public void insertDataFirstNameWith(String firstName) {
        registrationPage.setInputInsertFirstName(firstName);
    }

    @And("Insert Data LastName with {string}")
    public void insertDataLastNameWith(String lastName) {
        registrationPage.setInputInsertLastName(lastName);
    }

    @And("Insert Data Email")
    public void insertDataEmail() {
        registrationPage.setInputInsertemail();
    }

    @And("Insert Data Password with {string}")
    public void insertDataPasswordWith(String password) {
        registrationPage.setInputInsertPassword(password);
    }

    @And("Confirm the Agreement")
    public void confirmTheAgreement() {
        registrationPage.setMarkCheckboxTrue();
    }

    @And("Submit the Registration")
    public void submitTheRegistration() {
        registrationPage.setButtonRegistedSubmit();
    }

    @And("I miss something")
    public void iMissSomething() {
        ListOfServices listOfServices = new ListOfServices();
        listOfServices.iSeeAListOfServicesTakeItAndShowMeItOnListInIdeaJava();
    }

    @And("Mark Checkbox by text {string}")
    public void markCheckboxByText(String nameOfCheckbox) {
        registrationPage.getCheckboxByText(nameOfCheckbox);
    }

    @And("Scroll Down the Browser")
    public void scrollDownTheBrowser() {
        browser.scrollDown();
    }
}
