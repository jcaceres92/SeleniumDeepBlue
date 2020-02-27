package deepblue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AlertsTest {
	
	private WebDriver driver;
	RegisterAlerts registerAlerts;
	
	@Before
	public void setUp() throws Exception {
		registerAlerts= new RegisterAlerts(driver);
		driver= registerAlerts.chromeDriverConnection();
		registerAlerts.page("http://localhost:4200/");
	}	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerAlerts.pruebaAlerts();
		Thread.sleep(2000);
		assertTrue(registerAlerts.validarTest());
	}
}
