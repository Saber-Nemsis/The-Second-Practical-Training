package com.uiautomator_plus.testcase.wzj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.wyr.LoginPage;
import com.uiautomator_plus.po.wzj.AddPage;
import com.uiautomator_plus.po.wzj.CookPage;
import com.uiautomator_plus.po.wzj.EntrancePage;
import com.uiautomator_plus.po.wzj.FavoritesPage;
import com.uiautomator_plus.po.wzj.GoodsInfoPage;
import com.uiautomator_plus.po.wzj.MainPage;
import com.uiautomator_plus.po.wzj.MyFollowerPage;
import com.uiautomator_plus.po.wzj.MyFunsPage;
import com.uiautomator_plus.po.wzj.MyPage;
import com.uiautomator_plus.po.wzj.SigninPage;

import org.junit.Assert;
import org.junit.Test;

public class Testcase extends BaseTest {
    /**
     * 1.测试正常登陆
     */
    @Test
    public void testLogin(){
        Engine engine = this.getEngine();

        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        LoginPage loginPage = new LoginPage();
        loginPage.login(engine , 1);

        //断言底部栏是否存在"主页"选项按钮
        MainPage mainPage = new MainPage();
        Assert.assertTrue(engine.isDisplayed(mainPage.getMainPageXapth() , mainPage.getMainPageIndex()));
    }

    /**
     * 2.测试注册
     */
    @Test
    public void testSignin(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(getEngine() , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());
        //点击注册按钮
        entrancePage.click(getEngine() , entrancePage.getSigninButtonClassName() , entrancePage.getSigninButtonIndex());

        //注册
        SigninPage signinPage = new SigninPage();

        //断言底部是否存在注册并登录按钮
        Assert.assertTrue(engine.isDisplayed(signinPage.getSigninButtonClassName() , signinPage.getSigninButtonIndex()));
    }

