package com.uiautomator_plus.po.lmr;

public class LikeEatPage {

    //导航栏爱吃的text和index
    private String likePageText="爱吃";
    private int likePageIndex=0;

    //搜索框的text和index
    private String searchMyFavoriteText="搜索我的收藏";
    private int searchMyFavoriteIndex=0;

    //搜索框的默认输入text和index
    private String searchDefaultText="春菜";
    private int searchDefaultIndex=0;


    //爱吃食物名称text和index
    private String likeFoodText="西红柿炒鸡蛋";
    private int likeFoodIndex=0;

    //点击爱吃食物之后食物介绍text和index
    private String clickLikeFoodTitleText="外加里嫩~炸豆腐丸子";
    private int clickLikeFoodTitleIndex=0;

    //爱吃食物步骤text和index
    private String likeFoodStepText="豆腐用勺子捣碎";
    private int likeFoodStepIndex=0;

    private String likeEatPageScrollView="android.widget.ScrollView";


    public String getLikePageText() {
        return likePageText;
    }

    public int getLikePageIndex() {
        return likePageIndex;
    }

    public String getSearchMyFavoriteText() {
        return searchMyFavoriteText;
    }

    public int getSearchMyFavoriteIndex() {
        return searchMyFavoriteIndex;
    }

    public String getSearchDefaultText() {
        return searchDefaultText;
    }

    public int getSearchDefaultIndex() {
        return searchDefaultIndex;
    }

    public String getLikeFoodText() {
        return likeFoodText;
    }

    public int getLikeFoodIndex() {
        return likeFoodIndex;
    }

    public String getClickLikeFoodTitleText() {
        return clickLikeFoodTitleText;
    }

    public int getClickLikeFoodTitleIndex() {
        return clickLikeFoodTitleIndex;
    }

    public String getLikeFoodStepText() {
        return likeFoodStepText;
    }

    public int getLikeFoodStepIndex() {
        return likeFoodStepIndex;
    }

    public String getLikeEatPageScrollView() {
        return likeEatPageScrollView;
    }
}
