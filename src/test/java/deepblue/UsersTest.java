package deepblue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class UsersTest {

	private WebDriver driver;
	RegisterUser registerUser;
	
	@Before
	public void setUp() throws Exception {
		registerUser= new RegisterUser(driver);
		driver= registerUser.chromeDriverConnection();
		registerUser.page("http://localhost:4200/login");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerUser.pruebaUser();
		Thread.sleep(2000);
		assertTrue(registerUser.validarTest());
	}
}