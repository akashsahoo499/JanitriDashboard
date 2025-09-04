package apptest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import applicationlayer.LoginPage;
import config.BaseTest;

public class LoginTests extends BaseTest {
@Test
public void testLoginButtonDisableWhenFieldsEmpty()
{
	LoginPage loginpage=new LoginPage(driver);
	/*Assert.assertFalse(loginpage.isLoginButtonEnabled(),
	"Login button should be disabled when fields are empty");*/
}
@Test
public void testInvaqlidLoginShowsErrorMsg()
{
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserId("wrongUser");
	loginpage.enterPassword("wrongPass");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	loginpage.clickLogin();
	String errorMsg=loginpage.getErrorMessage();
	System.out.println("Error: " +errorMsg);
}
@Test 
public void testPasswordMaskedButton()
{
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterPassword("test123");
	loginpage.togglePasswordVisibility();
}
}
