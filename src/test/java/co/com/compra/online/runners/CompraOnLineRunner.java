package co.com.compra.online.runners;


import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\compraonline.feature",//mapea la historia
        glue = "co.com.compra.online.stepdefinitions", //mapea los steps
        snippets =SnippetType.CAMELCASE) //estandar de java

public class CompraOnLineRunner {

}