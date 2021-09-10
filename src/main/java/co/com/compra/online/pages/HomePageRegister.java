package co.com.compra.online.pages;

//import java.util.List;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")

public class HomePageRegister extends PageObject{

	//Registrarme
	
		@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
		WebElement signInRegister;
		
		@FindBy(xpath="//*[@id='email_create']")
		WebElement emailAddressCreate;
		
		@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
		WebElement createAcount;
	
		@FindBy(xpath="//*[@id=\"id_gender2\"]")
		WebElement genero;
		
		@FindBy(xpath="//*[@id=\"customer_firstname\"]")
		WebElement firstName ;
		
		@FindBy(xpath="//*[@id=\"customer_lastname\"]")
		WebElement lasName;
		
		@FindBy(xpath="//*[@id=\"passwd\"]")
		WebElement passwordRegister;
	
		@FindBy(xpath="//*[@id=\"address1\"]")
		WebElement address ;
		
		@FindBy(xpath="//*[@id=\"city\"]")
		WebElement city;
		
		@FindBy(xpath="//*[@id=\"id_state\"]")
		WebElement state;	
		
		@FindBy(xpath="//*[@id=\"postcode\"]")
		WebElement postalCode ;
		
		@FindBy(xpath="//*[@id=\"phone_mobile\"]")
		WebElement mobilePhone;
		
		@FindBy(xpath="//*[@id=\"alias\"]")
		WebElement addressAlias;
	
		@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
		WebElement register;
		
		@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
		WebElement usuarioLogueado ;
		
		
		public void  ClicEnBotonsignInRegister(){
			signInRegister.click();
		}

		public void  crearCorreo(String userEmail ){
			emailAddressCreate.sendKeys(userEmail);
		}

		public void  ClicEnBotoncreateAcount(){
			createAcount.click();
		}
		
		public void  ClicEnBotongenero(){
			genero.click();
		}
		
	
		public void  IngresarNombre(String userName ){
			firstName.sendKeys(userName);
		}
		
		public void  IngresarApellidos(String userLastname ){
			lasName.sendKeys(userLastname);
		}
		
		public void  IngresarContrasena(String userPassword ){
			passwordRegister.sendKeys(userPassword);
		}	
		
		public void  IngresarDireccion(String userAddress ){
			address.sendKeys(userAddress);		
		}
		
		public void  IngresarCiudad(String userCity ){
			city.sendKeys(userCity);		
		}
		
		public void  IngresarEstado(String userState){
			Select estado = new Select(state);
			estado.selectByVisibleText(userState);
		}
		
		public void  IngresarCodigoPostal(String userPostal ){
			postalCode.sendKeys(userPostal);		
		}	
		
		public void  IngresarCelular(String userMobile ){
			mobilePhone.sendKeys(userMobile);		
		}
		public void  IngresarAliasDireccion(String userAliasAddress ){
			addressAlias.sendKeys(userAliasAddress);		
		}
		
		public void  ClicEnBotonRegister(){
			register.click();
		}
	
		public String ObtenerUsuarioLogueado(){
			return usuarioLogueado.getText();
		}
}
