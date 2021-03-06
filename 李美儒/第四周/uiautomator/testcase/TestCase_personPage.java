package com.uiautomator_plus.testcase.lmr;

import android.os.RemoteException;
import android.view.KeyEvent;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiObject2;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.lmr.EntrancePage;
import com.uiautomator_plus.po.lmr.LoginPage;
import com.uiautomator_plus.po.lmr.MainPage;
import com.uiautomator_plus.po.lmr.PersonPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.util.Objects.isNull;

public class TestCase_personPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    PersonPage personPage=new PersonPage();
    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"lmr");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }

    //我的主页中关注测试
    //步骤描述：点击我的主页中关注，查看跳转页面的标题是否符合，关注用户的名字和状态
    @Test
    public void test_click_myFollow(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("text="+personPage.getMyFollowText(),personPage.getMyFollowIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFollowTitleText(),personPage.getClickMyFollowTitleIndex()));
        String clickMyFollowTitle=getEngine().getText("text="+personPage.getClickMyFollowTitleText(),personPage.getClickMyFollowTitleIndex());
        Assert.assertEquals("你关注的人",clickMyFollowTitle);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFollowUserNameText(),personPage.getClickMyFollowUserNameIndex()));
        String clickMyFollowUserName=getEngine().getText("text="+personPage.getClickMyFollowUserNameText(),personPage.getClickMyFollowUserNameIndex());
        Assert.assertEquals("用户名",clickMyFollowUserName);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFollowUserStatusText(),personPage.getClickMyFollowUserStatusIndex()));
        String clickMyFollowUserStatus=getEngine().getText("text="+personPage.getClickMyFollowUserStatusText(),personPage.getClickMyFollowUserStatusIndex());
        Assert.assertEquals("已关注",clickMyFollowUserStatus);
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
    }


    //我的主页我的粉丝测试
    //步骤描述：点击我的，点击我的粉丝，查看跳转界面的标题，用户名字和状态
    @Test
    public void test_click_myFans(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("text="+personPage.getMyFansText(),personPage.getMyFansIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFansTitleText(),personPage.getClickMyFansTitleIndex()));
        String clickMyFansTitle=getEngine().getText("text="+personPage.getClickMyFansTitleText(),personPage.getClickMyFansTitleIndex());
        Assert.assertEquals("我的粉丝",clickMyFansTitle);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFansUserNameText(),personPage.getClickMyFansUserNameIndex()));
        String clickMyFansUserName=getEngine().getText("text="+personPage.getClickMyFansUserNameText(),personPage.getClickMyFansUserNameIndex());
        Assert.assertEquals("用户名",clickMyFansUserName);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFansUserStatusText(),personPage.getClickMyFansUserStatusIndex()));
        String clickMyFansUserStatus=getEngine().getText("text="+personPage.getClickMyFansUserStatusText(),personPage.getClickMyFansUserStatusIndex());
        Assert.assertEquals("关注",clickMyFansUserStatus);
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
    }

    //我的主页我的心得测试
    //步骤描述：点击我的，点击我的心得
    //bug描述：点击我的心得按键没有反应
    @Test
    public void test_click_myFeelings(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("text="+personPage.getMyFeelingsText(),personPage.getMyFeelingIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+personPage.getPersonPageUnameText(),personPage.getPersonPageUnameIndex()));
    }

    //我的主页我爱吃的食物测试
    //步骤描述：点击我的，点击我爱吃的食物中第一个，查看内容
    //bug描述：食物的具体介绍内容和食物名字不相符
    @Test
    public void test_click_myFavoriteFood(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        String expectedFavotiteFood=getEngine().getText("text="+personPage.getMyFirstFavoriteFoodText(),personPage.getMyFirstFavoriteFoodIndex());
        getEngine().click("text="+personPage.getMyFirstFavoriteFoodText(),personPage.getMyFirstFavoriteFoodIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFavoriteFoodText(),personPage.getClickMyFavoriteFoodIndex()));
        String atualFavoriteFood=getEngine().getText("text="+personPage.getClickMyFavoriteFoodText(),personPage.getClickMyFavoriteFoodIndex());
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
        Assert.assertEquals(expectedFavotiteFood,atualFavoriteFood);
    }

    //我的主页设置按钮测试
    //步骤描述：点击我的，点击设置按钮
    //bug描述：点击设置按钮没有反应
    @Test
    public void test_click_setting(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("class="+personPage.getSettingButtonClassName(),personPage.getSettingButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+personPage.getPersonPageUnameText(),personPage.getPersonPageUnameIndex()));
    }

    //我的主页相机按钮测试
    //步骤描述：点击我的，点击相机按钮
    //bug描述：点击相机按钮没有反应
    @Test
    public void test_click_camera(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("class="+personPage.getCameraButtonClassName(),personPage.getCameraButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+personPage.getPersonPageUnameText(),personPage.getPersonPageUnameIndex()));
    }

    //我的主页关注用户测试
    //步骤描述：点击我的，点击关注，点击任意一个用户，查看用户的具体介绍
    @Test
    public void test_click_myFollow_followProfile(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("text="+personPage.getMyFollowText(),personPage.getMyFollowIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getClickMyFollowTitleText(),personPage.getClickMyFollowTitleIndex()));
        String clickMyFollowTitle=getEngine().getText("text="+personPage.getClickMyFollowTitleText(),personPage.getClickMyFollowTitleIndex());
        Assert.assertEquals("你关注的人",clickMyFollowTitle);
        getEngine().click("text="+personPage.getClickMyFollowUserNameText(),personPage.getClickMyFollowUserNameIndex());
        String clickMyFollowUserName=getEngine().getText("text="+personPage.getClickMyFollowUserNameText(),personPage.getClickMyFollowUserNameIndex());
        Assert.assertEquals("用户名",clickMyFollowUserName);
        String clickMyFollowUserStatus=getEngine().getText("text="+personPage.getClickMyFollowUserStatusText(),personPage.getClickMyFollowUserStatusIndex());
        Assert.assertEquals("已关注",clickMyFollowUserStatus);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getMyFirstFavoriteFoodText(),personPage.getMyFirstFavoriteFoodIndex()));
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
    }

    //我的主页我的粉丝用户测试
    //步骤描述：点击我的，点击我的粉丝，点击任意一个用户，查看用户的具体介绍
    @Test
    public void test_click_myFans_fansProfile(){
        getEngine().click("text="+personPage.getPersonPageText(),personPage.getPersonPageIndex());
        getEngine().click("text="+personPage.getMyFansText(),personPage.getMyFansIndex());
        String clickMyFansTitle=getEngine().getText("text="+personPage.getClickMyFansTitleText(),personPage.getClickMyFansTitleIndex());
        Assert.assertEquals("我的粉丝",clickMyFansTitle);
        getEngine().click("text="+personPage.getClickMyFansUserNameText(),personPage.getClickMyFansUserNameIndex());
        String clickMyFansUserName=getEngine().getText("text="+personPage.getClickMyFansUserNameText(),personPage.getClickMyFansUserNameIndex());
        Assert.assertEquals("用户名",clickMyFansUserName);
        String clickMyFansUserStatus=getEngine().getText("text="+personPage.getClickMyFansUserStatusText(),personPage.getClickMyFansUserStatusIndex());
        Assert.assertEquals("关注",clickMyFansUserStatus);
        Assert.assertTrue(getEngine().isElementPresent("text="+personPage.getMyFirstFavoriteFoodText(),personPage.getMyFirstFavoriteFoodIndex()));
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
    }
    @After
    public void quit() {
        if (this.getDevice() != null) {
            getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
            getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
            getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
        }
    }
}
