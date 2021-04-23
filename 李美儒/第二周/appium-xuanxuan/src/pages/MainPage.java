package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class MainPage {
	//构造方法
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//1.添加
	//页面对象
	public MainPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}

	
	
}
