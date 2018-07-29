package com.example.li.hello4;

import android.os.Environment;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@RunWith(AndroidJUnit4.class)
public class Test2 extends Ui012_Basic {

    @Before
    public void setup(){
//        device.pressBack();
//        device.pressBack();
//        device.pressBack();
//        device.pressHome();
    }

    @After
    public void teardown(){
//        device.pressBack();
//        device.pressBack();
//        device.pressBack();
//        device.pressHome();
    }

    @Test
    public void testnewapi() throws IOException {
        File file;
        file=new File(Environment.getExternalStorageDirectory()+ File.separator + "uidumo.xml");
        if (file.exists()){
            file.delete();
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            OutputStream out = new FileOutputStream(file, true);
            device.dumpWindowHierarchy(out);
        }




    }


}
