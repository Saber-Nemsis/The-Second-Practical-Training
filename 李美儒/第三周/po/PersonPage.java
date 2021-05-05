package com.appium_plus.po.lmr;

public class PersonPage {
    private String personButtonXpath="//android.widget.Button[@content-desc=\"我的, tab, 5 of 5\"]";

    //我的主页中关注的xpath和index
    private String followButtonXpath="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View";
    private int followButtonIndex=0;

    //我的主页中粉丝的xpath和index
    private String fansButtonXpath="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View";
    private int fansButtonIndex=1;

    //我的主页心得的xpath和index
    private String myFeelingsXpath="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View";
    private int myFeelingsIndex=2;

    //我的主页设置的xpath和index
    private String settingXpath="//android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";
    private int settingIndex=0;

    //我的主页中我的姓名xpath和index
    private String myNameXpath="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
    private int myNameIndex=0;

    //我的主页中相机的xpath和index
    private String cameraXpath="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
    private int cameraIndex=1;

    //默认显示我的食物分享列表xpath和index
    private String myFoodShareXpath="//android.widget.ScrollView/android.view.View/android.widget.ScrollView/android.view.View/android.view.View";
    private int myFoodShareIndex=0;

    //默认显示我的食物分享列表的标题xpath和index
    private String myFoodShareTitleXpath="/android.widget.TextView";
    private int MyFoodShareTitleIndex=0;

    //我的主页点击我的关注以及下面的默认食物分享列表之后进行跳转的基本路径
    private String baseLocator="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View";


    //我的主页点击我的关注之后的返回键xpath和index
    private String afterClickMyFollowBackXpath="/android.widget.TextView";
    private int afterClickMyFollowBackIndex=0;

    //我的主页点击我的关注之后的标题的xpath和index
    private String afterClickMyFollowTitleXpath="/android.widget.TextView";
    private int afterClickMyFollowTitleIndex=1;

    //我的主页点击我的关注后的详细关注用户信息xpath和index
    private String afterClickMyFollowUserInfoXpath="/android.widget.ScrollView/android.view.View/android.view.View";
    private int afterClickMyFollowUserInfoIndex=0;

    //我的主页点击我的关注的详细用户信息的名字xpath和index
    private String afterClickMyFollowUserInfoOfNameXpath="/android.view.View/android.widget.TextView";
    private int afterClickMyFollowUserInfoOfNameIndex=0;

    //我的主页点击我的关注的详细用户信息的状态xpath和index
    private String afterClickMyFollowUserInfoOfStatusXpath="/android.view.View/android.view.View/android.view.View/android.widget.TextView";
    private int afterClickMyFollowUserInfoOfStatusIndex=0;

    //我的主页点击我的粉丝之后跳转的基本路径
    private String afterClickMyFansBaseXpath="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View";

    //点击我的粉丝之后跳转页面的返回键Xpath和index
    private String afterClickMyFansBackXpath="/android.widget.TextView";
    private int afterClickMyFansBackIndex=0;

    //点击我的粉丝之后跳转页面的title的xpath和index
    private String afterClickMyFansTitleXpath="/android.widget.TextView";
    private int afterClickMyFansTitleIndex=1;

    //点击我的粉丝跳转页面粉丝的详细信息xpath和index
    private String afterClickMyFansInfoXpath="/android.widget.ScrollView/android.view.View/android.view.View";
    private int afterClickMyFansInfoIndex=0;

    //点击我的粉丝跳转页面粉丝的详细信息中的粉丝姓名xpath和index
    private String afterClickMyFansInfoOfNameXpath="/android.view.View/android.view.View";
    private int afterClickMyFansInfoOfNameIndex=0;

    //点击我的粉丝跳转页面粉丝的详细信息中的粉丝的状态xpath和index
    private String afterClickMyFansInfoOfStatusXpath="/android.view.View/android.view.View/android.view.View/android.widget.TextView";
    private int afterClickMyFansInfoOfStatusIndex=0;

    //点击默认的食物分享列表的第一个返回的页面信息xpath和index
    private String afterClickMyFoodShareInfoXpath="/android.view.View[1]/android.widget.TextView";
    private int afterClickMyFoodShareInfoIndex=0;

