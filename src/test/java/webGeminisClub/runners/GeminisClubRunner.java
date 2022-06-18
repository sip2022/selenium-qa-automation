package webGeminisClub.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/webGeminisClub/testcreation/features"},
        glue = {"webGeminisClub.testcreation.steps","webGeminisClub.bases"},
        plugin = {"json:src/test/report/cucumber_test_report.json"},
        tags = "@test")

public class GeminisClubRunner {

    @AfterClass
    public static void finish(){
        try{
            System.out.println();
            String[] cmd = {"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}


