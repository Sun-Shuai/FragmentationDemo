package com.sunshuai.fragmentationdemo.account;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunshuai.fragmentationdemo.R;
import com.sunshuai.fragmentationdemo.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment {


    @OnClick(R.id.btn_register)
    public void onClick() {
        start(RegisterFragment.newInstance());
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
