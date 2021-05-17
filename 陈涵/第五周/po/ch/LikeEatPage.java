package com.uiautomator_plus.po.ch;

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

    //删除按钮class和index
    private String deleteButtonClassName="android.view.View";
    private int deleteButtonIndex=1;

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

    public String getDeleteButtonClassName() {
        return deleteButtonClassName;
    }

    public int getDeleteButtonIndex() {
        return deleteButtonIndex;
    }
}