    public String getPersonButtonXpath() {
        return personButtonXpath;
    }

    public String getFollowButtonXpath() {
        return followButtonXpath;
    }

    public int getFollowButtonIndex() {
        return followButtonIndex;
    }

    public String getFansButtonXpath() {
        return fansButtonXpath;
    }

    public int getFansButtonIndex() {
        return fansButtonIndex;
    }

    public String getMyFoodShareXpath() {
        return myFoodShareXpath;
    }

    public int getMyFoodShareIndex() {
        return myFoodShareIndex;
    }

    public String getMyFeelingsXpath() {
        return myFeelingsXpath;
    }

    public int getMyFeelingsIndex() {
        return myFeelingsIndex;
    }

    public String getSettingXpath() {
        return settingXpath;
    }

    public int getSettingIndex() {
        return settingIndex;
    }

    public String getMyNameXpath() {
        return myNameXpath;
    }

    public int getMyNameIndex() {
        return myNameIndex;
    }

    public String getCameraXpath() {
        return cameraXpath;
    }

    public int getCameraIndex() {
        return cameraIndex;
    }

    public String getBaseLocator() {
        return baseLocator;
    }

    public String getAfterClickMyFollowBackXpath() {
        return afterClickMyFollowBackXpath;
    }

    public int getAfterClickMyFollowBackIndex() {
        return afterClickMyFollowBackIndex;
    }

    public String getAfterClickMyFollowTitleXpath() {
        return afterClickMyFollowTitleXpath;
    }

    public int getAfterClickMyFollowTitleIndex() {
        return afterClickMyFollowTitleIndex;
    }

    public String getAfterClickMyFollowUserInfoXpath() {
        return afterClickMyFollowUserInfoXpath;
    }

    public int getAfterClickMyFollowUserInfoIndex() {
        return afterClickMyFollowUserInfoIndex;
    }

    public String getAfterClickMyFollowUserInfoOfNameXpath() {
        return afterClickMyFollowUserInfoOfNameXpath;
    }

    public int getAfterClickMyFollowUserInfoOfNameIndex() {
        return afterClickMyFollowUserInfoOfNameIndex;
    }

    public String getAfterClickMyFollowUserInfoOfStatusXpath() {
        return afterClickMyFollowUserInfoOfStatusXpath;
    }

    public int getAfterClickMyFollowUserInfoOfStatusIndex() {
        return afterClickMyFollowUserInfoOfStatusIndex;
    }

    public String getMyFoodShareTitleXpath() {
        return myFoodShareTitleXpath;
    }

    public int getMyFoodShareTitleIndex() {
        return MyFoodShareTitleIndex;
    }

    public String getAfterClickMyFansBaseXpath() {
        return afterClickMyFansBaseXpath;
    }

    public String getAfterClickMyFansBackXpath() {
        return afterClickMyFansBackXpath;
    }

    public int getAfterClickMyFansBackIndex() {
        return afterClickMyFansBackIndex;
    }

    public String getAfterClickMyFansTitleXpath() {
        return afterClickMyFansTitleXpath;
    }

    public int getAfterClickMyFansTitleIndex() {
        return afterClickMyFansTitleIndex;
    }

    public String getAfterClickMyFansInfoXpath() {
        return afterClickMyFansInfoXpath;
    }

    public int getAfterClickMyFansInfoIndex() {
        return afterClickMyFansInfoIndex;
    }

    public String getAfterClickMyFansInfoOfNameXpath() {
        return afterClickMyFansInfoOfNameXpath;
    }

    public int getAfterClickMyFansInfoOfNameIndex() {
        return afterClickMyFansInfoOfNameIndex;
    }

    public String getAfterClickMyFansInfoOfStatusXpath() {
        return afterClickMyFansInfoOfStatusXpath;
    }

    public int getAfterClickMyFansInfoOfStatusIndex() {
        return afterClickMyFansInfoOfStatusIndex;
    }

    public String getAfterClickMyFoodShareInfoXpath() {
        return afterClickMyFoodShareInfoXpath;
    }

    public int getAfterClickMyFoodShareInfoIndex() {
        return afterClickMyFoodShareInfoIndex;
    }
}
