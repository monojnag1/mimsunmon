package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	
	public HomePage(WebDriver d) {
		super(d);
	}
	
	public void typeusername(String name) {
		WebElement e = getUeserName();
		e.sendKeys(name);
	}
	public void typepassword(String name) {
		WebElement e = getPassword();
		e.sendKeys(name);
	}
	public void clickonlogin() {
		WebElement e = getLogin();
		e.click();
	}
}
