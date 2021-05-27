package com.uiautomator_plus.po.wzj;


/**
 * 登录后的主页页面
 */
public class MainPage  extends BasePage {

    //底部栏的主页的class和下标
    private String mainPageClassName = "class=android.widget.Button";
    private int mainPageIndex = 0;

    //一种物品的class和下标
    private String goodsClassName = "class=android.widget.ImageView";
    private int goodsIndex = 8;

    //右上角个人头像的class和下标
    private String personalPhotoClassName = "class=android.widget.ImageView";
    private int personalPhotoIndex = 2;

    //第一条记录的删除按钮className和下标
    private String firstGoodsDeleteButtonClassName = "class=android.widget.ImageView";
    private int firstGoodsDeleteButtonIndex = 9;

    //每条记录的className
    private String allGoodsClassName = "class=android.view.ViewGroup";

    //弹窗确定的class和index
    private String alertButtonClassName = "class=android.widget.Button";
    private int alertButtonIndex = 1;

    //搜索框的class和index以及内容
    private String inputClassName = "class=android.widget.EditText";
    private int inputIndex = 2;
    private String inputContent = "苹果";

    //水果蔬菜按钮的class和index
    private String fruitAndVegetableButtonClassName = "class=android.widget.ImageView";
    private int fruitAndVegetableButtonIndex = 3;

    //肉蛋按钮的class和index
    private String meatAndEggButtonClassName = "class=android.widget.ImageView";
    private int meatAndEggButtonIndex = 4;

    //海鲜水产按钮的class和index
    private String seafoodButtonClassName = "class=android.widget.ImageView";
    private int seafoodButtonIndex = 5;

    //速食冷冻按钮的class和index
    private String fastFoodButtonClassName = "class=android.view.ViewGroup";
    private int fastFoodButtonIndex = 37;

    //零食饮品按钮的class和index
    private String snacksAndDrinkButtonClassName = "class=android.widget.ImageView";
    private int snacksAndDrinkButtonIndex = 7;

    //饭按钮的class和index
    private String cookButtonClassName = "class=android.widget.TextView";
    private int cookButtonIndex = 16;

    public String getMainPageXapth() {
        return mainPageClassName;
    }

    public void setMainPageXapth(String mainPageClassName) {
        this.mainPageClassName = mainPageClassName;
    }

    public int getMainPageIndex() {
        return mainPageIndex;
    }

    public void setMainPageIndex(int mainPageIndex) {
        this.mainPageIndex = mainPageIndex;
    }

    public String getGoodsClassName() {
        return goodsClassName;
    }

    public void setGoodsClassName(String goodsClassName) {
        this.goodsClassName = goodsClassName;
    }

    public int getGoodsIndex() {
        return goodsIndex;
    }

    public void setGoodsIndex(int goodsIndex) {
        this.goodsIndex = goodsIndex;
    }

    public String getPersonalPhotoClassName() {
        return personalPhotoClassName;
    }

    public void setPersonalPhotoClassName(String personalPhotoClassName) {
        this.personalPhotoClassName = personalPhotoClassName;
    }

    public int getPersonalPhotoIndex() {
        return personalPhotoIndex;
    }

    public void setPersonalPhotoIndex(int personalPhotoIndex) {
        this.personalPhotoIndex = personalPhotoIndex;
    }

    public String getFirstGoodsDeleteButtonClassName() {
        return firstGoodsDeleteButtonClassName;
    }

    public void setFirstGoodsDeleteButtonClassName(String firstGoodsDeleteButtonClassName) {
        this.firstGoodsDeleteButtonClassName = firstGoodsDeleteButtonClassName;
    }

    public int getFirstGoodsDeleteButtonIndex() {
        return firstGoodsDeleteButtonIndex;
    }

    public void setFirstGoodsDeleteButtonIndex(int firstGoodsDeleteButtonIndex) {
        this.firstGoodsDeleteButtonIndex = firstGoodsDeleteButtonIndex;
    }

    public String getAllGoodsClassName() {
        return allGoodsClassName;
    }

