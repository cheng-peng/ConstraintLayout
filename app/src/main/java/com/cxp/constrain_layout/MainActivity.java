package com.cxp.constrain_layout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
    }

    public void clickLis(View view) {
        switch (view.getId()) {
            case R.id.main_bt1:
                // ConstraintLeft等用法
                ConstraintLeftActivity.startActivity(mContext);
                break;
            case R.id.main_bt2:
                // 比例布局
                ProportionLayoutActivity.startActivity(mContext);
                break;
            case R.id.main_bt3:
                // 辅助线
                GuidelineActivity.startActivity(mContext);
                break;
        }
    }
}
