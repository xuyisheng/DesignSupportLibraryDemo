package com.hujiang.designsupportlibrarydemo;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

public class DetailActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        adjustToolbarHeight();
        setSupportActionBar(toolbar);
    }

    /**
     * 调整Toolbar的高度为:statusbarHeight + actionbarHeight
     */
    private void adjustToolbarHeight() {
        int toolbarHeight = CommonUtil.getStatusBarHeight(this) + CommonUtil.getActionbarHeight
                (this);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        layoutParams.height = toolbarHeight;
        toolbar.setLayoutParams(layoutParams);
    }

    public void checkin(View view) {
        Snackbar.make(view, "checkin success!", Snackbar.LENGTH_SHORT).show();
    }
}
