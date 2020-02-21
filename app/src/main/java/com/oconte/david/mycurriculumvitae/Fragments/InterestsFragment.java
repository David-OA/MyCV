package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.R;

public class InterestsFragment extends Fragment {

    public static InterestsFragment newInstance() {
        return (new InterestsFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_interests, container, false);
    }
}
