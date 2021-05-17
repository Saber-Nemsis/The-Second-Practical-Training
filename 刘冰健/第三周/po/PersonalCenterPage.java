package com.appiumPlus.po;

public class PersonalCenterPage {

    //我的按钮xpath
    private String mineButton = "xpath=//android.widget.Button[@content-desc=\"我的, tab, 5 of 5\"]";

    //关注按钮xpath
    private String subscription = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[2]";

    //我的粉丝xpath
    private String myFuns = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[2]";

    //我的心得xpath
    private String myExperience = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.TextView[2]";

    //设置按钮xpath
    private String set = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";


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

    public String getSet() {
        return set;
    }
}
