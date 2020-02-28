package deepblue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAlerts extends Base{
	
	By pageLocator = By.cssSelector("#comercio > div.col-3 > button");
	
	public RegisterAlerts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void pruebaAlerts () throws InterruptedException {
		
		if (isDisplayed(pageLocator)) {
			
		 System.out.println("La página sí existe");   
			}else {
		   System.out.println("No existe la página");   
    }
	}
	public boolean validarTest(){
		return isDisplayed(pageLocator);
	}
}
