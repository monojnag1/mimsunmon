package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CartModel;

public class CartPage extends CartModel {
	
	public CartPage(WebDriver d) {
		super(d);
		
	}
	public String getIteamPrice() {
		WebElement e= getPrice();
		String price = e.getText();
		return price;
	}
}
