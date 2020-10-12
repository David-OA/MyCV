package com.oconte.david.mycurriculumvitae.Fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oconte.david.mycurriculumvitae.R;

import butterknife.BindView;

public class DetailFragment extends Fragment {

    // FOR DESIGN
    @BindView(R.id.fragment_detail_image) ImageView imageCv;
    @BindView(R.id.fragment_detail_title) TextView titleCv;
    @BindView(R.id.fragment_detail_description) TextView details;

    public static DetailFragment newInstance() {
        return (new DetailFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etudes, container, false);

        //ViewSeparator();


        return view;
    }
}
