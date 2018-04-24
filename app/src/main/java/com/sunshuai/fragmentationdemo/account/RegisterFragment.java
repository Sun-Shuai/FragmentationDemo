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


public class RegisterFragment extends BaseFragment {

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}

