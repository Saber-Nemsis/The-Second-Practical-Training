package com.uiautomator_plus.po.wzj;

import com.uiautomator_plus.core.Engine;


/**
 * 添加页面
 */
public class AddPage extends BasePage {
    //添加按钮在底部的class和index
    private String addPageClassName = "text=添加";
    private int addPageIndex = 0;

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

    public void add(Engine engine){
        engine.click(addPageClassName , addPageIndex);
        engine.clearAndType(goodsNameEditTextClassName , goodsNameEditTextIndex , goodsName);
        engine.clearAndType(deadlineEditTextClassName , deadlineEditTextIndex , deadline);
        engine.click(addButtonClassName , addButtonIndex);
    }

    public String getAddPageClassName() {
        return addPageClassName;
    }

    public void setAddPageClassName(String addPageClassName) {
        this.addPageClassName = addPageClassName;
    }

    public int getAddPageIndex() {
        return addPageIndex;
    }

    public void setAddPageIndex(int addPageIndex) {
        this.addPageIndex = addPageIndex;
    }

    public String getGoodsNameEditTextClassName() {
        return goodsNameEditTextClassName;
    }

    public void setGoodsNameEditTextClassName(String goodsNameEditTextClassName) {
        this.goodsNameEditTextClassName = goodsNameEditTextClassName;
    }

    public int getGoodsNameEditTextIndex() {
        return goodsNameEditTextIndex;
    }

    public void setGoodsNameEditTextIndex(int goodsNameEditTextIndex) {
        this.goodsNameEditTextIndex = goodsNameEditTextIndex;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDeadlineEditTextClassName() {
        return deadlineEditTextClassName;
    }

    public void setDeadlineEditTextClassName(String deadlineEditTextClassName) {
        this.deadlineEditTextClassName = deadlineEditTextClassName;
    }

    public int getDeadlineEditTextIndex() {
        return deadlineEditTextIndex;
    }

    public void setDeadlineEditTextIndex(int deadlineEditTextIndex) {
        this.deadlineEditTextIndex = deadlineEditTextIndex;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getAddButtonClassName() {
        return addButtonClassName;
    }

    public void setAddButtonClassName(String addButtonClassName) {
        this.addButtonClassName = addButtonClassName;
    }

    public int getAddButtonIndex() {
        return addButtonIndex;
    }

    public void setAddButtonIndex(int addButtonIndex) {
        this.addButtonIndex = addButtonIndex;
    }
}
