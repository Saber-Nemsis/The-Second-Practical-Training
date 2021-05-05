package com.appium_plus.core;

import com.appium_plus.utils.LogUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

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
        return this.findAllElement(locator).get(idx);
    }

    public List<AndroidElement> findAllElement(String locator){
        String target = locator.trim();
        if (target.startsWith("id=")) {
            locator = locator.substring("id=".length());
            return driver.findElementsById(locator);
        } else if (target.startsWith("class=")) {
            locator = locator.substring("class=".length());
            return driver.findElementsByClassName(locator);
        }  else if (target.startsWith("link=")) {
            locator = locator.substring("link=".length());
            return driver.findElementsByLinkText(locator);
        }  else if (target.startsWith("css=")) {
            locator = locator.substring("css=".length());
            return driver.findElementsByCssSelector(locator);
        } else if (target.startsWith("xpath=")) {
            locator = locator.substring("xpath=".length());
            return driver.findElementsByXPath(locator);
        } else if (target.startsWith("tag=")) {
            locator = locator.substring("tag=".length());
            return driver.findElementsByTagName(locator);
        } else {
            LogUtil.warn(locator + "can't find element by prefix.");
            return null;
        }
    }
}
