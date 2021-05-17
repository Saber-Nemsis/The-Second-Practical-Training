package com.uiautomator_plus.core;

import android.util.Log;

import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import java.util.List;

public class Engine {

    private UiDevice device;

    private ElementFinder finder;

    /**
     * 构造方法
     * @param device
     */
    public Engine(UiDevice device) {
        this.device = device;
        this.finder = new ElementFinder(this.device);
    }

    public UiObject2 findElement(String loactor , int idx){
        return findElements(loactor).get(idx);
    }

    public List<UiObject2> findElements(String loactor){
        return finder.findElements(loactor);
    }

    /**
     * 线程等待几秒
     *
     * @param time 秒
     */
    public void pause(long time) {
        if (time <= 0) {
            return;
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 找到文本框，清空文本框内容，输入执行内容
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @param value   要输入的内容
     */
    public void clearAndType(String locator, int idx , String value) {
        UiObject2 element = findElement(locator, idx);
        element.clear();
        element.setText(value);
    }

    /**
     * 判断要查找的元素是否被选中
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return boolean为true表示被选中
     */
    public boolean isChecked(String locator , int idx) {
        UiObject2 element = findElement(locator, idx);
        return element.isSelected();
    }

    /**
     * 点击要查找的元素
     *
     * @param locator 元素查找路径
     * @param idx 下标
     */
    public void click(String locator , int idx) {
        UiObject2 element = findElement(locator, idx);
        if (element != null) {
            element.click();
            this.pause(3000);
        }
    }

    /**
     * 长按要查找的元素
     *
     * @param locator 元素查找路径
     * @param idx 下标
     */
    public void clickLonger(String locator , int idx) {
        UiObject2 element = findElement(locator, idx);
        if (element != null) {
            element.longClick();
        }
    }

    /**
     * 判断要查找的元素是否显示
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return boolean为true表示已显示
     */
    public boolean isDisplayed(String locator , int idx) {
        UiObject2 element = findElement(locator, idx);
        if (element != null) {
            return element != null;
        }
        return false;
    }

    /**
     * 获取要查找的元素的文本（去除前后括号）
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return 元素text
     */
    public String getText(String locator , int idx) {
        return findElement(locator, idx).getText().trim();
    }

    /**
     * 判断元素是否存在
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return boolean为true表示元素存在
     */
    public boolean isElementPresent(String locator , int idx) {
        UiObject2 element = null;
        try {
            element = findElement(locator, idx);
        } catch (Exception e) {
            Log.i("error" , e.getMessage());
        }
        return element != null;
    }


}
