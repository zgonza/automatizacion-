package co.com.compra.online.steps;

import net.serenitybdd.core.pages.PageObject;
import co.com.compra.online.pages.HomePageRegister;
import net.thucydides.core.annotations.Step;

public class RegisterHomePage extends PageObject {
	public HomePageRegister homePage; 
	
	
		@Step
		public void openCompraOnLinePage(){
			  homePage.open();
		}
		
	
	    @Step
		public void RegisterUser(String email, String name, String lastname, String password, String address,
				String city, String state, String postal, String movil, String aliasAddress ){	
	    homePage.ClicEnBotonsignInRegister();
	    homePage.crearCorreo(email);
	    homePage.ClicEnBotoncreateAcount();
	    homePage.ClicEnBotongenero();
	    homePage.IngresarNombre(name);
	    homePage.IngresarApellidos(lastname);
	    homePage.IngresarContrasena(password);
	    homePage.IngresarDireccion(address);
	    homePage.IngresarCiudad(city);
	    homePage.IngresarEstado(state);
	    homePage.IngresarCodigoPostal(postal);
	    homePage.IngresarCelular(movil);
	    homePage.IngresarAliasDireccion(aliasAddress);
	    homePage.ClicEnBotonRegister();
	  	
		}
	    
	    @Step
		public String ObtenerUsuario(){	
	    	String nombre = homePage.ObtenerUsuarioLogueado();
	    	return nombre;
	    }
   
}  
