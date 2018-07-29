package com.example.li.hello4;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPermission();
    }

    private void initPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        }
    }
    /**
     * requestCode:相当于一个标志，
     * permissions：需要传进的permission，不能为空
     * grantResults：用户进行操作之后，或同意或拒绝回调的传进的两个参数;
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        // 这里实现用户操作，或同意或拒绝的逻辑
        /**
         * grantResults会传进
         * android.content.pm.PackageManager.PERMISSION_GRANTED 或 android.content.pm.PackageManager.PERMISSION_DENIED
         * 前者代表用户同意程序获取系统权限，后者代表用户拒绝程序获取系统权限
         */
        switch (requestCode) {
            case 1:
                // 处理后,的操作
                break;
        }
    }




}
