package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.oconte.david.mycurriculumvitae.R;

import butterknife.BindView;

public class ExperiencesFragment extends Fragment {

    public static ExperiencesFragment newInstance() {
        return (new ExperiencesFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_experience, container, false);

        return view;
    }
}
