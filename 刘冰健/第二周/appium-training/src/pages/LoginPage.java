package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import utils.BaseAction;

public class LoginPage {

    AndroidDriver<AndroidElement> driver;
    BaseAction action;

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        this.action = new BaseAction(driver);
    }
    //获取服务器地址输入框
    public AndroidElement getServerInput(){
        return driver.findElementsByClassName("android.widget.EditText").get(0);
    }
    //获取用户名输入框
    public AndroidElement getUsernameInput(){
        return driver.findElementsByClassName("android.widget.EditText").get(1);
    }
    //获取密码输入框
    public AndroidElement getPwdInput(){
        return driver.findElementsByClassName("android.widget.EditText").get(2);
    }

    public AndroidElement getLoginButton() {
		return driver.findElement(By.xpath("//*[@content-desc='登录']"));
	}
    //登录
    public void login(String serverUrl, String username, String pwd) throws InterruptedException{
//    	action.click(getServerInput());
//    	Thread.sleep(1000);
//        action.type(getServerInput(),serverUrl);
//        Thread.sleep(2000);
//        driver.executeScript("arguments[0].input("+serverUrl+")", getServerInput());
        Thread.sleep(2000);
        action.click(getUsernameInput());
        action.type(getPwdInput(),pwd);
        Thread.sleep(2000);
        action.click(getLoginButton());
    }
}
