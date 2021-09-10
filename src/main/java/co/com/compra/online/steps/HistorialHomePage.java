package co.com.compra.online.steps;
import co.com.compra.online.pages.HomePageHistorial;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HistorialHomePage extends PageObject {
	HomePageHistorial homePage;
	
	public String reference = null; //ojo esta es la variable que llamo en assert
	public String valorPagado = null;
	

	
	 //historial de la compra
    @Step
 	public void HistorialCompra( ){	
	    homePage.ClicEnBotonUsuario();
	    homePage.ClicEnBotonOrderHistory();  
	  
	    //assert
    }
     public boolean ExisteReferenciaHistorial(String tex)
     {
    	 return homePage.Listareferencias(tex);
    	 
     }
     

}
