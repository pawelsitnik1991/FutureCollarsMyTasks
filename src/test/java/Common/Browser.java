package Common;

import NowaEra.MojaNowaEra.RegistrationPage;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browser{
    @BeforeEach
    public void setup(String url) {
        DriverProvaider.prepareDriver().get(url);
        DriverProvaider.prepareDriver().manage().window().maximize();
    }

    @Test
    public void listFromStream() {
        RegistrationPage listOfElement = new RegistrationPage();
        listOfElement.listofElementListStream();
    }

    @Test
    public void ListFromForEach() {
        RegistrationPage listOfElement = new RegistrationPage();
        listOfElement.listForEach();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) DriverProvaider.prepareDriver();
        js.executeScript("window.scrollBy(0,350)", "");
    }
    public void scrollToElement(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) DriverProvaider.prepareDriver();
        js.executeScript("arguments[0].scrollIntoView;", webElement);
    }

    public void scrollToElementByActions(WebElement webElement) {
        Actions actions = new Actions(DriverProvaider.prepareDriver());
        actions.moveToElement(webElement);
        System.out.println("I move to elemnt " + webElement.getAriaRole());
    }


}
