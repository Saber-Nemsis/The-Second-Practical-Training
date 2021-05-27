package com.uiautomator_plus.po.wzj;


/**
 * "我的"页面
 */
public class MyPage extends BasePage {
    //底部"我的"按钮的classname和index
    private String myClassName = "class=android.widget.Button";
    private int myIndex = 3;

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
    private String activityClassName = "class=android.widget.TextView";
    private int activityIndex = 11;

    public String getActivityClassName() { return activityClassName; }

    public void setActivityClassName(String activityClassName) {
        this.activityClassName = activityClassName;
    }

    public int getActivityIndex() { return activityIndex; }

    public void setActivityIndex(int activityIndex) {
        this.activityIndex = activityIndex;
    }

    public String getMyClassName() {
        return myClassName;
    }

    public void setMyClassName(String myClassName) {
        this.myClassName = myClassName;
    }

    public int getMyIndex() {
        return myIndex;
    }

    public void setMyIndex(int myIndex) {
        this.myIndex = myIndex;
    }

    public String getMyFollowerClassName() {
        return myFollowerClassName;
    }

    public void setMyFollowerClassName(String myFollowerClassName) {
        this.myFollowerClassName = myFollowerClassName;
    }

    public int getMyFollowerIndex() {
        return myFollowerIndex;
    }

    public void setMyFollowerIndex(int myFollowerIndex) {
        this.myFollowerIndex = myFollowerIndex;
    }

    public String getMyFunsClassName() {
        return myFunsClassName;
    }

    public void setMyFunsClassName(String myFunsClassName) {
        this.myFunsClassName = myFunsClassName;
    }

    public int getMyFunsIndex() {
        return myFunsIndex;
    }

    public void setMyFunsIndex(int myFunsIndex) {
        this.myFunsIndex = myFunsIndex;
    }

    public String getMyConclusionClassName() {
        return myConclusionClassName;
    }

    public void setMyConclusionClassName(String myConclusionClassName) {
        this.myConclusionClassName = myConclusionClassName;
    }

    public int getMyConclusionIndex() {
        return myConclusionIndex;
    }

    public void setMyConclusionIndex(int myConclusionIndex) {
        this.myConclusionIndex = myConclusionIndex;
    }

    public String getTakePhotoButtonClassName() {
        return takePhotoButtonClassName;
    }

    public void setTakePhotoButtonClassName(String takePhotoButtonClassName) {
        this.takePhotoButtonClassName = takePhotoButtonClassName;
    }

    public int getTakePhotoButtonIndex() {
        return takePhotoButtonIndex;
    }

    public void setTakePhotoButtonIndex(int takePhotoButtonIndex) {
        this.takePhotoButtonIndex = takePhotoButtonIndex;
    }

    public String getSettingClassName() {
        return settingClassName;
    }

    public void setSettingClassName(String settingClassName) {
        this.settingClassName = settingClassName;
    }

    public int getSettingIndex() {
        return settingIndex;
    }

    public void setSettingIndex(int settingIndex) {
        this.settingIndex = settingIndex;
    }
}
