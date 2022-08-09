package test;

import base.Sporeti.BaseTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import page.HelperPage;
import page.KombinovaniSporetiPage;
import page.ProveraSnizenjaCenePage;
import page.RegistrationPageSporeti;

public class SporetiTest extends BaseTest {


     RegistrationPageSporeti registrationPageSporeti;
     ProveraSnizenjaCenePage proveraSnizenjaCenePage;
     KombinovaniSporetiPage kombinovaniSporetiPage;
   //  HelperPage helperPage;

     String KomentarMessage = "Uzeli smo ovaj sporet za vikendicu jer je bio povoljan. " +
             "Da se skuva nesto na njemu povremeno, ispece ili isprzi je odlican. " +
             "Mi ga ne koristimo mnogo ali kad ga koristimo nema greske.";


    @Before
    public void SetUpTest() {
        registrationPageSporeti = new RegistrationPageSporeti();
        proveraSnizenjaCenePage = new ProveraSnizenjaCenePage();
        kombinovaniSporetiPage = new KombinovaniSporetiPage();
    //    helperPage = new HelperPage();

    }

    @Test
   public void SporetiTest() {
        registrationPageSporeti
                .PrihvatamButtonClick()
               // .CloseReklamaPopup()
                .SviProizvodiDropdown()
                .BelaTehnikaHover();
        kombinovaniSporetiPage.ŠporetiClick()
                .Kombinovanišporeti()
                .GorenjeCheckbox();
        registrationPageSporeti.PrihvatamButtonClick();
        kombinovaniSporetiPage.GorenjeŠporet();
                assertTrue(proveraSnizenjaCenePage.AfterCenaIsDisplayed());
                assertEquals("28.999",proveraSnizenjaCenePage.AfterCenaGetText());
        driver.navigate().back();
        kombinovaniSporetiPage.GorenjeCheckbox()
                 .TeslaCheckbox()
                 .TeslaŠporet()
                 .BojaŠporetaTesla();
        kombinovaniSporetiPage.Ocene();
               assertTrue(kombinovaniSporetiPage.KomentarIsDisplayed());
               assertEquals(KomentarMessage,kombinovaniSporetiPage.KomentarGetText());
               assertTrue(kombinovaniSporetiPage.DatumIsDisplayed());
               assertEquals("(30.06.2021)",kombinovaniSporetiPage.DatumGetText());
               assertTrue(kombinovaniSporetiPage.NaslovIsDisplayed());
               assertEquals("Tesla sporet", kombinovaniSporetiPage.NaslovGetText());


    }

}




























