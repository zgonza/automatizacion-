package co.com.compra.online.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")

//Aqui defino los xpath los Web Element
public class HomePageLogueo extends PageObject{

	//Me logueo en la pagina
		@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
		WebElement signInLogueo;
		
		@FindBy(xpath="//*[@id='email']")
		WebElement emailAddress;
		
		@FindBy(xpath="//*[@id='passwd']")
		WebElement password;

		@FindBy(xpath="//*[@id='SubmitLogin']/span")
		WebElement signIn;
		
		
		public void  ClicEnBotonSignInLogueo(){
			signInLogueo.click();
		}

		public void  IngresarCorreo(String userEmail ){
			emailAddress.sendKeys(userEmail);
		}

		public void  IngresarContrasena(String userPassword ){
			password.sendKeys(userPassword);
		}
		
		public void  ClicEnBotonSignIn(){
			signIn.click();
		}
}
