package deepblue;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class CustomerTest {
	private WebDriver driver;
	RegisterCustomer registerCustomer;
	
	@Before
	public void setUp() throws Exception {
		registerCustomer= new RegisterCustomer(driver);
		driver= registerCustomer.chromeDriverConnection();
		registerCustomer.page("http://localhost:4200/login");
	}	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerCustomer.pruebaAlerts();
		Thread.sleep(2000);
		assertTrue(registerCustomer.validarTest());
	}
}

