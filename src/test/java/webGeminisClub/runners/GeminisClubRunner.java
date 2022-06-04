package webGeminisClub.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/webGeminisClub/testcreation/features"},
        glue = {"webGeminisClub.testcreation.steps","webGeminisClub.bases"},
        plugin = {"pretty"},
        tags = "@muestraClase")
public class GeminisClubRunner {

}


