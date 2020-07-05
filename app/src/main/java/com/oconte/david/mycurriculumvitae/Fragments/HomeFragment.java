package com.oconte.david.mycurriculumvitae.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oconte.david.mycurriculumvitae.ItemClickSupport;
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


        //this.configureOnClickRecyclerView();

        return view;
    }

    private void configureOnClickRecyclerView(){
        ItemClickSupport.addTo(mRecyclerView, R.layout.competence_item)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                        Intent intent = new Intent(getContext(),DetailFragment.class);

                        startActivity(intent);
                    }
                });
    }

    public void recyclerViewSetting() {
        ArrayList<CompetenceItem> competenceList = new ArrayList<>();

        //COMPETENCES

        //Logicielles
        competenceList.add(new CompetenceItem(R.drawable.android_studio, "Android Studio", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.github, "Git et GitHub", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.ubuntu, "Linux - Ubuntu", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.drupal, "Drupal 7 et 8", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.html5_css3, "HTML5 et CSS3", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.java, "Java", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.symfony, "Symfony", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.php_mysql, "PHP et MySQL", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.canva, "Canva", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.gimp, "Gimp", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.g2c, "SIG : Cart@Jour, mapinfo", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.qgis, "SIG : Gérémi, Qgis", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.saphir, "Saphir pour l'eau potable", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.autocad, "Autocad", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.microsoft_office, "La suite Microsoft", "Logicielles"));
        competenceList.add(new CompetenceItem(R.drawable.open_office, "Open Office", "Logicielles"));

        //Administratives need to change pictures
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Site internet", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Gestion d'une base de données en Biologie", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Communication au près des usagers", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Commissions avec des élus", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Réunions publics et professionnelles", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Rapports et collectes des données sur logiciels", "Administratives"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Budget prévisionnel et facturation", "Administratives"));

        //Techniques need to change pictures
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Intervention et suivi sur des cas spéciaux (ex : une laiterie)", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Mesure et réglages en station et réservoir.", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Suivi et contrôle de chantier", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Chiffrage de travaux", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Recherche et réparation de fuites sur réseau.", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Mise en place de la télé relève: type sofrel", "Techniques"));
        competenceList.add(new CompetenceItem(R.drawable.mountains, "Participation aux groupes de travail, départementale, régionnale et nationnale.", "Techniques"));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CompetenceAdapter(competenceList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}
