package com.example.robustsample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.robustsample.R;
import com.meituan.robust.patch.annotaion.Add;
import com.meituan.robust.patch.annotaion.Modify;

/**
 * Created by admin on 2017/12/26.
 */

public class SecondActivity extends AppCompatActivity {
//    @Modify
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        modifyText();
    }

//    @Add
//    private void modifyText() {
//        ((TextView)findViewById(R.id.tv_content)).setText("我是热修复后显示的内容");
//    }
}
