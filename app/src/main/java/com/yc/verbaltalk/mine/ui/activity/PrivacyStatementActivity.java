package com.yc.verbaltalk.mine.ui.activity;

import android.os.Bundle;

import com.yc.verbaltalk.R;
import com.yc.verbaltalk.base.activity.BaseSameActivity;

public class PrivacyStatementActivity extends BaseSameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_statement);
    }

    @Override
    protected String offerActivityTitle() {
        return "恋爱话术宝隐私声明";
    }
}
