package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.InventoryModel;

public class InventoryPage extends InventoryModel {
	public InventoryPage(WebDriver d ) {
		super(d);
	}
	public void clickAddToCart() {
		WebElement e = getAddToCart();
		e.click();
	}
	public String getPriceoftheIteam() {
		WebElement e = getPrice();
		String price =e.getText();
		return price;
		
	}
	public void clickCart() {
		WebElement e = getCart();
		e.click();
	}

}
