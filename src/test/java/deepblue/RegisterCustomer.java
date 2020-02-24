package deepblue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterCustomer extends Base {
	
	By pageLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/img");
	By userLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[1]");
	By passLocator =By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/input[2]");
	By btnLoginLocator = By.xpath("/html/body/app-root/app-login/section/div[2]/div/div/form/div/button");
	By btnCustomerLocator = By.xpath("/html/body/app-root/app-home/app-header/div[1]/ul/li[3]/a");
	By selectPortLocator = By.xpath("//*[@formcontrolname=\"port\"]");
	By selectVesselLocator = By.xpath("//*[@formcontrolname=\"vessel\"]");
	By selectTypeCustomerLocator = By.xpath("//*[@formcontrolname=\"customertype\"]");
	By selectNameCustomerLocator = By.xpath("//*[@formcontrolname=\"customername\"]");
	By btnCreateCustomerLocator = By.xpath("/html/body/app-root/app-customers/app-header/div[2]/div/button");
	By btnYesPopupLocator = By.xpath("/html/body/div/div/div[3]/button[1]");
	By btnMessageOkLocator = By.xpath("/html/body/div/div/div[3]/button[1]");
	
	
public RegisterCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void pruebaAlerts () throws InterruptedException {
		
		if (isDisplayed(pageLocator)) {
			envioDatos("drpv",userLocator);
			envioDatos("drpv123",passLocator);
			click(btnLoginLocator);
			Thread.sleep(3000);
			click(btnCustomerLocator);
			Thread.sleep(2000);
			selector(selectPortLocator);
			Thread.sleep(1000);
			selector(selectVesselLocator);
			selector(selectTypeCustomerLocator);
			selector(selectNameCustomerLocator);
			click( btnCreateCustomerLocator );
			Thread.sleep(1000);
			click( btnYesPopupLocator);
			Thread.sleep(5000);
		}else {
			   System.out.println("No existe la página");
		        }
			}
			public boolean validarTest(){
				return isDisplayed(btnMessageOkLocator);
			}
}