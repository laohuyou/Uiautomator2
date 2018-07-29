package com.example.li.hello4;

import android.os.RemoteException;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.view.KeyEvent;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test1 extends Ui012_Basic {

    @Test
    public void test1() throws UiObjectNotFoundException, RemoteException {

        UiObject web= device.findObject(new UiSelector().text("浏览器"));
        UiObject seturl= device.findObject(new UiSelector().resourceId("com.android.browser:id/url"));
        UiObject edittext =device.findObject(new UiSelector().className("android.widget.EditText").index(0));
        web.click();
        sleep(2000);
        seturl.click();
        seturl.setText("www.baidu.com");
        device.pressKeyCode(KeyEvent.KEYCODE_ENTER);
        sleep(2000);
        edittext.click();
        edittext.setText("你好");



        device.pressKeyCode(KeyEvent.KEYCODE_ENTER);
//        sleep(2000);
//        device.pressKeyCode(KeyEvent.KEYCODE_ENTER);
//        device.pressEnter();
//        device.pressRecentApps();

        sleep(200);
    }




}
