package com.uiu.ac.bd.bloodbank.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uiu.ac.bd.bloodbank.R;

/**
 * Created by  Hasan Sonet on 11/20/2018
 */
public class FragmentLogin extends Fragment {


    public FragmentLogin() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.demo, container, false);

        if (rootView != null) {


        }

        return rootView;
    }
}
