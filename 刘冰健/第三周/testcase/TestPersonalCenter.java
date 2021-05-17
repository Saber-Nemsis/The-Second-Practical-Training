package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import com.appiumPlus.po.PersonalCenterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPersonalCenter extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private PersonalCenterPage personalCenterPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        personalCenterPage = new PersonalCenterPage();
        engine.click(personalCenterPage.getMineButton(),0);
    }

    //点击设置按钮，查看能否进入设置界面
    @Test
    public void test01(){
        engine.click(personalCenterPage.getSet(),0);
        Assert.assertFalse(engine.isElementPresent(personalCenterPage.getSubscription(),0));
    }

    //进入关注界面，查看关注用户数量是否和显示的数量一致
    @Test
    public void test02(){
        int num = Integer.parseInt(engine.getText("xpath/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]", 0));
        engine.click(personalCenterPage.getSubscription(),0);
        boolean present = engine.isElementPresent("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ScrollView/android.view.View/android.view.View", num);
        Assert.assertTrue(present);
    }

    //进入关注界面，点击一个已关注用户，再次点击已关注，查看能否取消关注
    @Test
    public void test03(){
        String user = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.TextView";
        engine.click(personalCenterPage.getSubscription(),0);
        engine.click(user,0);
        String user2 = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View";
        engine.click(user2,0);
        Assert.assertEquals(engine.getText(user2,0),"关注");
    }

    //进入粉丝界面，查看粉丝数量是否和显示数量一致
    @Test
    public void test04(){
        int num = Integer.parseInt(engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]", 0));
        engine.click(personalCenterPage.getMyFuns(),0);
        boolean present = engine.isElementPresent("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View", num+1);
        Assert.assertFalse(present);
    }

    //选择一个未关注的粉丝，点击关注，查看能否关注
    @Test
    public void test05(){
        engine.click(personalCenterPage.getMyFuns(),0);
        String user = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.TextView";
        engine.click(user,0);
        String user2 = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View";
        engine.click(user2,0);
        Assert.assertEquals(engine.getText(user2,0),"已关注");
    }
}
