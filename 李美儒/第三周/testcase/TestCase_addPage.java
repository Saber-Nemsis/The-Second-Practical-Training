package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.AddPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_addPage extends BaseTest {

    private AddPage addPage;

    @BeforeClass
    public void initPage(){
        addPage=new AddPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "123");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        String addButtonLocator=addPage.getBaseLocator()+addPage.getAddButtonXpath();
        engine.click("xpath="+addButtonLocator,0);

    }

    //进行添加操作
    //步骤描述：输入物品名称，保质期，选照片，点击确认添加进行添加
    //bug描述：照片没有地方可以选择，并且点击确认添加并没有反应
    @Test
    public void test(){
        engine.clearAndType("class="+addPage.getGoodsNameClassName(),addPage.getGoodsNameIndex(),"黄瓜");
        engine.clearAndType("class="+addPage.getExpDateClassName(),addPage.getExpDateIndex(),"2");
        String confirmAddLocator=addPage.getBaseLocator()+addPage.getConfirmAddXpath();
        engine.click("xpath="+confirmAddLocator,addPage.getConfirmAddIndex());

    }

}
