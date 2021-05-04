package com.appium_plus.po.wzj;

import lombok.Data;

/**
 * "我的"页面
 */
@Data
public class MyPage extends BasePage {
    //底部"我的"按钮的xpath和index
    private String myXpath = "xpath=//android.widget.Button[@content-desc=\"我的, tab, 5 of 5\"]";
    private int myIndex = 0;

    //我的关注className和index
    private String myFollowerClassName="class=android.widget.TextView";
    private int myFollowerIndex = 9;

    //我的粉丝className和index
    private String myFunsClassName = "class=android.widget.TextView";
    private int myFunsIndex = 11;

    //我的心得className和index
    private String myConclusionClassName = "class=android.widget.TextView";
    private int myConclusionIndex = 13;

    //拍照className和index
    private String takePhotoButtonClassName = "class=android.widget.TextView";
    private int takePhotoButtonIndex = 7;

    //设置的className和index
    private String settingClassName = "class=android.widget.TextView";
    private int settingIndex = 5;

    //动态的class和index
    private String className = "class=android.widget.TextView";
    private int index = 11;
}
