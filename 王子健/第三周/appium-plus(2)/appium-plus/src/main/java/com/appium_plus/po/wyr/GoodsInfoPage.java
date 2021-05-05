package com.appium_plus.po.wyr;

import lombok.Data;

/**
 * 点开物品后的页面
 */
@Data
public class GoodsInfoPage  extends BasePage{
    //营养小贴士class和index
    private String remainderClassName = "class=android.widget.TextView";
    private int remainderIndex = 22;
}
