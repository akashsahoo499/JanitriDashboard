package applicationlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 private WebDriver driver;
 
 private By userIdField=By.id("formEmail");
 private By passwordField=By.id("formPassword");
 private By loginButton=By.xpath("//button[normalize-space()='Log In']");
 private By eyeIcon=By.xpath("//img[@alt='Password Not Visible']");
 private By errorMessage=By.cssSelector(".invalid-credential-div");
 
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 public void enterUserId(String userId)
 {
	 driver.findElement(userIdField).sendKeys(userId);
 }
 public void enterPassword(String password)
 {
	 driver.findElement(passwordField).sendKeys(password);
 }
 public void clickLogin()
 {
	 driver.findElement(loginButton).click();
 }
 public void togglePasswordVisibility()
 {
	 driver.findElement(eyeIcon).click();
 }
 public String getErrorMessage()
 {
	 return driver.findElement(errorMessage).getText();
 }
 public boolean isLoginButtonEnabled()
 {
	 return driver.findElement(loginButton).isEnabled();
 }
}
