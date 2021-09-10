package co.com.compra.online.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

//import co.com.compra.online.pages.HomePageLogueo;
//import co.com.compra.online.pages.HomePage;
//import co.com.compra.online.pages.HomePageHistorial;
import co.com.compra.online.steps.CompraHomePage;
import co.com.compra.online.steps.HistorialHomePage;
import co.com.compra.online.steps.LogueoHomePage;
import co.com.compra.online.steps.RegisterHomePage;
//import co.com.compra.online.pages.HomePageRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.thucydides.core.annotations.Steps;

public class CompraOnLineStepdefinitions {

	//Creo los objetos de las clases
	RegisterHomePage Register;
	CompraHomePage CompraLinea;
	HistorialHomePage Historial;
	LogueoHomePage Logueo;
	
	//Registro en la pagina
	
	@When("^I fill in all the mandatory fields of the form$")
	public void iFillInAllTheMandatoryFieldsOfTheForm() throws Exception {
		Register.openCompraOnLinePage();
		String email = "miguelarzghiasg11@gmail.com";
		String name = "juan";
		String lastname = "figeroa munera";
		String password = "123457";
		String address = "Cra50 No23-07";
		String city = "Medellin";
		String state = "Alabama";
		String postal = "00000";
		String movil = "3047809800";
		String aliasAddress = "Cra50 No23-07";	
		Register.RegisterUser(email, name, lastname, password, address, city, state, postal, movil, aliasAddress);
	}


	@Then("^I must be registered in the system$")
	public void iMustBeRegisteredInTheSystem() throws Exception {
		  assertThat(Register.ObtenerUsuario()).isEqualToIgnoringCase("juan figeroa munera");
	}
	
	
	String Texto;
	
	@Given("^I select the category of summer dresses$")
	public void iSelectTheCategoryOfSummerDresses() throws Exception {
		Logueo.openCompraOnLinePage();
		Logueo.digitarCorreoEletronico("miguelarias6@gmail.com");
		Logueo.digitarContraseña("123457");			
	}

	@Given("^I select the most economical dress from the list of results$")
	public void iSelectTheMostEconomicalDressFromTheListOfResults() throws Exception {
		CompraLinea.escogerVestido();	
	}

	@When("^I buy the dress$")
	public void iBuyTheDress() throws Exception {
		CompraLinea.comprarVestido();  
	}

	@When("^payment by check$")
	public void paymentByCheck() throws Exception {
		CompraLinea.PagarVestido();
	}

    //Assert
	@Then("^I bought the dress$")
	public void iBoughtTheDress() throws Exception {	    
	   //System.out.println("La validación es: " + CompraLinea.confirmattionMessage);
	   assertThat(CompraLinea.confirmattionMessage).isEqualToIgnoringCase("Your order on My Store is complete.");
	}
	
	//historia de usuario Dos
	@When("^entering the purchase history$")
	public void enteringThePurchaseHistory() throws Exception {
		Historial.HistorialCompra();
	}

	@Then("^I see the purchase order in the history$")
	public void iSeeThePurchaseOrderInTheHistory() throws Exception {
		System.out.println("\nLa");
		Texto = CompraLinea.homePage.referenciaTexto;
		//System.out.println("\nLa referencia de compra y el precio esta en la siguiente linea: " + Historial.ExisteReferenciaHistorial(Texto));
		assertThat(Historial.ExisteReferenciaHistorial(Texto)).isTrue();//pruebo otra forma de hacer el assert
	}
	



}
