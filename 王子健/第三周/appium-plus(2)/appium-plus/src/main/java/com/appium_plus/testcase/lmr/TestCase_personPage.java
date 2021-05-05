package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.PersonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_personPage extends BaseTest {

    private PersonPage personPage;
    @BeforeClass
    public void initPage(){
        personPage=new PersonPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "123");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+personPage.getPersonButtonXpath(),0);

    }

    //点击我的主页内所有的按钮，看是否能点击
    //步骤描述：点击设置，点击姓名，点击相机，点击我的心得
    //bug描述：设置，姓名，相机，我的心得等均不可点击，或者说点击之后并无事件响应
    @Test
    public void test_button_is_enclick(){
        //点击设置图案按钮
        engine.click("xpath="+personPage.getSettingXpath(),personPage.getSettingIndex());
        //点击姓名
        engine.click("xpath="+personPage.getMyNameXpath(),personPage.getMyNameIndex());
        //点击相机
        engine.click("xpath="+personPage.getCameraXpath(),personPage.getCameraIndex());
        //点击我的心得
        engine.click("xpath="+personPage.getMyFeelingsXpath(),personPage.getMyFeelingsIndex());
    }


    //我的主页中的我的关注按键跳转测试
    // 步骤描述：点击我的主页中我的关注，看是否能正常跳转，点击返回键，看是否能返回到我的主页
    @Test
    public void test_click_myFollow_and_back(){

        //点击我的关注
        engine.click("xpath="+personPage.getFollowButtonXpath(),personPage.getFollowButtonIndex());
        String afterClickMyFollowTitleLocator=personPage.getBaseLocator()+personPage.getAfterClickMyFollowTitleXpath();
        String afterClickMyFollowTitle=engine.getText("xpath="+afterClickMyFollowTitleLocator,personPage.getAfterClickMyFollowTitleIndex());
        System.out.println(afterClickMyFollowTitle);
        Assert.assertEquals(afterClickMyFollowTitle,"你关注的人");
        String afterClickMyFollowBackLocator=personPage.getBaseLocator()+personPage.getAfterClickMyFollowBackXpath();
        engine.click("xpath="+afterClickMyFollowBackLocator,personPage.getAfterClickMyFollowBackIndex());
        Assert.assertTrue(engine.isElementPresent("xpath="+personPage.getCameraXpath(),personPage.getCameraIndex()));

    }


    //我的主页中点击我的关注内容测试
    //步骤描述：点击我的主页中我的关注，查看我关注的用户信息，例如名字、状态
    //望改进的bug描述：我关注的人不能点击已关注变为不关注
    public void test_click_myFollow_page(){
        engine.click("xpath="+personPage.getFollowButtonXpath(),personPage.getFollowButtonIndex());
        String afterClickMyFollowUserInfoLocator=personPage.getBaseLocator()+personPage.getAfterClickMyFollowUserInfoXpath();
        engine.click("xpath="+afterClickMyFollowUserInfoLocator,personPage.getAfterClickMyFollowUserInfoIndex());
        String afterClickMyFollowUserInfoOfNameLocator=afterClickMyFollowUserInfoLocator+personPage.getAfterClickMyFollowUserInfoOfNameXpath();
        String afterClickMyFollowUserInfoOfName=engine.getText("xpath="+afterClickMyFollowUserInfoOfNameLocator,personPage.getAfterClickMyFollowUserInfoOfNameIndex());
        System.out.println(afterClickMyFollowUserInfoOfName);
        String afterClickMyFollowUserInfoOfStatusLocator=afterClickMyFollowUserInfoLocator+personPage.getAfterClickMyFollowUserInfoOfStatusXpath();
        String afterClickMyFollowUserInfoOfStatus=engine.getText("xpath="+afterClickMyFollowUserInfoOfStatusLocator,personPage.getAfterClickMyFollowUserInfoOfStatusIndex());
        System.out.println(afterClickMyFollowUserInfoOfStatus);
        Assert.assertEquals(afterClickMyFollowUserInfoOfStatus,"已关注");
    }


    //我的主页中的我的粉丝按键跳转测试
    // 步骤描述：点击我的主页中我的粉丝，看是否能正常跳转，点击返回键，看是否能返回到我的主页
    @Test
    public void test_click_myFans_and_back(){
        engine.click("xpath="+personPage.getFansButtonXpath(),personPage.getFansButtonIndex());
        String afterClickMyFansTitleLocator=personPage.getAfterClickMyFansBaseXpath()+personPage.getAfterClickMyFansTitleXpath();
        String afterClickMyFansTitle=engine.getText("xpath="+afterClickMyFansTitleLocator,personPage.getAfterClickMyFansTitleIndex());
        System.out.println(afterClickMyFansTitle);
        Assert.assertEquals(afterClickMyFansTitle,"我的粉丝");
        String afterClickMyFansBackLocator=personPage.getAfterClickMyFansBaseXpath()+personPage.getAfterClickMyFansBackXpath();
        engine.click("xpath="+afterClickMyFansBackLocator,personPage.getAfterClickMyFansBackIndex());
        Assert.assertTrue(engine.isElementPresent("xpath="+personPage.getCameraXpath(),personPage.getCameraIndex()));
    }

    //我的主页中点击我的粉丝内容测试
    //步骤描述：点击我的主页中我的关注，查看我关注的用户信息，例如名字、状态
    //望改进的bug描述：我的粉丝不能点击关注变为我关注的人
    @Test
    public void test_click_myFans_page(){
        engine.click("xpath="+personPage.getFansButtonXpath(),personPage.getFansButtonIndex());
        String afterClickMyFansInfoLocator=personPage.getAfterClickMyFansBaseXpath()+personPage.getAfterClickMyFansInfoXpath();
        engine.click("xpath="+afterClickMyFansInfoLocator,personPage.getAfterClickMyFansInfoIndex());
        String afterClickMyFansInfoOfNameLocator=afterClickMyFansInfoLocator+personPage.getAfterClickMyFansInfoOfNameXpath();
        String afterClickMyFansInfoOfName=engine.getText("xpath="+afterClickMyFansInfoOfNameLocator,personPage.getAfterClickMyFansInfoOfNameIndex());
        System.out.println(afterClickMyFansInfoOfName);
        String afterClickMyFansInfoOfStatusLocator=afterClickMyFansInfoLocator+personPage.getAfterClickMyFansInfoOfStatusXpath();
        String afterClickMyFansInfoOfStatus=engine.getText("xpath="+afterClickMyFansInfoOfStatusLocator,personPage.getAfterClickMyFansInfoOfStatusIndex());
        System.out.println(afterClickMyFansInfoOfStatus);
        Assert.assertEquals(afterClickMyFansInfoOfStatus,"关注");
    }


    //点击我的主页默认食物分享列表测试
    //步骤描述：获得第一个食物分享的标题，并点击，查看跳转页面的内容是否和标题一致
    //bug描述：标题与点击跳转之后的内容不一致
    @Test
    public void test_click_default_foodShare(){
        String myFirstFoodShareTitleLocator=personPage.getMyFoodShareXpath()+personPage.getMyFoodShareTitleXpath();
        String myFirstFoodShareTitle=engine.getText("xpath="+myFirstFoodShareTitleLocator,personPage.getMyFoodShareTitleIndex());
        System.out.println(myFirstFoodShareTitle);
        engine.click("xpath="+personPage.getMyFoodShareXpath(),personPage.getMyFoodShareIndex());
        String afterClickMyFoodShareInfoLocator=personPage.getBaseLocator()+personPage.getAfterClickMyFoodShareInfoXpath();
        String afterClickMyFoodShareInfo=engine.getText("xpath="+afterClickMyFoodShareInfoLocator,personPage.getAfterClickMyFoodShareInfoIndex());
        System.out.println(afterClickMyFoodShareInfo);
        Assert.assertEquals(afterClickMyFoodShareInfo,myFirstFoodShareTitle);
    }
}
