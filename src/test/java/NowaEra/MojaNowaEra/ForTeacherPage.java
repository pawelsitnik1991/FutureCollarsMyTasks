package NowaEra.MojaNowaEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

import static Common.DriverProvaider.prepareDriver;

public class ForTeacherPage {

    @FindBy(xpath = "//div[@class='dln-toolbar-unlogged-buttons dln-toolbar__unlogged']/a[@class='dln-toolbar-unlogged-buttons__register dln-toolbar-unlogged-buttons__button']")
    private WebElement getRegistrationPageButton;

    @FindBy(xpath = "//div[@class='ne-indicators__container']/child::div/child::div[1]")
    private List<WebElement> radioButtonAllClick;

    @FindBy(xpath = "//div['@class=ne-widget-top-carousel-tile__title ne--subtitle-2' and contains(text(),'Dla uczniów ze SPE')]")
    private WebElement clickToBookDlaUczniówZeSPE;

    public ForTeacherPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(prepareDriver(), 5),this );
    }
    public void clickONRegistrationPage(){
        getRegistrationPageButton.click();
    }
    public void allRadioButtonClick() throws InterruptedException {
        for (WebElement button: radioButtonAllClick) {
            button.click();
        }
        Thread.sleep(5000);
        System.out.println(sizeOFRadiobutton());
    }
    private static int sizeOFRadiobutton(){
        return prepareDriver().findElements(By.xpath(("//div[@class='ne-indicators__container']/child::div/child::div"))).size();
    }
}

