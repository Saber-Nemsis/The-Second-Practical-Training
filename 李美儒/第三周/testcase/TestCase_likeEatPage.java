package com.appium_plus.testcase.lmr;
import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.LikeEatPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_likeEatPage extends BaseTest {
    public LikeEatPage likeEatPage;
    @BeforeClass
    public void initPage(){
        likeEatPage=new LikeEatPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "123");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+likeEatPage.getLikeEatButtonXpath(),0);

    }

    //搜索我的收藏的搜索框测试
    //步骤描述：在搜索框输入食物名称，点击回车，查看搜索结果,查看搜索框内的内容
    //bug描述：当按下Enter键进行搜索之后，跳转到新的界面，并且搜索框默认为春菜，刚刚搜索的内容没有了
    @Test
    public void test_search_myFavotite(){
        String searchLikeFoodName="黄瓜";
        engine.clearAndType("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex(),searchLikeFoodName);
        engine.click("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex());
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String searchAfterEnterLocator=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterTextXpath();
        String searchAfterEnterText=engine.getText("xpath="+searchAfterEnterLocator,0);
        System.out.println(searchAfterEnterText);
        Assert.assertEquals(searchLikeFoodName,searchAfterEnterText);
    }

    //搜索我的收藏跳转之后的搜索框测试
    //步骤描述：在搜索框输入食物名称，点击回车，查看搜索结果，如果搜索框的结果默认，那么重新进行输入搜索，查看此时能否起到筛选作用
    //bug描述：在爱吃的主页进行搜索之后，跳转到另一个界面，此时搜索框的搜索内容为默认的，再次输入想要搜索的内容时，并未起到筛选作用
    @Test
    public void test_search_myFavotite_again_type(){
        String searchLikeFoodName="黄瓜";
        engine.clearAndType("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex(),searchLikeFoodName);
        engine.click("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex());
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String searchAfterEnterLocator=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterTextXpath();
        engine.clearAndType("xpath="+searchAfterEnterLocator,0,searchLikeFoodName);
        engine.click("xpath="+searchAfterEnterLocator,0);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String searchAfterEnterText=engine.getText("xpath="+searchAfterEnterLocator,0);
        System.out.println(searchAfterEnterText);
        Assert.assertEquals(searchLikeFoodName,searchAfterEnterText);
        String searchAfterEnterFirstNameXpath=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterFirstFoodNameXpath();
        String searchAfterEnterFirstName=engine.getText("xpath="+searchAfterEnterFirstNameXpath,0);
        System.out.println(searchAfterEnterFirstName);
        Assert.assertEquals(searchLikeFoodName,searchAfterEnterFirstName);
//        String searchAfterEnterList=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterFoodListXpath();
//        engine.click("xpath="+searchAfterEnterList,0);

    }

    //搜素我的收藏跳转之后的食物列表测试
    //步骤描述：在爱吃主页的搜索框输入想要搜索的食物，跳转之后发现搜索框会变为默认值，测试下面的食物显示是否能正常跳转
    //bug描述：可以正常跳转，但对应的名字不一致
    @Test
    public void test_search_myFavotite_clickDefault(){
        String searchLikeFoodName="黄瓜";
        engine.clearAndType("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex(),searchLikeFoodName);
        engine.click("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex());
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String searchAfterEnterFirstNameXpath=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterFirstFoodNameXpath();
        String searchAfterEnterFirstName=engine.getText("xpath="+searchAfterEnterFirstNameXpath,0);
        System.out.println(searchAfterEnterFirstName);
        String searchAfterEnterList=likeEatPage.getBaseLocator()+likeEatPage.getSearchAfterEnterFoodListXpath();
        engine.click("xpath="+searchAfterEnterList,0);
        String searchClickDefaultFirstFoodName= engine.getText("xpath="+likeEatPage.getSearchClickDefaultFirstFoodNameXpath(),1);
        System.out.print(searchClickDefaultFirstFoodName);
        Assert.assertEquals(searchAfterEnterFirstName,searchClickDefaultFirstFoodName);

    }

    //对爱吃主页显示食物简介展示和跳转进行测试
    //步骤描述：获得爱吃主页默认第一个食物名称，并点击，看跳转以后的食物介绍是否一致
    //bug描述：爱吃主页显示的食物名称与点击跳转之后对应的食物名称不一致
    @Test
    public void test(){
        String mainFirstLikeFoodName=engine.getText("xpath="+ likeEatPage.getLikeEatFoodListXpath()+"/android.widget.TextView",0);
        System.out.println(mainFirstLikeFoodName);
        engine.click("xpath="+likeEatPage.getLikeEatFoodListXpath(),likeEatPage.getLikeEatFoodIndex());
        String clickMainDefaultFirstName=engine.getText("xpath="+likeEatPage.getClickMainDefaultFirstNameXpath(),1);
        System.out.println(clickMainDefaultFirstName);
    }

}
