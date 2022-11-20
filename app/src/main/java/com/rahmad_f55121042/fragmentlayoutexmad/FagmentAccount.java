package com.rahmad_f55121042.fragmentlayoutexmad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FagmentAccount extends Fragment {
    View view;
    public FagmentAccount() {
    }

    @Nullable
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup countainer, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.account_fragment, countainer, false);
        return view;
    }
}