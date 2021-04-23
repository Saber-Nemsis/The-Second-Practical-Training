package pages;


import java.util.List;

import org.openqa.selenium.By;




import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;
import utils.BaseAction;

public class LoginPage {

	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	public List<AndroidElement> get_all_editTexts(){
		List<AndroidElement> editTexts=driver.findElementsByClassName("android.widget.EditText");
		return editTexts;
	}
	
	//获取服务器元素
	public AndroidElement edit_serverConfig() {
		return get_all_editTexts().get(0);
	}
	
	//获取用户名元素
	public AndroidElement edit_username() {
		return get_all_editTexts().get(1);
	}
	//获取密码元素
	public AndroidElement edit_password() {
		return get_all_editTexts().get(2);
	}
	
	
	public AndroidElement btn_login() {
		return driver.findElement(By.xpath("//*[@content-desc='登录']"));
	}
	
	public MainPage login_success(String serverConfig,String username,String password) throws InterruptedException {
		action.click(edit_serverConfig());
		Thread.sleep(2000);
		action.type(edit_serverConfig(), serverConfig);
		action.click(edit_username());
		Thread.sleep(2000);
		action.type(edit_username(),username);
		action.click(edit_password());
		Thread.sleep(2000);
		action.type(edit_password(), password);
		action.click(btn_login());
		return new MainPage(driver);
		
	}
	public String login_fail(String serverConfig,String username,String password) {
		action.type(edit_serverConfig(), serverConfig);
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_login());
		return action.getToast();
	}
	
}
