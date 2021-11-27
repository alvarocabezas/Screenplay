package co.com.choucair.proyetoPruebaCandidato.questions;

import co.com.choucair.proyetoPruebaCandidato.userinterface.UtestPage;
import co.com.choucair.proyetoPruebaCandidato.userinterface.UtestRegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String ConfirmRegistroUser = Text.of(UtestRegisterUserPage.USER_VERIFICATION_COMPLETED).viewedBy(actor).asString();
        if (question.equals(ConfirmRegistroUser)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}
