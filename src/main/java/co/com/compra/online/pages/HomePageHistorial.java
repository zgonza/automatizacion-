package co.com.compra.online.pages;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")

public class HomePageHistorial extends PageObject {
	
	//Verificar Historial de ordenes
		@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
		WebElement clicUsuario;
		//Historial
		@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[1]/a/span") //"//*[@id='center_column']/h1")
		WebElement orderHistory;	
		
		//VERIFICAR
		//la referencia
		@FindBy(xpath="//*[@id='center_column']/div")
		WebElement reference;
		//el valor pagado
		@FindBy(xpath="//*[@id='center_column']/div")
		WebElement valorPagado;
			
		//Vector de referencias
		@FindBy(xpath="//*[@id='order-list']/tbody/tr")
		java.util.List <WebElement> referencias;
		
		//Este metodo es para que de clic en el historial de orden
		public void  ClicEnBotonUsuario(){
			clicUsuario.click();	
		}
		public void  ClicEnBotonOrderHistory(){
			orderHistory.click();	
		}
		
		//Assert para el historial de la compra 
		public String getReference(String Texto) {
			String s = Texto;
			String[] arra = s.split(" ");
			//System.out.println(arra[24]);
			return arra[24];
		}

		//Assert para el valor pagado
		public String getValorPagado(String Texto) {
			String valor = Texto;
			String[] arra = valor.split(" ");
			//System.out.println(arra[6]);
			return arra[6];	
		}
		//metodo para Referencias
		public boolean  Listareferencias(String Texto){ 
			//System.out.println(referencias.get(0).getText());//imprimo las referencias
			//System.out.println("El valor pagado almacenado es:"+ getValorPagado(Texto));//imprimo el valor pagado
			//System.out.println("la referencia almacenada es:"+getReference(Texto));//imprimo las referencias
			
			
			String referenciaOriginal=getReference(Texto).replace(".", "").replaceAll("-", "").replaceAll("\n", "");
			String fila = null;  //almacenamos la referencia
			String precioOriginal=getValorPagado(Texto).replaceAll("-", "").replaceAll("\n", "");
			
			//String filaPre = null;//almacenamos el precio
			
			for (int i=0; i<referencias.size(); i++){	        //rrecorremos las referencias
				fila=referencias.get(i).getText();
				if (fila.contains(referenciaOriginal) & fila.contains(precioOriginal)){
						System.out.println("el precio y la referencia estan contenidos en la fila:"+ fila);
						return true;	
				}
				
			 }	
			return false;
		}	
		
			
	}		

