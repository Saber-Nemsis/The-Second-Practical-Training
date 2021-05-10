package com.uiautomator_plus.core;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import java.util.List;

public class ElementFinder {

    private UiDevice device;

    /**
     * 构造方法
     * @param device
     */
    public ElementFinder(UiDevice device) {
        this.device = device;
    }


    /**
     * 定位一组元素
     * @param locator 定位字符串
     * @return
     */
    public List<UiObject2> findElements(String locator){
        String target = locator.trim();
        if (target.startsWith("text=")) {
            locator = locator.substring("text=".length());
            return device.findObjects(By.text(locator));
        } else if(target.startsWith("class=")){
            locator = locator.substring("class=".length());
            return device.findObjects(By.clazz(locator));
        } else if(target.startsWith("xpath=")){
            locator = locator.substring("xpath".length());
            return null;
        }
        return null;
    }
}
