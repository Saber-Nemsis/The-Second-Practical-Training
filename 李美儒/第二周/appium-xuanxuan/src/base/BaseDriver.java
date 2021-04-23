package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseDriver {

	protected AndroidDriver<AndroidElement> driver;
	@BeforeClass
	public void startUp() throws MalformedURLException {
		//服务器的地址，服务器的访问端口是4723
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		//连接夜神模拟器
		capabilities.setCapability("deviceName", "127.0.0.1:62001");
		capabilities.setCapability("appPackage", "com.cnezsoft.xxm");
		capabilities.setCapability("appActivity", "com.cnezsoft.xxm.MainActivity");
		//不重置，再打开原来的数据还有，而不至于原来的操作无效，再打开是空的
		capabilities.setCapability("noReset", true);
		driver=new AndroidDriver<AndroidElement>(url,capabilities);
		//第二个参数timeUint可以是秒也可以是毫秒
		//有这个就不用设置Thread.sleep（）
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void quit() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