    /**
     * 3.测试添加功能
     */
    @Test
    public void testAdd(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(getEngine() , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(getEngine(), 1);

        //添加物品
        AddPage addPage = new AddPage();
        addPage.add(getEngine());

        //断言当前页面是否还存在添加页面里的添加按钮
        Assert.assertTrue(engine.isDisplayed(addPage.getAddButtonClassName() , addPage.getAddButtonIndex()));
    }

    /**
     * 4.测试搜索
     */
    @Test
    public void testSearch(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(getEngine() , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(getEngine(), 1);

        //输入内容
        MainPage mainPage = new MainPage();
        mainPage.clearAndType(getEngine() , mainPage.getInputClassName() , mainPage.getInputIndex() , mainPage.getInputContent());

        Assert.assertTrue(mainPage.getInputContent().equals(engine.getText(mainPage.getInputClassName() , mainPage.getInputIndex())));
    }

    /**
     * 5.测试删除
     */
    @Test
    public void testDeleteMainPageFoods(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(getEngine() , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(getEngine(), 1);

        //先获取当前页面有多少个记录
        MainPage mainPage = new MainPage();
        int beforeDeleteCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        //点击第一条记录的删除
        mainPage.click(getEngine() , mainPage.getFirstGoodsDeleteButtonClassName() , mainPage.getFirstGoodsDeleteButtonIndex());
        //点击删除弹窗的确定
        mainPage.click(getEngine() , mainPage.getAlertButtonClassName() , mainPage.getAlertButtonIndex());

        //删除后的记录
        int afterDeleteCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        System.out.println(beforeDeleteCount + " " + afterDeleteCount);
        Assert.assertTrue(beforeDeleteCount == afterDeleteCount);
    }

    /**
     * 6.测试点击主页的速食冷冻按钮
     */
    @Test
    public void testClickFastFoodButton(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(getEngine() , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(getEngine(), 1);

        //获取主页所有记录
        MainPage mainPage = new MainPage();
        int beforeClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        //点击速食冷冻按钮
        mainPage.click(engine, mainPage.getFastFoodButtonClassName() , mainPage.getFastFoodButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 7.测试点击主页的零食饮品
     */
    @Test
    public void testClickSnacksAndDrinkButton(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(this.getEngine(), entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //获取主页所有记录
        MainPage mainPage = new MainPage();
        int beforeClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        //点击零食饮品按钮
        mainPage.click(engine , mainPage.getSnacksAndDrinkButtonClassName() , mainPage.getSnacksAndDrinkButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 8.测试点击主页的海鲜水产按钮
     */
    @Test
    public void testClickSeafoodButton(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine, entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //获取主页所有记录
        MainPage mainPage = new MainPage();
        int beforeClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        //点击海鲜水产按钮
        mainPage.click(engine , mainPage.getSeafoodButtonClassName() , mainPage.getSeafoodButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 9.测试点击主页的肉蛋食品按钮
     */
    @Test
    public void testClickMeatAndEggButton(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //获取主页所有记录
        MainPage mainPage = new MainPage();
        int beforeClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        //点击肉蛋食品按钮
        mainPage.click(engine , mainPage.getMeatAndEggButtonClassName() , mainPage.getMeatAndEggButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findElements(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 10.测试食品查看功能
     */
    @Test
    public void testClickGoods(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击一种物品
        MainPage mainPage = new MainPage();
        mainPage.click(engine , mainPage.getGoodsClassName() , mainPage.getGoodsIndex());

        //断言营养小贴士是否存在
        GoodsInfoPage goodsInfoPage = new GoodsInfoPage();
        Assert.assertTrue(engine.isDisplayed(goodsInfoPage.getRemainderClassName() , goodsInfoPage.getRemainderIndex()));
    }

    /**
     * 11.测试查看我的关注
     */
    @Test
    public void testMyFollower(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getMyClassName() , myPage.getMyIndex());

        //点击我的关注
        myPage.click(engine , myPage.getMyFollowerClassName() , myPage.getMyFollowerIndex());

        //断言顶部是否存在"你关注的人"这个元素
        MyFollowerPage myFollowerPage = new MyFollowerPage();
        Assert.assertTrue(engine.isDisplayed(myFollowerPage.getFollowButtonClassName() , myFollowerPage.getFollowButtonIndex()));
    }

    /**
     * 12.测试查看我的粉丝
     */
    @Test
    public void testMyFuns(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getMyClassName() , myPage.getMyIndex());

        //点击我的粉丝
        myPage.click(engine , myPage.getMyFunsClassName() , myPage.getMyFunsIndex());

        //断言标题
        MyFunsPage myFunsPage = new MyFunsPage();
        Assert.assertTrue(engine.isDisplayed(myFunsPage.getMyFunsTitleClassName() , myFunsPage.getMyFunsTitleIndex()));
    }

    /**
     * 13.测试我的心得
     */
    @Test
    public void testMyConclusion(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录/
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getMyClassName() , myPage.getMyIndex());

        //点击我的心得
        myPage.click(engine , myPage.getMyConclusionClassName() , myPage.getMyConclusionIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyClassName() , myPage.getMyIndex()));
    }

    /**
     * 14.测试拍照
     */
    @Test
    public void testTakePhoto(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getMyClassName() , myPage.getMyIndex());

        //点击右上方的拍照
        myPage.click(engine , myPage.getTakePhotoButtonClassName() , myPage.getTakePhotoButtonIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyClassName() , myPage.getMyIndex()));
    }

    /**
     * 15.测试设置功能
     */
    @Test
    public void testSetting(){
        Engine engine = this.getEngine();

        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getMyClassName() , myPage.getMyIndex());

        //点击右上方的设置
        myPage.click(engine , myPage.getSettingClassName() , myPage.getSettingIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyClassName() , myPage.getMyIndex()));
    }

    /**
     * 16.测试爱吃列表的查看功能
     */
    @Test
    public void testDeleteFavorite(){
        Engine engine = this.getEngine();

        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击"爱吃"
        FavoritesPage favoritesPage = new FavoritesPage();
        favoritesPage.click(engine , favoritesPage.getFavoritesClassName() , favoritesPage.getFavoritesIndex());

        //点击菜谱
        favoritesPage.click(engine , favoritesPage.getFoodClassName(), favoritesPage.getFoodIndex());

    }

    /**
     *17.测试主页饭按钮
     */
    @Test
    public void testClickCook(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击饭按钮
        MainPage mainPage = new MainPage();
        mainPage.click(engine , mainPage.getCookButtonClassName(), mainPage.getCookButtonIndex());
    }

    /**
     * 18.测试做饭页面菜谱
     */
    @Test
    public void testCook(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击做饭列表第一个菜谱
        CookPage cookPage = new CookPage();
        cookPage.click(engine,cookPage.getFoodIntruductionXpath(),0);
    }

    /**
     * 19.测试动态功能
     */
    @Test
    public void testTrend(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击我的页面
        MyPage myPage = new MyPage();
        myPage.click(engine , myPage.getActivityClassName(), myPage.getActivityIndex());


    }

    /**
     * 20.测试查看爱吃的菜谱删除功能
     */
    @Test
    public void testFavoriteDelete(){
        Engine engine = this.getEngine();
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(engine, 1);

        //点击"爱吃"
        FavoritesPage favoritesPage = new FavoritesPage();
        favoritesPage.click(engine , favoritesPage.getFavoritesClassName() , favoritesPage.getFavoritesIndex());

        //点击菜谱删除
        favoritesPage.click(engine , favoritesPage.getDeleteClassName(), favoritesPage.getDeteleIndex());
    }
}
