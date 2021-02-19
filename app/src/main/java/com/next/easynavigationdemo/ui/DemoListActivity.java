package com.next.easynavigationdemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.next.easynavigationdemo.R;

/**
 * Created by Administrator on 2018/7/9.
 */

public class DemoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_demo_list);
    }

    public void NoAddNavigationBar(View view) {
        startActivity(new Intent(DemoListActivity.this, NormalActivity.class));
    }


    public void AddAsFragment(View view) {
        startActivity(new Intent(DemoListActivity.this, AddAsFragmentActivity.class));
    }

    public void AddView(View view) {
        startActivity(new Intent(DemoListActivity.this, AddViewActivity.class));
    }

    public void OnWeibo(View view) {
        startActivity(new Intent(DemoListActivity.this, WeiboActivity.class));
    }

}
