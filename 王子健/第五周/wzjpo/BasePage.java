package com.uiautomator_plus.po.wzj;

import com.uiautomator_plus.core.Engine;

/**
 * 不是某一个页面，只是封装一些公共方法
 */
public class BasePage {

    /**
     * 子类公共的点击方法
     * @param engine 驱动
     * @param locator 定位字符串
     * @param index 下标
     */
    public void click(Engine engine, String locator , int index){
        engine.click(locator , index);
    }

    /**
     * 子类公共的输入方法
     * @param engine 驱动
     * @param locator 定位字符串
     * @param index 下标
     * @param value 输入内容
     */
    public void clearAndType(Engine engine , String locator , int index , String value){
        engine.clearAndType(locator , index , value);
    }
}
