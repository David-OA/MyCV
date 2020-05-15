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
    @BindView (R.id.recyclerView2) RecyclerView mRecyclerView2;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);


            ArrayList<CompetenceItem> competenceList = new ArrayList<>();
            competenceList.add(new CompetenceItem(R.drawable.android_studio, "Android Studio", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.github, "Git et GitHub", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.drupal, "Drupal 7 et 8", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.html5_css3, "HTML5 et CSS3", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.java, "Java", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.symfony, "Symfony", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.php_mysql, "PHP et MySQL", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.canva, "Canva", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.gimp, "Gimp", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "SIG : Cart@Jour, mapinfo", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "SIG : Gérémi, Qgis", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.david26, "Saphir pour l'eau potable", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.autocad, "Autocad", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.microsoft_office, "La suite Microsoft", "Line 2"));
            competenceList.add(new CompetenceItem(R.drawable.open_office, "Open Office", "Line 2"));

            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(getContext());
            mAdapter = new CompetenceAdapter(competenceList);

            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ADMININISTRATIVE LIST

        ArrayList<CompetenceItem> competenceList2 = new ArrayList<>();
        competenceList2.add(new CompetenceItem(R.drawable.android_studio, "Android Studio", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.github, "Git et GitHub", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.drupal, "Drupal 7 et 8", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.html5_css3, "HTML5 et CSS3", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.java, "Java", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.symfony, "Symfony", "Line 2"));
        competenceList2.add(new CompetenceItem(R.drawable.php_mysql, "PHP et MySQL", "Line 2"));

        mRecyclerView2.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CompetenceAdapter(competenceList2);

        mRecyclerView2.setLayoutManager(mLayoutManager);
        mRecyclerView2.setAdapter(mAdapter);

        return view;

    }
}
