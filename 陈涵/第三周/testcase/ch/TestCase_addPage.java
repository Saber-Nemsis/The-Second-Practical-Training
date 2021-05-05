package com.appiumPlus.testcase.ch;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.ch.AddPage;
import org.testng.Assert;
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
        engine.clearAndType("class=android.widget.EditText" , 0 , "ch");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123456");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        String addButtonLocator=addPage.getBaseLocator()+addPage.getAddButtonXpath();
        engine.click("xpath="+addButtonLocator,0);

    }

    //添加01
    //步骤描述：输入物品名称，保质期，选照片，点击确认添加进行添加
    //bug描述：不能选择照片，并且点击确认添加并没有反应
    @Test
    public void add_test01(){
        engine.clearAndType("class="+addPage.getGoodsNameClassName(),addPage.getGoodsNameIndex(),"黄瓜");
        engine.clearAndType("class="+addPage.getExpDateClassName(),addPage.getExpDateIndex(),"2");
        String confirmAddLocator=addPage.getBaseLocator()+addPage.getConfirmAddXpath();
        engine.click("xpath="+confirmAddLocator,addPage.getConfirmAddIndex());
        Assert.assertFalse(engine.isElementPresent("xpath="+confirmAddLocator,addPage.getConfirmAddIndex()));
    }

    //添加02
    //步骤描述：输入特殊字符，保质期，选照片，点击确认添加进行添加
    //bug描述：没有输入过滤，添加失败
    @Test
    public void add_test02(){
        engine.clearAndType("class="+addPage.getGoodsNameClassName(),addPage.getGoodsNameIndex(),"^%^");
        engine.clearAndType("class="+addPage.getExpDateClassName(),addPage.getExpDateIndex(),"2");
        String confirmAddLocator=addPage.getBaseLocator()+addPage.getConfirmAddXpath();
        engine.click("xpath="+confirmAddLocator,addPage.getConfirmAddIndex());
        Assert.assertFalse(engine.isElementPresent("xpath="+confirmAddLocator,addPage.getConfirmAddIndex()));
    }
}
