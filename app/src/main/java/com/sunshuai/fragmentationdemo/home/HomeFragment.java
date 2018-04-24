package com.sunshuai.fragmentationdemo.home;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunshuai.fragmentationdemo.R;
import com.sunshuai.fragmentationdemo.account.LoginFragment;
import com.sunshuai.fragmentationdemo.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @OnClick(R.id.btn_login)
    public void onClick() {
        start(LoginFragment.newInstance());
    }


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
