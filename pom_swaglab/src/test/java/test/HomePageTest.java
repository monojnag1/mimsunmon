package test;

import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void homepagetest() {
		HomePage hp = new HomePage(driver);
		
		hp.typeusername("standard_user");
		hp.typepassword("secret_sauce");
		hp.clickonlogin();
}
}