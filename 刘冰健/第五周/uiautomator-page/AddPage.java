package com.uiautomator_plus.po.lbj;

public class AddPage {

    //添加按钮xpath和下标
    private String addButton = "text=添加";

    //物品名称输入框class和index
    private String name = "class=android.widget.EditText";
    private int nameIndex = 3;

    //保质期输入框class和index
    private String life = "class=android.widget.EditText";
    private int lifeIndex = 4;

    //确认添加按钮xpath
    private String confirm = "text=确认添加";

    public String getAddButton() {
        return addButton;
    }

    public String getName() {
        return name;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public String getLife() {
        return life;
    }

    public int getLifeIndex() {
        return lifeIndex;
    }

    public String getConfirm() {
        return confirm;
    }
}