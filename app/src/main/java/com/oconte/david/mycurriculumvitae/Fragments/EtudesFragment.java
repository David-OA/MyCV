package com.oconte.david.mycurriculumvitae.Fragments;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.R;

import butterknife.BindView;

public class EtudesFragment extends Fragment {

    @BindView(R.id.separator) View viewSeparator;

    public static EtudesFragment newInstance() {
        return (new EtudesFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etudes, container, false);

        //ViewSeparator();


        return view;
    }

    private void ViewSeparator(){
        AnimationDrawable animationDrawable = (AnimationDrawable) viewSeparator.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

    }
}
