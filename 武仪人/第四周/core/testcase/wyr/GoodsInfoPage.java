package com.uiautomator_plus.po.wyr;


/**
 * 点开物品后的页面
 */
public class GoodsInfoPage  extends BasePage{
    //营养小贴士class和index
    private String remainderClassName = "class=android.widget.TextView";
    private int remainderIndex = 22;

    public String getRemainderClassName() {
        return remainderClassName;
    }

    public void setRemainderClassName(String remainderClassName) {
        this.remainderClassName = remainderClassName;
    }

    public int getRemainderIndex() {
        return remainderIndex;
    }

    public void setRemainderIndex(int remainderIndex) {
        this.remainderIndex = remainderIndex;
    }
}
