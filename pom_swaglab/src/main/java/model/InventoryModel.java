package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryModel extends BaseModel {
	
	public InventoryModel(WebDriver d ) {
		super(d);
		
	}
	public WebElement getAddToCart() {
		WebElement e = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']"));
		return e;
		
	}
	public WebElement getPrice() {
		WebElement e = driver.findElement(By.xpath("//div[text()='9.99']"));
		return e;
		
	}
	public WebElement getCart() {
		WebElement e = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		return e;
		
	}
}
