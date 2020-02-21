package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.R;

public class EtudesFragment extends Fragment {

    public static EtudesFragment newInstance() {
        return (new EtudesFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_etudes, container, false);
    }
}
