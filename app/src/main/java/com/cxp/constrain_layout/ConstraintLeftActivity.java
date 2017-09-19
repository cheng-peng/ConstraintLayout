package com.cxp.constrain_layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 文 件 名: ConstraintLeftActivity
 * 创 建 人: CXP
 * 创建日期: 2017-09-19 10:41
 * 描    述: ConstraintLeft等用法
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ConstraintLeftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_left);
    }

    //页面跳转
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, ConstraintLeftActivity.class);
        context.startActivity(intent);
    }
}
