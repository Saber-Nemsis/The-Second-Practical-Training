package com.uiautomator_plus.po.lbj;

public class PersonalCenterPage {

    //我的按钮
    private String mineButton = "text=我的";

    //关注按钮
    private String subscription = "text=关注";

    //关注数量class和index
    private String subNum = "class=android.widget.TextView";
    private int subNumIndex = 8;
    //我的粉丝
    private String myFuns = "text=我的粉丝";

    //我的粉丝数量
    private String myFunsNum = "class=android.widget.TextView";
    private int myFunsNumIndex = 10;
    //我的心得
    private String myExperience = "text=我的心得";

    //设置按钮x,y坐标
    private int setX = 760;
    private int setY = 140;


    public String getMineButton() {
        return mineButton;
    }

    public String getSubscription() {
        return subscription;
    }

    public String getMyFuns() {
        return myFuns;
    }

    public String getMyExperience() {
        return myExperience;
    }

    public int getSetX() {
        return setX;
    }

    public int getSetY() {
        return setY;
    }

    public String getSubNum() {
        return subNum;
    }

    public int getSubNumIndex() {
        return subNumIndex;
    }

    public String getMyFunsNum() {
        return myFunsNum;
    }

    public int getMyFunsNumIndex() {
        return myFunsNumIndex;
    }
}