package com.example.li.hello4;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(AndroidJUnit4.class)
public class Test4 extends Ui012_Basic {


    @Before
    public void setUp() {
        device();
    }

    @Test
    public void testBy() {
        UiObject2 sz = device.findObject(By.text("设置"));
        sz.click();

    }

    @Test
    public void testDepyh() {
        UiObject2 jsq = device.findObject(By.depth(7).text("1"));
        Log.v("By","DEPTH:By.depth(7)  TEXT=" + jsq.getText());

        UiObject2 jsq2=device.findObject(By.text("1").depth(3,7));
        Log.v("By","DEPTH:By.text(\"1\").depth(3,7)  TEXT=" + jsq2.getText());

        UiObject2 jsq3=device.findObject(By.text("1").maxDepth(7));
        Log.v("By","DEPTH:By.text(\"1\").maxDepth(7)  TEXT=" + jsq3.getText());

        UiObject2 jsq4=device.findObject(By.text("1").minDepth(5));
        Log.v("By","DEPTH:By.text(\"1\").minDepth(5)  TEXT=" + jsq4.getText());


    }


    @Test
    public void testApi() throws IOException {
        device.executeShellCommand("am start -n com.android.settings/.Settings");
        UiObject2 XianShi=device.findObject(By.text("显示"));
//        XianShi.wait(Until.findObject(By.text("显示")),20000);
        device.wait(Until.findObject(By.text("显示")),20000);
        XianShi.click();


    }


}
