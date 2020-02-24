package deepblue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUser extends Base {
	
	By pageLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/img");
	By userLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[1]");
	By passLocator =By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[2]");
	By btnLoginLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/div/button");
	By btnUsersLocator = By.xpath("html/body/app-root/app-home/app-header/div[1]/ul/li[5]/a");
	By btnAddUsersLocator = By.xpath("/html/body/app-root/app-users/app-header/div[2]/div/div[1]/button[2]");
	By usernameLocator = By.xpath("//*[@id=\"username\"]");
	By nameLocator = By.xpath("//*[@id=\"name\"]");
	By emailLocator = By.xpath("//*[@id=\"email\"]");
	By lastnameLocator = By.xpath("//*[@id=\"Lastname\"]");
	By passUsersLocator = By.xpath("//*[@id=\"password\"]");
	By phoneLocator = By.xpath("//*[@id=\"phone\"]");
	By btnSubmitLocator =By.xpath("/html/body/app-root/app-users/app-header/div[2]/div/div[2]/div/button");
	By checkUsersActiveLocator = By.xpath("//*[@id=\"inactivo\"]");
	By btnYesPopupLocator = By.cssSelector("body > div > div > div.swal2-actions > button.swal2-confirm.swal2-styled");
	By messageLocator = By.xpath("//*[@id=\"swal2-content\"]");
	By btnOkMessageLocator = By.xpath("/html/body/div/div/div[3]/button[1]");
	
	public RegisterUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void pruebaUser () throws InterruptedException {
		
		if (isDisplayed(pageLocator)) {
			envioDatos("drpv",userLocator);
			envioDatos("drpv123",passLocator);
			 click(btnLoginLocator);
			 Thread.sleep(2000);
			 click(btnUsersLocator);
			 Thread.sleep(1000);
			 click(btnAddUsersLocator);
			 Thread.sleep(1000);;
			 envioDatos("Yoselyn",usernameLocator);
			 envioDatos("Yoselyn",nameLocator);
			 envioDatos("valestyoselyn@gmail.com",emailLocator);
			 envioDatos("Valest",lastnameLocator);
			 envioDatos("123456",passUsersLocator);
			 envioDatos("300000000",phoneLocator);
			 click(checkUsersActiveLocator);
			 click(btnSubmitLocator);			 
			 Thread.sleep(2000);
			 click(btnYesPopupLocator);
			 click(btnOkMessageLocator);
		}else {
	   System.out.println("No existe la página");
        }
	}
	public boolean validarTest(){
		return isDisplayed(btnOkMessageLocator);
	}
}
