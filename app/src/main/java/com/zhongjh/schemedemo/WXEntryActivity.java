package com.zhongjh.schemedemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 这里获取到值后，将值缓存下来，让上一个MainActivity能直接使用
 * @author zhongjh
 * @date 2021/10/8
 */
public class WXEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
    }

}
