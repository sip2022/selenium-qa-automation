package automationcraft.testcreation.webDafiti.steps;

import automationcraft.engine.database.MongoDBConfig;
import automationcraft.engine.database.MongoDBManage;
import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.webDafiti.pages.DafitiHomePage;
import automationcraft.testcreation.webDafiti.pages.DafitiHomePageArg;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.cucumber.java.en.*;
import org.bson.Document;
import org.openqa.selenium.Keys;
import org.testng.Assert;


/***
 * @author luisinakelly
 * @version 1
 */
public class GeminisClubSteps {

    final static String url = "";
    GeminisHomePage homePage = new GeminisHomePage(DriverFactory.getDriver());
    GeminisloginPage loginPage = new GeminisLoginPage(DriverFactory.getDriver());
    GeminisUserHomePage userPage = new GeminisUserHomePage(DriverFactory.getDriver());

    // -------------- GIVEN --------------

    // -------------- WHEN --------------


    // -------------- THEN --------------

    
}
