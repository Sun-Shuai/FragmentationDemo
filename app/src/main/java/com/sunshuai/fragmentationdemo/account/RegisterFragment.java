package com.sunshuai.fragmentationdemo.account;

import com.sunshuai.fragmentationdemo.R;
import com.sunshuai.fragmentationdemo.base.BaseFragment;


public class RegisterFragment extends BaseFragment {

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register;
    }
}

