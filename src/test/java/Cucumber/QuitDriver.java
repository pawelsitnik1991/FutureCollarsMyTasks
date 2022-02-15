package Cucumber;

import Common.BaseTest;
import io.cucumber.java.en.Then;

public class QuitDriver extends BaseTest {
    @Then("Page is closed")
    @Override
    public void quitDriver() {
        System.out.println("Zamykam");
        super.quitDriver();
    }
}
