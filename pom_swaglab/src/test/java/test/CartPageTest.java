package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;
import page.CartPage;
import page.HomePage;
import page.InventoryPage;

public class CartPageTest extends BaseTest {
	
	@Test(dataProvider="swaglab")
	public void cartpagetest(String username,String password) {
		HomePage hp = new HomePage(driver);

		hp.typeusername(username);
		hp.typepassword(password);
		hp.clickonlogin();
		
		InventoryPage ip = new InventoryPage(driver);
		
		ip.clickAddToCart();
		String exp_price = ip.getPriceoftheIteam();
		ip.clickCart();
		
		CartPage cp = new CartPage(driver);
		String act_price =cp.getIteamPrice();
		
		Assert.assertEquals(act_price, exp_price);
	}
	@DataProvider(name="swaglab")
	public Object[][] getdata() throws IOException{
		Object[][]t;
		
		String filename ="data/Book3.xlsx";
		String sheetname="Sheet1";
		
		ExcelReader er = new ExcelReader(filename,sheetname);
		
		t= er.excelToArry();
		
		return t;
	}
}
