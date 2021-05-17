package com.uiautomator_plus.po.lmr;

public class CookPage {

    //下面导航栏做饭的text和index
    private String cookPageText="做饭";
    private int cookPageIndex=0;

    //做饭列表的第一个view的text和index
    private String firstFoodText="西红柿炒鸡蛋";
    private int firstFoodIndex=0;

    //做饭主页scrollview的class和index
    private String cookPageScrollViewClassName="android.widget.ScrollView";
    private int cookPageScrollViewIndex=0;

    //做饭步骤内容text和index
    private String stepText="豆腐用勺子捣碎";
    private int stepIndex=0;

    public String getCookPageText() {
        return cookPageText;
    }

    public int getCookPageIndex() {
        return cookPageIndex;
    }

    public String getFirstFoodText() {
        return firstFoodText;
    }

    public int getFirstFoodIndex() {
        return firstFoodIndex;
    }

    public String getCookPageScrollViewClassName() {
        return cookPageScrollViewClassName;
    }

    public int getCookPageScrollViewIndex() {
        return cookPageScrollViewIndex;
    }

    public String getStepText() {
        return stepText;
    }

    public int getStepIndex() {
        return stepIndex;
    }
}
