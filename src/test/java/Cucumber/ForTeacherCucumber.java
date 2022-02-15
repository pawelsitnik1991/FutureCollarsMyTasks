package Cucumber;

import NowaEra.MojaNowaEra.ForTeacherPage;
import io.cucumber.java.en.Then;

public class ForTeacherCucumber {
    ForTeacherPage forTeacherPage = new ForTeacherPage();

    @Then("Click to Register on dla naczyciela")
    public void clickToRegisterOnDlaNaczyciela() {
        forTeacherPage.clickONRegistrationPage();
        System.out.println("Bylem na rejestracji");
    }

    @Then("Click to first Button")
    public void clickToFirstButton() throws InterruptedException {
        forTeacherPage.allRadioButtonClick();
    }
}
