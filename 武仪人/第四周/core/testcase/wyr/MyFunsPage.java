package com.uiautomator_plus.po.wyr;


/**
 * 我的粉丝页面
 */
public class MyFunsPage  extends BasePage{
    //我的粉丝标题class和index
    private String myFunsTitleClassName = "class=android.widget.TextView";
    private int myFunsTitleIndex = 31;

    public String getMyFunsTitleClassName() {
        return myFunsTitleClassName;
    }

    public void setMyFunsTitleClassName(String myFunsTitleClassName) {
        this.myFunsTitleClassName = myFunsTitleClassName;
    }

    public int getMyFunsTitleIndex() {
        return myFunsTitleIndex;
    }

    public void setMyFunsTitleIndex(int myFunsTitleIndex) {
        this.myFunsTitleIndex = myFunsTitleIndex;
    }
}
