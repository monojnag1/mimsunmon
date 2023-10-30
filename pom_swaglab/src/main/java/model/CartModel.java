package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartModel extends BaseModel {
	public CartModel(WebDriver d) {
		super (d);
		
	}
	public WebElement getPrice() {
		WebElement e = driver.findElement(By.xpath("//div[text()='9.99']"));
		return e;
	}

}
