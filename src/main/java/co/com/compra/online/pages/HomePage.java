
package co.com.compra.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//la URL por defecto a la que se va a conectar
@DefaultUrl("http://automationpractice.com/index.php")

//Aqui defino los xpath los Web Element

public class HomePage extends PageObject {
	
	//selecciono la categoría de summer dresses
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dresses;
	
	@FindBy(xpath="//*[@id='categories_block_left']/div/ul/li[3]/a")
	WebElement summerDresses;

	//selecciono el vestido mas barato
	
	//java.util.List <WebElement> hace que se obtengan todos los elementos que contiene el xpath
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[2]/div[1]/span[1]")
	java.util.List <WebElement> preciosVestidos;// ESTE ES EL ARREGLO QUE CONTIENE TODOS LOS VESTIDOS
	
	
	@FindBy(xpath="//*[@id='center_column']/ul/li")
	java.util.List <WebElement> vestidos;
	
	WebElement addToCart;
	
	public String referenciaTexto;
	
	//compra del vestido
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement proceedToCheckOut;
	
	@FindBy(xpath="//*[@id='center_column']/p[2]/a[1]/span")
	WebElement summary;
	
	@FindBy(xpath="//*[@id='center_column']/form/p/button/span")
	WebElement address;
	
	@FindBy(xpath="//*[@id='form']/div/p[2]/label")
	WebElement shippingClic;
	
	@FindBy(xpath="//*[@id='form']/p/button/span")
	WebElement shipping;
	
	@FindBy(xpath="//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	WebElement payment;
	
	@FindBy(xpath="//*[@id='cart_navigation']/button/span")
	WebElement confirm;
	
	//la referencia
	@FindBy(xpath="//*[@id='center_column']/div")
	WebElement reference;
	
   //validar Mensaje de compra exitosa	Assert PREGUNTAR A DEY
	@FindBy(xpath="//*[@id='center_column']/p[1]")
	WebElement confirmattionMessage;// Este es el mensaje que sale "Your order on My Store is complete."
	
	
	
	// Este es el metodo de cada Web Element	
	
	public void  ClicEnBotonDresses(){
		dresses.click();
	}
	public void  ClicEnBotonSummerDresses(){
		summerDresses.click();
	}

	
	public void  PrintListaVestidos(){ //se busca el menor precio de vestido y se almacena el boton addToCard del vestido que tiene este precio
		
		System.out.println(preciosVestidos.get(0).getText());//se puede borrar era para imprimir
		System.out.println(preciosVestidos.get(1).getText());
		System.out.println(preciosVestidos.get(2).getText());
		
		float preciomenor=0; //almacenamos el precio menor
		
		for (int i=0; i<preciosVestidos.size(); i++)	//recorremos los precios de los vestidos
		{
			if(i==0){ //esta linea es para almacenar el primer valor del ciclo en precio menor
				preciomenor=Float.parseFloat(preciosVestidos.get(i).getText().replace("$", ""));
			}
			float Precio = Float.parseFloat(preciosVestidos.get(i).getText().replace("$", "")) ;//convierte el precio del vestido en float
			if (Precio<preciomenor){
				preciomenor=Precio;//almaceno valor si es menor a los anteriores
			}
		}
		System.out.println(preciomenor);//se puede borrar
		
		for (int i=0; i<vestidos.size();i++){//es para recorrer los LI(vestidos)
			WebElement precioVest = vestidos.get(i).findElement(By.xpath("div/div[2]/div[1]/span[1]"));//Este WebElement valor tipo texto del vestido i
			float precioVestFloat= Float.parseFloat(precioVest.getText().replace("$","")); //valor tipo float
			if (precioVestFloat==preciomenor){ //mirar si es el mas barato
				addToCart = vestidos.get(i).findElement(By.xpath("div/div[2]/div[2]/a[1]/span"));
				break;//rompa el ciclo cuando encuentre el vestido mas barato
			}
		}
	}
	
	public void  ClicEnBotonAddToCart(){
		addToCart.click();
	}
	
	public void  ClicEnBotonProceedToCheckOut(){
		proceedToCheckOut.click();
	}
	
	public void  ClicEnBotonSummary(){
		summary.click();
	}
	
	public void  ClicEnBotonAddress(){
		address.click();	
	}
	
	public void  ClicEnBotonShippingClic(){
		shippingClic.click();	
	}
	
	public void  ClicEnBotonShipping(){
		shipping.click();	
	}
	
	public void  ClicEnBotonPayment(){
		payment.click();	
	}
	
	public void  ClicEnBotonConfirm(){
		confirm.click();	
	}
	
	// ASSERT
	public String getConfirmattionMessage() {
		return confirmattionMessage.getText();//retorna un string para el assert
	}
	
	public void  GuardarReferencia( ){
		referenciaTexto = reference.getText();
		
	}
	
}
	

