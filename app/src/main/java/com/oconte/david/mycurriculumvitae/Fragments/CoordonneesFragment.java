package com.oconte.david.mycurriculumvitae.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoordonneesFragment extends Fragment {


    public static CoordonneesFragment newInstance() {
        return (new CoordonneesFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_coordonnees, container, false);



    }

}