    public void setAllGoodsClassName(String allGoodsClassName) {
        this.allGoodsClassName = allGoodsClassName;
    }

    public String getAlertButtonClassName() {
        return alertButtonClassName;
    }

    public void setAlertButtonClassName(String alertButtonClassName) {
        this.alertButtonClassName = alertButtonClassName;
    }

    public int getAlertButtonIndex() {
        return alertButtonIndex;
    }

    public void setAlertButtonIndex(int alertButtonIndex) {
        this.alertButtonIndex = alertButtonIndex;
    }

    public String getInputClassName() {
        return inputClassName;
    }

    public void setInputClassName(String inputClassName) {
        this.inputClassName = inputClassName;
    }

    public int getInputIndex() {
        return inputIndex;
    }

    public void setInputIndex(int inputIndex) {
        this.inputIndex = inputIndex;
    }

    public String getInputContent() {
        return inputContent;
    }

    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    public String getFruitAndVegetableButtonClassName() {
        return fruitAndVegetableButtonClassName;
    }

    public void setFruitAndVegetableButtonClassName(String fruitAndVegetableButtonClassName) {
        this.fruitAndVegetableButtonClassName = fruitAndVegetableButtonClassName;
    }

    public int getFruitAndVegetableButtonIndex() {
        return fruitAndVegetableButtonIndex;
    }

    public void setFruitAndVegetableButtonIndex(int fruitAndVegetableButtonIndex) {
        this.fruitAndVegetableButtonIndex = fruitAndVegetableButtonIndex;
    }

    public String getMeatAndEggButtonClassName() {
        return meatAndEggButtonClassName;
    }

    public void setMeatAndEggButtonClassName(String meatAndEggButtonClassName) {
        this.meatAndEggButtonClassName = meatAndEggButtonClassName;
    }

    public int getMeatAndEggButtonIndex() {
        return meatAndEggButtonIndex;
    }

    public void setMeatAndEggButtonIndex(int meatAndEggButtonIndex) {
        this.meatAndEggButtonIndex = meatAndEggButtonIndex;
    }

    public String getSeafoodButtonClassName() {
        return seafoodButtonClassName;
    }

    public void setSeafoodButtonClassName(String seafoodButtonClassName) {
        this.seafoodButtonClassName = seafoodButtonClassName;
    }

    public int getSeafoodButtonIndex() {
        return seafoodButtonIndex;
    }

    public void setSeafoodButtonIndex(int seafoodButtonIndex) {
        this.seafoodButtonIndex = seafoodButtonIndex;
    }

    public String getFastFoodButtonClassName() {
        return fastFoodButtonClassName;
    }

    public void setFastFoodButtonClassName(String fastFoodButtonClassName) {
        this.fastFoodButtonClassName = fastFoodButtonClassName;
    }

    public int getFastFoodButtonIndex() {
        return fastFoodButtonIndex;
    }

    public void setFastFoodButtonIndex(int fastFoodButtonIndex) {
        this.fastFoodButtonIndex = fastFoodButtonIndex;
    }

    public String getSnacksAndDrinkButtonClassName() {
        return snacksAndDrinkButtonClassName;
    }

    public void setSnacksAndDrinkButtonClassName(String snacksAndDrinkButtonClassName) {
        this.snacksAndDrinkButtonClassName = snacksAndDrinkButtonClassName;
    }

    public int getSnacksAndDrinkButtonIndex() {
        return snacksAndDrinkButtonIndex;
    }

    public void setSnacksAndDrinkButtonIndex(int snacksAndDrinkButtonIndex) {
        this.snacksAndDrinkButtonIndex = snacksAndDrinkButtonIndex;
    }

    public String getCookButtonClassName() { return cookButtonClassName; }

    public void setCookButtonClassName(String cookButtonClassName) {
        this.cookButtonClassName = cookButtonClassName;
    }

    public int getCookButtonIndex() { return cookButtonIndex; }

    public void setCookButtonIndex(int cookButtonIndex) {
        this.cookButtonIndex = cookButtonIndex;
    }
}
