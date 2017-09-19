package com.cxp.constrain_layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 文 件 名: ProportionLayoutActivity
 * 创 建 人: CXP
 * 创建日期: 2017-09-19 14:07
 * 描    述: 比例布局
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ProportionLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proportion_layout);
    }

    //页面跳转
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, ProportionLayoutActivity.class);
        context.startActivity(intent);
    }
}
