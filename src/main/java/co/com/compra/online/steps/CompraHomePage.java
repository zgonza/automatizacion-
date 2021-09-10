package co.com.compra.online.steps;
import co.com.compra.online.pages.HomePage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CompraHomePage extends PageObject{
	public HomePage homePage;
	public String confirmattionMessage = null;// ojo esta es la variable con la que llamo el assert
		  
  //esta linea de codigo es para seleccionar el vestido mas barato
    @Step
	public void escogerVestido(){	
    	  homePage.ClicEnBotonDresses();	
    	  homePage.ClicEnBotonSummerDresses();
    	  homePage.PrintListaVestidos();
    	  homePage.ClicEnBotonAddToCart();
    	}
    
    @Step
 	public void comprarVestido(){	
     	  homePage.ClicEnBotonProceedToCheckOut();;		
          homePage.ClicEnBotonSummary();
          homePage.ClicEnBotonAddress();
          homePage.ClicEnBotonShippingClic();
          homePage.ClicEnBotonShipping();
         
     	}
  		
    @Step
 	public void PagarVestido()  {	
    homePage.ClicEnBotonPayment();
    homePage.ClicEnBotonConfirm();
    //Espera de java
    try {
    	Thread.sleep(1000); 
    	} catch(InterruptedException ex) {
    	Thread.currentThread().interrupt();
    	}
    homePage.GuardarReferencia();   
    //homePage.getConfirmattionMessage();//assertThat
    confirmattionMessage =homePage.getConfirmattionMessage(); //assertThat
    }
    
     
  	}
 
