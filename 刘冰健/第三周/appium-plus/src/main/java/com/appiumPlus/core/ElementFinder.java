package com.appiumPlus.core;

import com.appiumPlus.utils.LogUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import org.openqa.selenium.By;

public class ElementFinder {

    private AndroidDriver<AndroidElement> driver;

    /**
     * 构造方法
     * @param driver
     */
    public ElementFinder(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    /**
     * 通过findElementByPrefix进一步解析target
     *
     * @param target 元素定位字符串
     * @return 找到的元素
     */
    public AndroidElement findElement(String target , int idx){
        AndroidElement element = null;
        try {
            element = findElementByIndexAndPrefix(target , idx);
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.error(e.toString());
        }
        return element;
    }



    /**
     * 通过前缀查找元素
     *
     * @param locator 通过前缀找到对应的查找方法
     * @return 找到的元素
     */
    public AndroidElement findElementByIndexAndPrefix(String locator , int idx){
        String target = locator.trim();
        if (target.startsWith("id=")) {
            locator = locator.substring("id=".length());
            return driver.findElementsById(locator).get(idx);
        } else if (target.startsWith("class=")) {
            locator = locator.substring("class=".length());
            return driver.findElementsByClassName(locator).get(idx);
        }  else if (target.startsWith("link=")) {
            locator = locator.substring("link=".length());
            return driver.findElementsByLinkText(locator).get(idx);
        }  else if (target.startsWith("css=")) {
            locator = locator.substring("css=".length());
            return driver.findElementsByCssSelector(locator).get(idx);
        } else if (target.startsWith("xpath=")) {
            locator = locator.substring("xpath=".length());
            return driver.findElementsByXPath(locator).get(idx);
        } else if (target.startsWith("tag=")) {
            locator = locator.substring("tag=".length());
            return driver.findElementsByTagName(locator).get(idx);
        } else {
            LogUtil.warn(locator + "can't find element by prefix.");
            return null;
        }
    }


    public AndroidElement findElement(String target){
        AndroidElement element = null;
        try {
            element = findElementByIndexAndPrefix(target);
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.error(e.toString());
        }
        return element;
    }


    /**
     * 通过前缀查找元素
     *
     * @param locator 通过前缀找到对应的查找方法
     * @return 找到的元素
     */
    public AndroidElement findElementByIndexAndPrefix(String locator){
        String target = locator.trim();
        if (target.startsWith("id=")) {
            locator = locator.substring("id=".length());
            return driver.findElementById(locator);
        } else if (target.startsWith("class=")) {
            locator = locator.substring("class=".length());
            return driver.findElementByClassName(locator);
        }  else if (target.startsWith("link=")) {
            locator = locator.substring("link=".length());
            return driver.findElementByLinkText(locator);
        }  else if (target.startsWith("css=")) {
            locator = locator.substring("css=".length());
            return driver.findElementByCssSelector(locator);
        } else if (target.startsWith("xpath=")) {
            locator = locator.substring("xpath=".length());
            return driver.findElementByXPath(locator);
        } else if (target.startsWith("tag=")) {
            locator = locator.substring("tag=".length());
            return driver.findElementByTagName(locator);
        } else {
            LogUtil.warn(locator + "can't find element by prefix.");
            return null;
        }
    }
}
