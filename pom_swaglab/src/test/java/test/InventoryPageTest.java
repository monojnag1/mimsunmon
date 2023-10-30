package test;

import org.testng.annotations.Test;

import page.HomePage;
import page.InventoryPage;

public class InventoryPageTest  extends BaseTest{
	
	@Test
	public void inventorypagetest() {
		HomePage hp = new HomePage(driver);

		hp.typeusername("standard_user");
		hp.typepassword("secret_sauce");
		hp.clickonlogin();
		
		InventoryPage ip = new InventoryPage(driver);
		ip.clickAddToCart();
		String price = ip.getPriceoftheIteam();
		System.out.println(price);
		ip.clickCart();
	}
}
