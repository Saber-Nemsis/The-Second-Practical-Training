package com.uiautomator_plus.testcase.ch;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.ch.AddPage;
import com.uiautomator_plus.po.ch.EntrancePage;
import com.uiautomator_plus.po.ch.LoginPage;

import org.junit.Before;
import org.junit.Test;

public class TestCase_addPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    AddPage addPage=new AddPage();
    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"ch");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }

    //添加01
    //步骤描述：直接点击确认添加，看能否进行添加
    //bug描述：直接点击确认添加，不能进行添加
    @Test
    public void test_directly_click_add(){
        getEngine().click("text="+addPage.getConfirmAddText(),addPage.getConfirmAddIndex());
    }

    //添加02
    //步骤描述：只添加物品名称，点击确认添加，看看能否添加成功
    //bug描述：只添加物品名称，不能添加成功
    @Test
    public void test_only_name(){
        String goosName="凉拌黄瓜";
        getEngine().click("text="+addPage.getAddPageText(),addPage.getAddPageIndex());
        getEngine().clearAndType("text="+addPage.getGoodsNameText(),addPage.getGoodsNameIndex(),goosName);
        getEngine().click("text="+addPage.getConfirmAddText(),addPage.getConfirmAddIndex());
    }

    //添加03
    //步骤描述：只添加物品名称和保质期，点击确认添加，看看能否添加成功
    //bug描述：只添加物品名称和保质期，不能添加成功
    @Test
    public void test_only_nameAndEXP(){
        String goosName="凉拌黄瓜";
        String EXP="2";
        getEngine().click("text="+addPage.getAddPageText(),addPage.getAddPageIndex());
        getEngine().clearAndType("text="+addPage.getGoodsNameText(),addPage.getGoodsNameIndex(),goosName);
        getEngine().clearAndType("class="+addPage.getEXPClassName(),addPage.getEXPIndex(),EXP);
        getEngine().click("text="+addPage.getConfirmAddText(),addPage.getConfirmAddIndex());
    }


}
