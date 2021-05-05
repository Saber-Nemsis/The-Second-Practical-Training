package com.appium_plus.core;

import com.appium_plus.utils.LogUtil;
import com.appium_plus.utils.ReadPropUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static final String PLATFORM_NAME = "platformName";
    private static final String AUTOMATION_NAME = "automationName";
    private static final String DEVICE_NAME = "deviceName";
    private static final String PLATFORM_VERSION = "platformVersion";
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_ACTIVITY = "appActivity";
    /**
     * 封装了许多appium原生方法，用来执行各种页面操作
     */
    protected AndroidDriverEngine engine;

    /**
     * 驱动
     */
    private AndroidDriver<AndroidElement> driver;

    /**
     * 在所有测试类执行之前执行，实例化driver
     * 创建AndroidDriverEngine对象
     */
    @BeforeClass
    public void doBeforeClass() {
        this.driver = this.newAndroidDriver();
        this.engine = new AndroidDriverEngine(driver);
    }

    /**
     * 在测试类执行结束之后执行，回收driver资源
     */
    @AfterClass
    public void doAfterClass() {
        if (this.driver != null) {
            //this.driver.quit();
        }
        LogUtil.info("Quitted APP");
    }

    /**
     *
     * @return 驱动对象
     */
    private AndroidDriver<AndroidElement> newAndroidDriver() {

        try {
            URL url = new URL(ReadPropUtil.getPropertyValue("url"));

            DesiredCapabilities desiredCaps = new DesiredCapabilities();
            //设置参数
            desiredCaps.setCapability(PLATFORM_NAME , ReadPropUtil.getPropertyValue(PLATFORM_NAME));
            desiredCaps.setCapability(AUTOMATION_NAME , ReadPropUtil.getPropertyValue(AUTOMATION_NAME));
            desiredCaps.setCapability(DEVICE_NAME , ReadPropUtil.getPropertyValue(DEVICE_NAME));
            desiredCaps.setCapability(PLATFORM_VERSION , ReadPropUtil.getPropertyValue(PLATFORM_VERSION));
            desiredCaps.setCapability(APP_PACKAGE , ReadPropUtil.getPropertyValue(APP_PACKAGE));
            desiredCaps.setCapability(APP_ACTIVITY , ReadPropUtil.getPropertyValue(APP_ACTIVITY));

            this.driver = new AndroidDriver<>(url , desiredCaps);
            driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    /**
     * 获取该类或子类的driver
     *
     * @return 驱动
     */
    protected AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

}
