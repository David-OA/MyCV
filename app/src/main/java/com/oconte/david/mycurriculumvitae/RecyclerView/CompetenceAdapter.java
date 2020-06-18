package com.oconte.david.mycurriculumvitae.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oconte.david.mycurriculumvitae.CompetenceItem;
import com.oconte.david.mycurriculumvitae.R;

import java.util.ArrayList;

public class CompetenceAdapter extends RecyclerView.Adapter<CompetenceAdapter.CompetenceViewHolder>{

    private ArrayList<CompetenceItem> CompetenceList;

    public static class CompetenceViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;


        public CompetenceViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public CompetenceAdapter(ArrayList<CompetenceItem> competenceList) {
        CompetenceList = competenceList;
    }

    @Override
    public CompetenceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.competence_item, parent, false);
        CompetenceViewHolder evh = new CompetenceViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(CompetenceViewHolder holder, int position) {
        CompetenceItem currentItem = CompetenceList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return CompetenceList.size();
    }
}
