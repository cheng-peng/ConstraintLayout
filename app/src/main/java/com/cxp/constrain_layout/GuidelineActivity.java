package com.cxp.constrain_layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 文 件 名: GuidelineActivity
 * 创 建 人: CXP
 * 创建日期: 2017-09-19 15:32
 * 描    述: 辅助线
 * layout_constraintGuide_begin=30dp 距离顶部30dp的地方有个辅助线，根据orientation来决定是横向还是纵向。
 * layout_constraintGuide_end=30dp   距离底部30dp的地方有个辅助线，根据orientation来决定是横向还是纵向。
 * layout_constraintGuide_percent=0.8 即为距离顶部80%的地方有个辅助线，根据orientation来决定是横向还是纵向。
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class GuidelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
    }

    //页面跳转
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, GuidelineActivity.class);
        context.startActivity(intent);
    }
}
