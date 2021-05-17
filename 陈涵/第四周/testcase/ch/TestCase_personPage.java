package com.appiumPlus.testcase.ch;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.ch.PersonPage;
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
        engine.clearAndType("class=android.widget.EditText" , 0 , "ch");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123456");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+personPage.getPersonButtonXpath(),0);

    }

}
