package pagetest;

import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;

public class TestLogin extends BaseDriver {

    LoginPage loginPage;

    //输入正确的用户名密码
    @Test
    public void test01() throws InterruptedException{
        String ip = "10.7.90.221";
        String url = "http://"+ip+":11443";
        String username = "lbj1";
        String pwd = "123456";
        loginPage = new LoginPage(driver);
        loginPage.login(url,username,pwd);
    }
}