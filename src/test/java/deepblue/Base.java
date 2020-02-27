package deepblue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	private WebDriver driver;
	
	public Base (WebDriver driver){
			
		this.driver= driver;
	}
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				return driver;	
     }
	public void envioDatos (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	 }
	public void click (By locator) {
		driver.findElement(locator).click();
	}
	public Boolean  isDisplayed(By locator){
			try {
			return driver.findElement(locator).isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e){
			return false;
			}	
	}
	public void selector(By locator) {
		Select lista = new Select (driver.findElement(locator));
		lista.selectByIndex(2);
	}
    public void page(String url) {
			driver.get(url);
	}

}
