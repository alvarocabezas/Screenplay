package co.com.choucair.proyetoPruebaCandidato.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterUserPage extends PageObject {

    //boton para ingresar al modulo de registro
    public static final Target BUTTON_REGISTER = Target.the("ingreso al mdulo de registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    //Elemento de ingreso del nombre
    public static final Target INSERT_NAME = Target.the("ingreso de nombre").located(By.id("firstName"));

    //Elemento de ingreso del apellido
    public static final Target INSERT_LASTNAME = Target.the("ingreso de apellido").located(By.id("lastName"));

    //Elemento de ingreso del apellido
    public static final Target INSERT_EMAIL = Target.the("ingreso del email").located(By.id("email"));

    //INGRESALA FEHA DE NACIMIENTO
    //slecionar mes
    public static final Target CLICK_MES = Target.the("Abrrir seleion del mes").located(By.id("birthMonth"));
    public static final Target SELECT_MES = Target.the("Selecionar el mes").located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));

    //slecionar dia
    public static final Target CLICK_DIA = Target.the("Abrrir seleion del dia").located(By.id("birthDay"));
    public static final Target SELECT_DIA = Target.the("Selecionar el dia").located(By.xpath("//*[@id=\"birthDay\"]/option[5]"));

    //slecionar año
    public static final Target CLICK_ANO = Target.the("Abrrir seleion del año").located(By.id("birthYear"));
    public static final Target SELECT_ANO = Target.the("Selecionar el año").located(By.xpath("//*[@id=\"birthYear\"]/option[5]"));

    //ingresar el idioma
    public static final Target INSERT_IDIOMA = Target.the("Ingresar idioma").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    //seleionar el idioma español
    public static final Target SELECT_IDIOMA = Target.the("Ingresar idioma").located(By.xpath("//*[@id=\"languages\"]/ul"));


    //boton para ingresar a la segunda seccion del registro
    public static final Target BUTTON_SECOND_SECTION_REGISTER = Target.the("ingreso a la segunda parte del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    //SECCION DOS DEL REGISTRO
    //ingrsar la ciudad
    public static final Target INSERT_CITY = Target.the("Ingresar la ciudad").located(By.id("city"));
    //ingresar codigo postal
    public static final Target INSERT_CODE_POSTAL = Target.the("Ingresar el codgo postal").located(By.id("zip"));
    //ingresar el pais
    public static final Target INSERT_COUNTRY = Target.the("Ingresar el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INSERT_TEXT_COUNTRY = Target.the("Ingresar el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    //boton para ingresar a la tercera seccion del registro
    public static final Target BUTTON_THIRD_SECTION_REGISTER = Target.the("ingreso a la tercera parte del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));


    //SECCION TRES DEL REGISTRO
    //selecionar mi computador
    public static final Target CLICK_YOUR_COMPUTER = Target.the("Ingresar el computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    //ingresar nombre del sistema operativo del computador
    public static final Target TEXT_YOUR_COMPUTER = Target.the("Ingresar el nombre del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    //selcionar la version
    public static final Target CLICK_VERSION_COMPUTER = Target.the("Ingresar la version del comptador").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    //ingresar nombre de la vercion de tu comptador
    public static final Target TEXT_VERSION_COMPUTER = Target.the("Ingresar el nombre del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    //selecionar idioma de mi compador
    public static final Target CLICK_LENGUAGE_COMPUTER = Target.the("Ingresar el lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    //ingresar nombre del lenguaje
    public static final Target TEXT_LENGUAGE_COMPUTER = Target.the("Ingresar el nombre del lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    //boton para ingresar a la tercera seccion del registro
    public static final Target BUTTON_FOURTH_SECTION_REGISTER = Target.the("ingreso a la cuarta parte del regsitro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));








    //SECION CUATRO DEL REGISTRO
    //Elemeto de ingreso de contraseña
    public static final Target INSERT_PASSWORD = Target.the("ingreso de la contraseña").located(By.id("password"));

    //Elemeto de ingreso de confirmacion contraseña
    public static final Target INSERT_CONFIRMATION_PASSWORD = Target.the("ingreso de la confirmacion de contraseña").located(By.id("confirmPassword"));

    //check mumero 1
    public static final Target CHEK1 = Target.the("selecion del check numero 1").located(By.name("newsletterOptIn"));

    //check mumero 2
    public static final Target CHEK2 = Target.the("selecion del check numero 2").located(By.name("termOfUse"));

    //check mumero 3
    public static final Target CHEK3 = Target.the("selecion del check numero 3").located(By.name("privacySetting"));

    //boton de registro completo
    public static final Target BUTTON_REGISTER_COMPLET = Target.the("boton para ingresar el usuario").located(By.id("laddaBtn"));

    //berificar si se guardo el usuario
    public static final Target USER_VERIFICATION_COMPLETED = Target.the("Estrae texto de comfirmacion").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
