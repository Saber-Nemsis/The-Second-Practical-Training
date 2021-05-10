package com.uiautomator_plus.core;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    private UiDevice device;
    private Engine engine;

    @Before
    public void doBeforClass(){
        try{
            this.newDevice();
            this.engine = new Engine(this.device);
            UiObject2 app=device.findObject(By.text("冰箱新食客"));
            app.click();
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @After
    public void doAfterClass() {
        if (this.device != null) {
        }
    }


    private UiDevice newDevice() {
        try {
            //获取设备，连接模拟器
            device= UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

            Thread.sleep(1000);

            this.device = device;
        }catch (Exception e){
            e.printStackTrace();
        }
        return device;
    }

    protected UiDevice getDevice(){
        return this.device;
    }

    protected Engine getEngine(){
        return this.engine;
    }


}
