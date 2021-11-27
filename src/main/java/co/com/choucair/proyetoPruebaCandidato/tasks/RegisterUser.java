package co.com.choucair.proyetoPruebaCandidato.tasks;

import co.com.choucair.proyetoPruebaCandidato.userinterface.UtestRegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.security.Key;

public class RegisterUser implements Task {

    public static Performable thePage() {
        return Tasks.instrumented(RegisterUser.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //ingresar al panel de registro.
                WaitUntil.the(UtestRegisterUserPage.BUTTON_REGISTER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(UtestRegisterUserPage.BUTTON_REGISTER),
                //ingresar el nombre
                Enter.theValue("Alvaro").into(UtestRegisterUserPage.INSERT_NAME),
                //ingresar el apellido
                Enter.theValue("cabezas").into(UtestRegisterUserPage.INSERT_LASTNAME),
                //ingresar el email.
                Enter.theValue("aicabezas12o5974@gmail.com").into(UtestRegisterUserPage.INSERT_EMAIL),
                //selecionar mes de nacimiento
                Click.on(UtestRegisterUserPage.CLICK_MES),
                Click.on(UtestRegisterUserPage.SELECT_MES),
                //selecionar dia de nacimiento
                Click.on(UtestRegisterUserPage.CLICK_DIA),
                Click.on(UtestRegisterUserPage.SELECT_DIA),
                //selecionar años de nacimiento
                Click.on(UtestRegisterUserPage.CLICK_ANO),
                Click.on(UtestRegisterUserPage.SELECT_ANO),
                //ingresar idima
                Enter.theValue("spanish").into(UtestRegisterUserPage.INSERT_IDIOMA),
                Click.on(UtestRegisterUserPage.SELECT_IDIOMA),
                //ingresar a la segunda parte del registro
                Click.on(UtestRegisterUserPage.BUTTON_SECOND_SECTION_REGISTER),

                //SEGUNDA PARTE DEL REGISTRO

                //ingresar ciudad
                Enter.theValue("Bogot\u00e1").into(UtestRegisterUserPage.INSERT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestRegisterUserPage.INSERT_CITY),
                //ingresar pais
                Click.on(UtestRegisterUserPage.INSERT_COUNTRY),
                Enter.theValue("Colombia").into(UtestRegisterUserPage.INSERT_TEXT_COUNTRY),
                //ingresar codigo postal
                Enter.theValue("111121").into(UtestRegisterUserPage.INSERT_CODE_POSTAL),
                //ingresar a la tercera parte del registro
                Click.on(UtestRegisterUserPage.BUTTON_THIRD_SECTION_REGISTER),


                //TERCERA PARTE DEL REGISTRO
                //ingresar tu computador
                Click.on(UtestRegisterUserPage.CLICK_YOUR_COMPUTER),
                Enter.theValue("Windows").into(UtestRegisterUserPage.TEXT_YOUR_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestRegisterUserPage.TEXT_YOUR_COMPUTER),
                //seleccionar el computador
                Click.on(UtestRegisterUserPage.CLICK_VERSION_COMPUTER),
                Enter.theValue("Windows 10").into(UtestRegisterUserPage.TEXT_VERSION_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestRegisterUserPage.TEXT_VERSION_COMPUTER),
                //ingresar lenguaje
                Click.on(UtestRegisterUserPage.CLICK_LENGUAGE_COMPUTER),
                Enter.theValue("Spanish").into(UtestRegisterUserPage.TEXT_LENGUAGE_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestRegisterUserPage.TEXT_LENGUAGE_COMPUTER),
                //ingresar a la cuarta parte del registro
                Click.on(UtestRegisterUserPage.BUTTON_FOURTH_SECTION_REGISTER),

                //CUARTA PARTE DEL REGISTRO
                //ingresar contraseña
                Enter.theValue("Alvaro100@@").into(UtestRegisterUserPage.INSERT_PASSWORD),
                //ingresar confirmacion de contraseña
                Enter.theValue("Alvaro100@@").into(UtestRegisterUserPage.INSERT_CONFIRMATION_PASSWORD),
                //selecionar primer check 1
                Click.on(UtestRegisterUserPage.CHEK1),
                //selecionar primer check 2
                Click.on(UtestRegisterUserPage.CHEK2),
                //selecionar primer check 3
                Click.on(UtestRegisterUserPage.CHEK3),
                //registrar el usuario
                Click.on(UtestRegisterUserPage.BUTTON_REGISTER_COMPLET),
                //verifiar si se ingreso el usuario
                WaitUntil.the(UtestRegisterUserPage.USER_VERIFICATION_COMPLETED, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());

    }
}
