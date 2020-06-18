package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.RecyclerView.CompetenceAdapter;
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

        this.recyclerViewSetting();


        return view;
    }

    public void recyclerViewSetting() {
        ArrayList<CompetenceItem> competenceList = new ArrayList<>();

        //COMPETENCES

        //Logicielles
        competenceList.add(new CompetenceItem(R.drawable.android_studio, "Android Studio", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.github, "Git et GitHub", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.drupal, "Drupal 7 et 8", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.html5_css3, "HTML5 et CSS3", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.java, "Java", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.symfony, "Symfony", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.php_mysql, "PHP et MySQL", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.canva, "Canva", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.gimp, "Gimp", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.david26, "SIG : Cart@Jour, mapinfo", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.david26, "SIG : Gérémi, Qgis", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.david26, "Saphir pour l'eau potable", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.autocad, "Autocad", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.microsoft_office, "La suite Microsoft", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.open_office, "Open Office", "Logicielles"));

        //Administratives need to change pictures
        competenceList.add(new CompetenceItem(R.drawable.android_studio, "Site internet", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.github, "Gestion d'une base de données en Biologie", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.drupal, "Communication au près des usagers", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.html5_css3, "Commissions avec des élus", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.java, "Réunions publics et professionnelles", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.symfony, "Rapports et collectes des données sur logiciels", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.php_mysql, "Budget prévisionnel et facturation", "Administratives"));

        //Techniques need to change pictures
        competenceList.add(new CompetenceItem(R.drawable.android_studio, "intervention_et_suivi_sur_des_cas_sp_ciaux_ex_une_laiterie", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.github, "Mesure et réglages en station et réservoir.", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.drupal, "Suivi et contrôle de chantier", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.html5_css3, "Chiffrage de travaux", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.java, "Recherche et réparation de fuites sur réseau.", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.symfony, "Mise en place de la télé relève: type sofrel", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.php_mysql, "Participation aux groupes de travail, départementale, régionnale et nationnale.", "Techniques"));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CompetenceAdapter(competenceList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
