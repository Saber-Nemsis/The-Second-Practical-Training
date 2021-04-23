package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;

public class LoginPageTest extends BaseDriver{

	public LoginPage loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	
	@Test
	public void test_login_success() throws InterruptedException {
		loginPage.login_success("http://10.7.90.213:11443", "lmr1","123456");
		System.out.println(driver.currentActivity());
		assertEquals(driver.currentActivity(), ".MainActivity");
	}
	
	@Test
	public void test_login_fail() {
		String message=loginPage.login_fail("http://10.7.90.213:11443", "lmr1","12345678");
		System.out.println(message);
		assertEquals(message, "暂时无法登录到服务器。");
	}
	
}
