package Cucumber;

import Common.Browser;
import io.cucumber.java.en.Given;

public class LoadPage  {
    Browser browser = new Browser();

    @Given("Page is loaded with {string}")
    public void pageIsLoadedWith(String url) {
        browser.setup(url);
    }

}
