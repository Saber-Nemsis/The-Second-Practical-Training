package com.appiumPlus.po;

public class AddPage {

    //添加按钮xpath和下标
    private String addButton = "class=android.widget.TextView";
    private int addButtonIndex = 18;

    //物品名称输入框class和index
    private String name = "class=android.widget.EditText";
    private int nameIndex = 3;

    //保质期输入框class和index
    private String life = "class=android.widget.EditText";
    private int lifeIndex = 4;

    //确认添加按钮xpath
    private String confirm = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.TextView";

    public String getAddButton() {
        return addButton;
    }

    public int getAddButtonIndex() {
        return addButtonIndex;
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
