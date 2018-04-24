package com.sunshuai.fragmentationdemo.home;


import com.sunshuai.fragmentationdemo.R;
import com.sunshuai.fragmentationdemo.account.LoginFragment;
import com.sunshuai.fragmentationdemo.base.BaseFragment;

import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @OnClick(R.id.btn_login)
    public void onClick() {
        start(LoginFragment.newInstance());
    }


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }
}
