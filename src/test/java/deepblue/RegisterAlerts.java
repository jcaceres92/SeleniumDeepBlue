package deepblue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAlerts extends Base{
	
	By pageLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/img");
	By userLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[1]");
	By passLocator =By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[2]");
	By btnLoginLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/div/button");
	By btnAlertsLocator = By.xpath("html/body/app-root/app-home/app-header/div[1]/ul/li[2]/a");
	By nameAlertLocator = By.xpath("/html/body/app-root/app-alerts/app-header/div[2]/div/div[1]/input");
	By btnCreateAlertLocator = By.xpath("/html/body/app-root/app-alerts/app-header/div[2]/div/div[1]/button");
	By selectAlertLocator = By.cssSelector("body > div > div > div.swal2-content > select");
	By btnOkPopup = By.xpath("/html/body/div/div/div[3]/button[1]");
	By btnYesPopup = By.xpath("/html/body/div/div/div[3]/button[1]");
	By btnMessageOkLocator =By.xpath("/html/body/div/div/div[3]/button[1]");
	
	
	public RegisterAlerts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void pruebaAlerts () throws InterruptedException {
		
		if (isDisplayed(pageLocator)) {
			envioDatos("drpv",userLocator);
			envioDatos("drpv123",passLocator);
			click(btnLoginLocator);
			Thread.sleep(2000);
			click(btnAlertsLocator); 
			Thread.sleep(1000);
			envioDatos("AlertaPrueba",nameAlertLocator);
			click(btnCreateAlertLocator);
			selector(selectAlertLocator);
			click(btnOkPopup);
			Thread.sleep(1000);
			click(btnYesPopup);
			click(btnMessageOkLocator);
			}else {
		   System.out.println("No existe la página");   
    }
	}
	public boolean validarTest(){
		return isDisplayed(btnMessageOkLocator);
	}
}