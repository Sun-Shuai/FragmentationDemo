package com.sunshuai.fragmentationdemo;

import android.os.Bundle;
import android.widget.Toast;

import com.sunshuai.fragmentationdemo.base.BaseActivity;
import com.sunshuai.fragmentationdemo.base.BaseFragment;
import com.sunshuai.fragmentationdemo.home.HomeFragment;

public class MainActivity extends BaseActivity {

    private static final long WAIT_TIME = 2000L;
    private long TOUCH_TIME = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseFragment fragment = findFragment(HomeFragment.class);
        if (fragment == null) {
            loadRootFragment(R.id.fl_container, HomeFragment.newInstance());
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onBackPressedSupport() {

        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
                finish();
            } else {
                TOUCH_TIME = System.currentTimeMillis();
                Toast.makeText(this, "再次点击退出", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
