package NowaEra.MojaNowaEra;

import Common.DriverProvaider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.stream.Collectors;

public class RegistrationPage {

    @FindBy(xpath = "//ul[@class='arrow']/li")
    private List<WebElement> findAllServices;

    @FindBy(linkText = "Zakładanie konta")
    private WebElement createAccountButton;

    @FindBy(id = "user-form-register-first_name")
    private WebElement inputInsertFirstName;

    @FindBy(id = "user-form-register-last_name")
    private WebElement inputInsertLastName;

    @FindBy(id = "user-form-register-email")
    private WebElement inputInsertemail;

    @FindBy(xpath = "//input[@name='user-form-register[password]']")
    private WebElement inputInsertPassword;

    @FindBy(xpath = "//label[@id='user-form-register-kontone_regulations-label']/span[@class='checkbox']")
    private WebElement markCheckboxTrue;

    @FindBy(xpath = "//div[@id='user-form-register-submit-container']/button[@id='user-form-register-submit']")
    private WebElement buttonRegistedSubmit;

    @FindBy(xpath = ("//h2[@class='title' and text()='Zakładanie konta']"))
    private WebElement titleCreateAccount;

    public RegistrationPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverProvaider.prepareDriver(), 5), this);
    }

    public void clickToCreateAccountButton() {
        createAccountButton.click();
    }

    public void setInputInsertFirstName(String firstName) {
        inputInsertFirstName.sendKeys(firstName);
    }

    public void setInputInsertLastName(String lastName) {
        inputInsertLastName.sendKeys(lastName);
    }

    public void setInputInsertemail() {
        inputInsertemail.sendKeys(randomEmail());
    }

    public void setInputInsertPassword(String password) {
        inputInsertPassword.sendKeys(password);
    }

    public void setMarkCheckboxTrue() {
        markCheckboxTrue.click();
    }

    public void setButtonRegistedSubmit() {
        buttonRegistedSubmit.click();
    }

    public void listofElementListStream() {
        List<String> listOfServices = findAllServices.stream().map(WebElement::getText).collect(Collectors.toList());
        listOfServices.forEach(System.out::println);
    }

    public void listForEach() {
        for (WebElement webElement : findAllServices) {
            System.out.println(webElement.getText());
        }
    }

    public void getCreateAccountTilte() {
        System.out.println(titleCreateAccount.getText());
    }

    public void returnAssertionExamples() {
        SoftAssert softAssert = new SoftAssert();

        Assert.assertEquals(titleCreateAccount.getText(), "Zakładanie konta");
        softAssert.assertEquals(titleCreateAccount.isDisplayed(), true);
        softAssert.assertEquals(titleCreateAccount.getText(), "Zakładanie konta");
        softAssert.assertEquals(titleCreateAccount.getText(), "Inna wartosc");
        softAssert.assertTrue(titleCreateAccount.getText().startsWith("Zakładnie"));
    }

    public void getCheckboxByText(String nameOfCheckbox) {
        DriverProvaider.prepareDriver().findElement(By.xpath("//span[@class='checkbox']/ancestor::label[text()='" + nameOfCheckbox + "']")).click();
    }

    private String randomEmail() {
        double random = Math.random() * 500;
        String name = "Wiktor";
        return name + "@" + random;
    }

}
