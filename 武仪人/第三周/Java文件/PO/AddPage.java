package com.appium_plus.po.wyr;

import com.appium_plus.core.AndroidDriverEngine;
import lombok.Data;

/**
 * 添加页面
 */
@Data
public class AddPage extends BasePage{
    //添加按钮在底部的class和index
    private String addPageClassName = "class=android.widget.TextView";
    private int addPageIndex = 30;

    //物品名称输入框class和下标以及输入内容
    private String goodsNameEditTextClassName = "class=android.widget.EditText";
    private int goodsNameEditTextIndex = 3;
    private String goodsName = "苹果";

    //保质期输入框class和下标以及输入内容
    private String deadlineEditTextClassName = "class=android.widget.EditText";
    private int deadlineEditTextIndex = 4;
    private String deadline = "360";

    //确认添加按钮class以及下标
    private String addButtonClassName = "class=android.widget.TextView";
    private int addButtonIndex = 12;

    public void add(AndroidDriverEngine engine){
        engine.click(addPageClassName , addPageIndex);
        engine.clearAndType(goodsNameEditTextClassName , goodsNameEditTextIndex , goodsName);
        engine.clearAndType(deadlineEditTextClassName , deadlineEditTextIndex , deadline);
        engine.click(addButtonClassName , addButtonIndex);
    }
}
