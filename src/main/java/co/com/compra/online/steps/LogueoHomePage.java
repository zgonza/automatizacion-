package co.com.compra.online.steps;

import co.com.compra.online.pages.HomePageLogueo;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LogueoHomePage extends PageObject {

	public HomePageLogueo homePage; 
		@Step
		public void openCompraOnLinePage(){
			  homePage.open();
		}
		
	    @Step
		public void digitarCorreoEletronico(String email){	
	    homePage.ClicEnBotonSignInLogueo();
		homePage.IngresarCorreo(email); 	  
		}
	 
	    @Step
		public void digitarContraseña(String password){	
	      
	    	homePage.IngresarContrasena(password);  
	    	homePage.ClicEnBotonSignIn();	 
	    	}
}
