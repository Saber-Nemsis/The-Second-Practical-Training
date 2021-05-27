package com.uiautomator_plus.po.wzj;


/**
 * 我的关注页面
 */
public class MyFollowerPage  extends BasePage {

    //顶部你关注的人的class和下标
    private String followButtonClassName = "class=android.widget.TextView";
    private int followButtonIndex = 21;

    public String getFollowButtonClassName() {
        return followButtonClassName;
    }

    public void setFollowButtonClassName(String followButtonClassName) {
        this.followButtonClassName = followButtonClassName;
    }

    public int getFollowButtonIndex() {
        return followButtonIndex;
    }

    public void setFollowButtonIndex(int followButtonIndex) {
        this.followButtonIndex = followButtonIndex;
    }
}
