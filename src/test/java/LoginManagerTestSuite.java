import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import login.LoginManager;
import login.LoginType;

public class LoginManagerTestSuite {

	@Test
	public void testCaseOne() {
		LoginManager loginRequest = new LoginManager();
		assertEquals(LoginType.SUCCESS, loginRequest.login("KATHRYNjaneway", "coffeefiend"));
	}

	@Test
	public void testCaseTwo() {
		LoginManager loginRequest = new LoginManager();
		assertEquals(LoginType.DENIED, loginRequest.login("", ""));
	}

	@Test
	public void testCaseThree() {
		LoginManager loginRequest = new LoginManager();
		assertEquals(LoginType.DENIED, loginRequest.login("KATHRYN", "coffeefiend"));
	}

	@Test
	public void testCaseFour() {
		LoginManager loginRequest = new LoginManager();
		assertEquals(LoginType.GUEST_ACCESS, loginRequest.login("neelix57", "leolaroot"));
	}

	@Test
	public void testCaseFive() {
		LoginManager loginRequest = new LoginManager();
		assertEquals(LoginType.TRY_AGAIN, loginRequest.login("neelix57", "coffeefiend"));
	}
}
