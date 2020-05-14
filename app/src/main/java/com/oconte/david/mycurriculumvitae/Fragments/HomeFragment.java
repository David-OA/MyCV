package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.CompetenceAdapter;
import com.oconte.david.mycurriculumvitae.CompetenceItem;
import com.oconte.david.mycurriculumvitae.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        return (new HomeFragment());
    }

    @BindView (R.id.recyclerView) RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);


            ArrayList<CompetenceItem> competenceList = new ArrayList<>();
            competenceList.add(new CompetenceItem(R.drawable.david26, "Android Studio", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Git et GitHub", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Drupal 7 et 8", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "HTML5 et CSS3", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Java", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Symfony", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "PHP et MySQL", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Canva", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Gimp", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "SIG : Cart@Jour, Gérémi, mapinfo et Qgis", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Saphir pour l'eau potable", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Autocad", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "La suite Microsoft et Open Office", "Line 2"));

            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(getContext());
            mAdapter = new CompetenceAdapter(competenceList);

            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);

        return view;

    }
}
