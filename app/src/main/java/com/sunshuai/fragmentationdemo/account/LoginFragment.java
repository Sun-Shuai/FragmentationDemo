package com.sunshuai.fragmentationdemo.account;

import com.sunshuai.fragmentationdemo.R;
import com.sunshuai.fragmentationdemo.base.BaseFragment;

import butterknife.OnClick;

public class LoginFragment extends BaseFragment {


    @OnClick(R.id.btn_register)
    public void onClick() {
        start(RegisterFragment.newInstance());
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }
}
