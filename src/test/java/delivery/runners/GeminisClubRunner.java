package delivery.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/testcreation/webGeminisClub/features"},
        glue = {"testcreation.webGeminisClub.steps","engine.bdd"},
        plugin = {"pretty"},
        tags = "@test")
public class GeminisClubRunner {

}


