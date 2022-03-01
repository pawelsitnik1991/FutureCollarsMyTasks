package NowaEra.MojaNowaEra;

import Common.DriverProvaider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.asserts.SoftAssert;

import java.util.Collections;
import java.util.List;

public class Logowanie {
    @FindBy(xpath = "//div[@class='dln-toolbar-unlogged-buttons dln-toolbar__unlogged']/a[@class='dln-toolbar-unlogged-buttons__login dln-toolbar-unlogged-buttons__button']")
    private WebElement getRegistrationPageButton;
    @FindBy(id = "user-form-login-email")
    private WebElement login;
    @FindBy(id = "user-form-login-password")
    private WebElement password;
    @FindBy(id = "user-form-login-submit")
    private WebElement clickOnLoginButton;
    @FindBy(xpath = "//div[@class='dln-toolbar__user-link']")
    private WebElement textMojeKonto;

    @FindBy(xpath = "//div[@class='service__description--title']")
    private List<WebElement> listOfServices;


    public Logowanie() {
        PageFactory.initElements(new AjaxElementLocatorFactory(DriverProvaider.prepareDriver(), 5), this);
    }

    public void LoginOnPage(){
        getRegistrationPageButton.click();
        login.sendKeys("StudentNE@wp.pl");
        password.sendKeys("NowaEra2019");
        clickOnLoginButton.click();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(textMojeKonto.getText(),"Moje konto");
        DriverProvaider.prepareDriver().get("https://moja.nowaera.pl/panel/serwisy");
//        for (WebElement element:listOfServices) {
//            System.out.println(element);
//        }

        for (int i = listOfServices.size()-1; i >=0; i--) {
            System.out.println(listOfServices.get(i).getText());
        }


    }
}
