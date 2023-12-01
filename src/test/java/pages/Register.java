package pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import utils.GoogleSheetsReader;
import utils.UtilConstants;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class Register extends PageObject {
    @FindBy(xpath = "//div[1]/div[2]/div/a[2]")
    public static WebElementFacade BTN_SIGN_IN;

    public void ClicEnSignIn() {

        BTN_SIGN_IN.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Register Now!')]")
    public static WebElementFacade BTN_REGISTER_NOW;

    public void ClicEnRegisterNow() {
        BTN_REGISTER_NOW.click();
    }

    @FindBy(name = "username")
    public static WebElementFacade INPUT_USER_ID;
    @FindBy(name = "password")
    public static WebElementFacade INPUT_NEW_PASSWORD;
    @FindBy(name = "repeatedPassword")
    public static WebElementFacade INPUT_REPEAT_PASSWORD;
    @FindBy(name = "account.firstName")
    public static WebElementFacade INPUT_FIRST_NAME;
    @FindBy(name = "account.lastName")
    public static WebElementFacade INPUT_LAST_NAME;
    @FindBy(name = "account.email")
    public static WebElementFacade INPUT_EMAIL;
    @FindBy(name = "account.phone")
    public static WebElementFacade INPUT_PHONE;
    @FindBy(name = "account.address1")
    public static WebElementFacade INPUT_ADRESS_1;
    @FindBy(name = "account.city")
    public static WebElementFacade INPUT_CITY;
    @FindBy(name = "account.state")
    public static WebElementFacade INPUT_STATE;
    @FindBy(name = "account.zip")
    public static WebElementFacade INPUT_ZIP;
    @FindBy(name = "account.country")
    public static WebElementFacade INPUT_COUNTRY;

    public void DiligencieLosCamposObligatoriosDelFormulario(int rowNumber) {
        String valueToSearch1, valueToSearch2, valueToSearch3, valueToSearch4, valueToSearch5, valueToSearch6, valueToSearch7, valueToSearch8, valueToSearch9, valueToSearch10, valueToSearch11, valueToSearch12;
        String range = UtilConstants.NAME_HOJA + "!" + UtilConstants.RANGE;
        List<List<Object>> values = null;
        try {
            values = GoogleSheetsReader.read(UtilConstants.SPREADSHEET_ID, range);
            if (values == null || values.isEmpty()) {
                throw new RuntimeException("No hay datos en el documento.");
            }
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("No se leyo el documento, error: " + e.getMessage());
        }
        try {
            valueToSearch1 = String.valueOf((values).get(rowNumber).get(0));
            valueToSearch2 = String.valueOf((values).get(rowNumber).get(1));
            valueToSearch3 = String.valueOf((values).get(rowNumber).get(2));
            valueToSearch4 = String.valueOf((values).get(rowNumber).get(3));
            valueToSearch5 = String.valueOf((values).get(rowNumber).get(4));
            valueToSearch6 = String.valueOf((values).get(rowNumber).get(5));
            valueToSearch7 = String.valueOf((values).get(rowNumber).get(6));
            valueToSearch8 = String.valueOf((values).get(rowNumber).get(7));
            valueToSearch9 = String.valueOf((values).get(rowNumber).get(8));
            valueToSearch10 = String.valueOf((values).get(rowNumber).get(9));
            valueToSearch11 = String.valueOf((values).get(rowNumber).get(10));
            valueToSearch12 = String.valueOf((values).get(rowNumber).get(11));
        } catch (Exception e) {
            throw new RuntimeException("registro(s) vacio(s), error: " + e.getMessage());
        }
        enter(valueToSearch1).into(INPUT_USER_ID);
        enter(valueToSearch2).into(INPUT_NEW_PASSWORD);
        enter(valueToSearch3).into(INPUT_REPEAT_PASSWORD);
        enter(valueToSearch4).into(INPUT_FIRST_NAME);
        enter(valueToSearch5).into(INPUT_LAST_NAME);
        enter(valueToSearch6).into(INPUT_EMAIL);
        enter(valueToSearch7).into(INPUT_PHONE);
        enter(valueToSearch8).into(INPUT_ADRESS_1);
        enter(valueToSearch9).into(INPUT_CITY);
        enter(valueToSearch10).into(INPUT_STATE);
        enter(valueToSearch11).into(INPUT_ZIP);
        enter(valueToSearch12).into(INPUT_COUNTRY);
    }

    @FindBy(name = "newAccount")
    public static WebElementFacade BTN_SAVE_ACCOUNT;

    public void ClicEnSaveAccountInformation() {
        BTN_SAVE_ACCOUNT.click();
    }

    @FindBy(xpath = "//div[1]/div[4]/a[4]")
    public static WebElementFacade IMG_HOME;

    public void VolveraHome() {
        if (IMG_HOME.isDisplayed()) {
            System.out.println("La imagen está presente y visible en la pantalla.");
        } else {
            System.out.println("La imagen no está presente o no es visible en la pantalla.");
        }
    }

    //Registro Incorrecto
    public void IngresarUsuarioExistente(int rowNumber) {
        String valueToSearch1, valueToSearch2, valueToSearch3, valueToSearch4, valueToSearch5, valueToSearch6, valueToSearch7, valueToSearch8, valueToSearch9, valueToSearch10, valueToSearch11, valueToSearch12;
        String range = UtilConstants.NAME_HOJA + "!" + UtilConstants.RANGEINCORRECT;
        List<List<Object>> values = null;
        try {
            values = GoogleSheetsReader.read(UtilConstants.SPREADSHEET_ID, range);
            if (values == null || values.isEmpty()) {
                throw new RuntimeException("No hay datos en el documento.");
            }
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("No se leyo el documento, error: " + e.getMessage());
        }
        try {
            valueToSearch1 = String.valueOf((values).get(rowNumber).get(0));
            valueToSearch2 = String.valueOf((values).get(rowNumber).get(1));
            valueToSearch3 = String.valueOf((values).get(rowNumber).get(2));
            valueToSearch4 = String.valueOf((values).get(rowNumber).get(3));
            valueToSearch5 = String.valueOf((values).get(rowNumber).get(4));
            valueToSearch6 = String.valueOf((values).get(rowNumber).get(5));
            valueToSearch7 = String.valueOf((values).get(rowNumber).get(6));
            valueToSearch8 = String.valueOf((values).get(rowNumber).get(7));
            valueToSearch9 = String.valueOf((values).get(rowNumber).get(8));
            valueToSearch10 = String.valueOf((values).get(rowNumber).get(9));
            valueToSearch11 = String.valueOf((values).get(rowNumber).get(10));
            valueToSearch12 = String.valueOf((values).get(rowNumber).get(11));
        } catch (Exception e) {
            throw new RuntimeException("registro(s) vacio(s), error: " + e.getMessage());
        }
        enter(valueToSearch1).into(INPUT_USER_ID);
        enter(valueToSearch2).into(INPUT_NEW_PASSWORD);
        enter(valueToSearch3).into(INPUT_REPEAT_PASSWORD);
        enter(valueToSearch4).into(INPUT_FIRST_NAME);
        enter(valueToSearch5).into(INPUT_LAST_NAME);
        enter(valueToSearch6).into(INPUT_EMAIL);
        enter(valueToSearch7).into(INPUT_PHONE);
        enter(valueToSearch8).into(INPUT_ADRESS_1);
        enter(valueToSearch9).into(INPUT_CITY);
        enter(valueToSearch10).into(INPUT_STATE);
        enter(valueToSearch11).into(INPUT_ZIP);
        enter(valueToSearch12).into(INPUT_COUNTRY);
    }

    @FindBy(xpath = "//body/h1")
    public static WebElementFacade MSJ_ERROR_REGISTRO;

    public void MensajedeErrorRegistro() {
        String expectedMensaje = "Estado HTTP 500 – Internal Server Error";
        String actualMensaje = MSJ_ERROR_REGISTRO.getText();
        Assert.assertEquals(actualMensaje, expectedMensaje);
    }

    //Campos Vacios
    public void NoIngresarCamposObligatorios(int rowNumber) {
        String valueToSearch1, valueToSearch2, valueToSearch3;
        String range = UtilConstants.NAME_HOJA + "!" + UtilConstants.RANGEEMPTY;
        List<List<Object>> values = null;
        try {
            values = GoogleSheetsReader.read(UtilConstants.SPREADSHEET_ID, range);
            if (values == null || values.isEmpty()) {
                throw new RuntimeException("No hay datos en el documento.");
            }
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("No se leyo el documento, error: " + e.getMessage());
        }
        try {
            valueToSearch1 = String.valueOf((values).get(rowNumber).get(0));
            valueToSearch2 = String.valueOf((values).get(rowNumber).get(1));
            valueToSearch3 = String.valueOf((values).get(rowNumber).get(2));

        } catch (Exception e) {
            throw new RuntimeException("registro(s) vacio(s), error: " + e.getMessage());
        }
        enter(valueToSearch1).into(INPUT_USER_ID);
        enter(valueToSearch2).into(INPUT_NEW_PASSWORD);
        enter(valueToSearch3).into(INPUT_REPEAT_PASSWORD);
    }

    //IDVacio
    public void IDvacio(int rowNumber) {
        String valueToSearch2, valueToSearch3, valueToSearch4, valueToSearch5, valueToSearch6, valueToSearch7, valueToSearch8, valueToSearch9, valueToSearch10, valueToSearch11, valueToSearch12;
        String range = UtilConstants.NAME_HOJA + "!" + UtilConstants.RANGENOID;
        List<List<Object>> values = null;
        try {
            values = GoogleSheetsReader.read(UtilConstants.SPREADSHEET_ID, range);
            if (values == null || values.isEmpty()) {
                throw new RuntimeException("No hay datos en el documento.");
            }
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("No se leyo el documento, error: " + e.getMessage());
        }
        try {
            valueToSearch2 = String.valueOf((values).get(rowNumber).get(1));
            valueToSearch3 = String.valueOf((values).get(rowNumber).get(2));
            valueToSearch4 = String.valueOf((values).get(rowNumber).get(3));
            valueToSearch5 = String.valueOf((values).get(rowNumber).get(4));
            valueToSearch6 = String.valueOf((values).get(rowNumber).get(5));
            valueToSearch7 = String.valueOf((values).get(rowNumber).get(6));
            valueToSearch8 = String.valueOf((values).get(rowNumber).get(7));
            valueToSearch9 = String.valueOf((values).get(rowNumber).get(8));
            valueToSearch10 = String.valueOf((values).get(rowNumber).get(9));
            valueToSearch11 = String.valueOf((values).get(rowNumber).get(10));
            valueToSearch12 = String.valueOf((values).get(rowNumber).get(11));

        } catch (Exception e) {
            throw new RuntimeException("registro(s) vacio(s), error: " + e.getMessage());
        }
        enter(valueToSearch2).into(INPUT_NEW_PASSWORD);
        enter(valueToSearch3).into(INPUT_REPEAT_PASSWORD);
        enter(valueToSearch4).into(INPUT_FIRST_NAME);
        enter(valueToSearch5).into(INPUT_LAST_NAME);
        enter(valueToSearch6).into(INPUT_EMAIL);
        enter(valueToSearch7).into(INPUT_PHONE);
        enter(valueToSearch8).into(INPUT_ADRESS_1);
        enter(valueToSearch9).into(INPUT_CITY);
        enter(valueToSearch10).into(INPUT_STATE);
        enter(valueToSearch11).into(INPUT_ZIP);
        enter(valueToSearch12).into(INPUT_COUNTRY);
    }

    @FindBy(xpath = "//div[2]/div/form/h3[1]")
    public static WebElementFacade FORMULARIO_REGISTRO;
    public void PermaneceenRegistro() {
        String expectedMensaje = "User Information";
        String actualMensaje = FORMULARIO_REGISTRO.getText();
        Assert.assertEquals(actualMensaje, expectedMensaje);
    }

    //password vacios
    public void NoIngresaLosPassword(int rowNumber) {
        String valueToSearch1,valueToSearch4, valueToSearch5, valueToSearch6, valueToSearch7, valueToSearch8, valueToSearch9, valueToSearch10, valueToSearch11, valueToSearch12;
        String range = UtilConstants.NAME_HOJA + "!" + UtilConstants.RANGENOPASSWORD;
        List<List<Object>> values = null;
        try {
            values = GoogleSheetsReader.read(UtilConstants.SPREADSHEET_ID, range);
            if (values == null || values.isEmpty()) {
                throw new RuntimeException("No hay datos en el documento.");
            }
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("No se leyo el documento, error: " + e.getMessage());
        }
        try {
            valueToSearch1 = String.valueOf((values).get(rowNumber).get(0));
            valueToSearch4 = String.valueOf((values).get(rowNumber).get(3));
            valueToSearch5 = String.valueOf((values).get(rowNumber).get(4));
            valueToSearch6 = String.valueOf((values).get(rowNumber).get(5));
            valueToSearch7 = String.valueOf((values).get(rowNumber).get(6));
            valueToSearch8 = String.valueOf((values).get(rowNumber).get(7));
            valueToSearch9 = String.valueOf((values).get(rowNumber).get(8));
            valueToSearch10 = String.valueOf((values).get(rowNumber).get(9));
            valueToSearch11 = String.valueOf((values).get(rowNumber).get(10));
            valueToSearch12 = String.valueOf((values).get(rowNumber).get(11));
        } catch (Exception e) {
            throw new RuntimeException("registro(s) vacio(s), error: " + e.getMessage());
        }
        enter(valueToSearch1).into(INPUT_USER_ID);
        enter(valueToSearch4).into(INPUT_FIRST_NAME);
        enter(valueToSearch5).into(INPUT_LAST_NAME);
        enter(valueToSearch6).into(INPUT_EMAIL);
        enter(valueToSearch7).into(INPUT_PHONE);
        enter(valueToSearch8).into(INPUT_ADRESS_1);
        enter(valueToSearch9).into(INPUT_CITY);
        enter(valueToSearch10).into(INPUT_STATE);
        enter(valueToSearch11).into(INPUT_ZIP);
        enter(valueToSearch12).into(INPUT_COUNTRY);
    }

}


