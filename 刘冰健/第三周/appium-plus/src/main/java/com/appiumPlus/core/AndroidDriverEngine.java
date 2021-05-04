package com.appiumPlus.core;

import com.appiumPlus.utils.LogUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

import io.appium.java_client.touch.WaitOptions;
import java.util.List;

public class AndroidDriverEngine {

    private AndroidDriver<AndroidElement> driver;

    private ElementFinder finder;

    private AndroidTouchAction action;

    /**
     * 构造方法
     * @param driver
     */
    public AndroidDriverEngine(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        this.finder = new ElementFinder(driver);
        this.action = new AndroidTouchAction(driver);
    }

    /**
     * 查找元素
     * @param locator 定位字符
     * @param idx 下标
     * @return
     */
    public AndroidElement findElementByIndex(String locator , int idx){
        return finder.findElement(locator , idx);
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
        AndroidElement element = finder.findElement(locator, idx);
        if (element != null) {
            element.clear();
            element.sendKeys(value);
        }
    }

    /**
     * 查找文本框，输入内容
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @param value   要输入的值
     */
    public void type(String locator, int idx , String value) {
        AndroidElement element = finder.findElement(locator , idx);
        if (element != null) {
            element.sendKeys(value);
        }
    }

    /**
     * 判断要查找的元素是否被选中
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return boolean为true表示被选中
     */
    public boolean isChecked(String locator , int idx) {
        AndroidElement element = finder.findElement(locator , idx);
        return element.isSelected();
    }


    /**
     * 点击要查找的元素
     *
     * @param locator 元素查找路径
     * @param idx 下标
     */
    public void click(String locator , int idx) {
        AndroidElement element = finder.findElement(locator , idx);
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
        AndroidElement element = finder.findElement(locator , idx);
        if (element != null) {

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
        AndroidElement element = finder.findElement(locator , idx);
        if (element != null) {
            return element.isDisplayed();
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
        return finder.findElement(locator , idx).getText().trim();
    }


    /**
     * 判断元素是否存在
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return boolean为true表示元素存在
     */
    public boolean isElementPresent(String locator , int idx) {
        AndroidElement element = null;
        try {
            element = finder.findElement(locator , idx);
        } catch (Exception e) {
            LogUtil.info(e.getMessage());
        }
        return element != null;
    }

    /**
     * 获取元素的value值
     *
     * @param locator 元素查找路径
     * @param idx 下标
     * @return value值，String类型
     */
    public String getValue(String locator , int idx) {
        return finder.findElement(locator , idx).getAttribute("value");
    }

    /**
     * 查找元素
     * @param locator 元素查找路径
     * @return
     */
    public AndroidElement findElement(String locator){
        return finder.findElement(locator);
    }


    /**李美儒
     * 向上滑动
     * @param driver
     * @param num 滑动次数
     */

    public static void swipeToUp(AndroidDriver driver,int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        PointOption pointOption1= PointOption.point(width/2, height*3/4);
        PointOption pointOption2= PointOption.point(width/2, height/4);
        for (int i = 0; i < num; i++) {
            TouchAction action1=new TouchAction(driver).press(pointOption1).waitAction().moveTo(pointOption2).release();
            action1.perform();
        }
    }

    /**李美儒
     * 滑动到页面底部
     * @param androidDriver
     * @param endString 是页面滑动到底部的信息提示
     */
    public void scrollToBottom(AndroidDriver androidDriver,String endString){
        boolean isSwipe = true;
        // 滑动屏幕直到页面底部
        while (isSwipe) {
            swipeToUp(androidDriver,1);//向上滑动屏幕
            String temp =androidDriver.getPageSource();
            if(temp.contains(endString))
                isSwipe = false;
        }
    }

    /**
     * 定义searchCount方法，来返回字符串出现的个数
     * @param shortStr 需要统计次数的字符串
     * @param longStr 目标字符串
     * @return
     */

    public static int searchCount(String shortStr,String longStr){
        //定义一个count来存放字符串出现的次数
        int count=0;
        //调用String类的indexOf（String str）方法，返回第一个相同字符串出现的下标
        while(longStr.indexOf(shortStr)!=-1){
            //如果存在相同的字符串则次数加1
            count++;
            //调用String类的substring（int beginIndex）方法，获得一个相同字符出现后的字符串
            longStr=longStr.substring(longStr.indexOf(shortStr))+shortStr.length();
        }
        //返回次数
        return count;

    }

    /**@author lbj
     *
     * 模拟键盘回车操作
     * @
     *
     */
    public void pressEnter(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
}

