package com.example.robustsample;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.robustsample.patch.PatchManipulateImp;
import com.example.robustsample.patch.RobustCallBackSample;
import com.example.robustsample.ui.SecondActivity;
import com.meituan.robust.PatchExecutor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE},0);
        setListener();

    }

    private void setListener() {

            findViewById(R.id.btn_load_patch).setOnClickListener(view->
                    new PatchExecutor(this,new PatchManipulateImp(),new RobustCallBackSample()).start());
            findViewById(R.id.btn_start_second).setOnClickListener(view->startActivity(new Intent(this, SecondActivity.class)));
    }
}
