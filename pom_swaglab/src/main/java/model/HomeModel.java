package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
	
	public  HomeModel(WebDriver d) {
		super(d);
	}
	 public WebElement getUeserName() {
		 WebElement e = driver.findElement(By.xpath("//input[@name='user-name']"));
		 return e;
		 
	 }
	 public WebElement getPassword() {
		 WebElement e = driver.findElement(By.xpath("//input[@name='password']"));
		 return e;
		 
	 }
	 public WebElement getLogin() {
		 WebElement e = driver.findElement(By.xpath("//input[@name='login-button']"));
		 return e;
		 
	 }
	
	
	
}
