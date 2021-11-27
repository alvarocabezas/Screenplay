package co.com.choucair.proyetoPruebaCandidato.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/ProyetoTenico.feature",
        tags = "@stories",
        glue = "co.com.choucair.proyetoPruebaCandidato.stepdefinations",
        snippets = SnippetType.CAMELCASE)


public class RunnerTags {
}
