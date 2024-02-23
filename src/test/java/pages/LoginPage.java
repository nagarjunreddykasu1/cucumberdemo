package pages;

import org.openqa.selenium.By;

public class LoginPage {
	
	public final By username=By.name("username");
	public final By password=By.name("password");
	public final By btnLogin=By.xpath("//button[@type='submit']");
	public final By errorUserName=By.xpath("(//span[contains(@class,'oxd-input-field-error-message')])[1]");
	public final By errorPassword=By.xpath("(//span[contains(@class,'oxd-input-field-error-message')])[2]");
	public final By errorUserPassword=By.xpath("//div[contains(@class,'oxd-alert-content--error')]/p");

}
