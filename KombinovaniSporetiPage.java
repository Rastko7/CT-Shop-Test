package page;

import base.Sporeti.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KombinovaniSporetiPage extends BaseTest {

    public KombinovaniSporetiPage() {
        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "//label[contains(text(), \"Beko\")]")
   // WebElement BekoCheckbox;
    @FindBy(xpath = "//label[contains(text(), \"Tesla\")]")
    WebElement TeslaCheckbox;
    @FindBy(xpath = "//a[contains(text(), \"Šporeti\")]")
    WebElement ŠporetiClick;
    @FindBy(linkText = "Kombinovani šporeti")
    WebElement Kombinovanišporeti;
    @FindBy(xpath = "//label[contains(text(), \"Gorenje\")]")
    WebElement GorenjeCheckbox;
    @FindBy(linkText = "Gorenje K5111WG kombinovani šporet")
    WebElement GorenjeŠporet;
   // @FindBy(linkText = "Beko FSS54010DW kombinovani šporet")
   // WebElement BekoŠporet;
    @FindBy(linkText = "Tesla CM5220SX kombinovani šporet")
    WebElement TeslaŠporet;
   // @FindBy(xpath = "//td[contains(text(),\"Bela\")]")
   // WebElement BojaŠporeta;
    @FindBy(xpath = "//i[contains(text(), \"Crna\")]")
    WebElement BojaŠporetaTesla;
    @FindBy(linkText = "Ocene")
    WebElement Ocene;
    @FindBy(xpath = "//p[contains(text(), \"Uzeli\")]")
    WebElement Komentar;
    @FindBy(xpath = "//strong[contains(text(), \"30.06.2021\")]")
    WebElement Datum;
    @FindBy(xpath = "//strong[contains(text(), \"Tesla sporet\")]")
    WebElement Naslov;


   // public KombinovaniSporetiPage BekoCheckbox() {
   //     wdwait.until(ExpectedConditions.elementToBeClickable(BekoCheckbox));
     //   BekoCheckbox.click();
     //   return this;
    //}
     public KombinovaniSporetiPage TeslaCheckbox(){
         wdWait.until(ExpectedConditions.elementToBeClickable(TeslaCheckbox));
         TeslaCheckbox.click();
         return this;
     }
    public KombinovaniSporetiPage ŠporetiClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(ŠporetiClick));
        ŠporetiClick.click();
        return this;
    }

    public KombinovaniSporetiPage Kombinovanišporeti() {
        wdWait.until(ExpectedConditions.elementToBeClickable(Kombinovanišporeti));
        Kombinovanišporeti.click();
        return this;
    }

    public KombinovaniSporetiPage GorenjeCheckbox() {
        wdWait.until(ExpectedConditions.visibilityOf(GorenjeCheckbox));
        GorenjeCheckbox.click();
        return this;
    }

    public KombinovaniSporetiPage GorenjeŠporet() {
        wdWait.until(ExpectedConditions.visibilityOf(GorenjeŠporet));
        Actions actions = new Actions(driver);
        actions.moveToElement(GorenjeŠporet).perform();
        GorenjeŠporet.click();
        return this;
    }
      //  public KombinovaniSporetiPage BekoŠporet() {
       //     wdwait.until(ExpectedConditions.visibilityOf(BekoŠporet));
      //      Actions actions = new Actions(driver);
      //      actions.moveToElement(BekoŠporet).perform();
    //        BekoŠporet.click();
    //        return this;
            public KombinovaniSporetiPage TeslaŠporet() {
            wdWait.until(ExpectedConditions.visibilityOf(TeslaŠporet));
            Actions actions = new Actions(driver);
            actions.moveToElement(TeslaŠporet).perform();
            TeslaŠporet.click();
            return this;
     }
        public KombinovaniSporetiPage BojaŠporetaTesla() {
        wdWait.until(ExpectedConditions.visibilityOf(BojaŠporetaTesla));
        Actions actions = new Actions(driver);
        actions.moveToElement(BojaŠporetaTesla).perform();
            return this;
    }
        public KombinovaniSporetiPage Ocene() {
        wdWait.until(ExpectedConditions.elementToBeClickable(Ocene));
        Actions actions = new Actions(driver);
        actions.moveToElement(Ocene).perform();
        Ocene.click();
            return this;
        }

        public boolean KomentarIsDisplayed(){
      //  wdwait.until(ExpectedConditions.visibilityOf(Komentar));
        Actions actions = new Actions(driver);
        wdWait.until(ExpectedConditions.visibilityOf(Komentar));
        actions.moveToElement(Ocene).perform();
        return Komentar.isDisplayed();
    }
        public String KomentarGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(Komentar));
        return Komentar.getText();
    }
        public boolean DatumIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(Datum));
        return Datum.isDisplayed();
    }
        public String DatumGetText() {
            wdWait.until(ExpectedConditions.visibilityOf(Datum));
            return Datum.getText();
        }

        public boolean NaslovIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(Naslov));
        return Naslov.isDisplayed();
    }
        public String NaslovGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(Naslov));
        return Naslov.getText();
    }

}