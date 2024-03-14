package com.example.schooldatabase;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PupilsAdapter extends RecyclerView.Adapter<PupilsAdapter.PupilHolder> {
    ArrayList<Learner> learners = new ArrayList<>();

    public PupilsAdapter(ArrayList<Learner> learners) { this.learners = learners; }

    @NonNull
    @Override
    public PupilHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pupil, parent, false);
        return new PupilHolder(view).linkAdapter(this); // ???
    }

    @Override
    public void onBindViewHolder(@NonNull PupilHolder holder, int position) {
        Learner learner = learners.get(position);
        holder.FullName.setText(learner.fullName);
        holder.phone.setText(learner.phone);
        holder.cardID.setText(Integer.toString(learner.cardID));
        Bitmap bitm = null;
        holder.picture.setImageBitmap(bitm);  //maybe TO DO
    }

    @Override
    public int getItemCount() { return learners.size(); }

    class PupilHolder extends RecyclerView.ViewHolder {
        TextView FullName, phone, cardID;
        ImageView picture;
        private PupilsAdapter adapter;
        public PupilHolder(@NonNull View itemView) {
            super(itemView);
            FullName = itemView.findViewById(R.id.FIO);
            phone = itemView.findViewById(R.id.phone);
            cardID = itemView.findViewById(R.id.cardID);
            picture = itemView.findViewById(R.id.picture);

            Button button = itemView.findViewById(R.id.Delete);
            button.setOnClickListener(v -> {
                adapter.learners.remove(getAdapterPosition());
                adapter.notifyItemRemoved(getAdapterPosition());
            });
        }
        public PupilHolder linkAdapter(PupilsAdapter adapter) {
            this.adapter = adapter;
            return this;
        }
    }
}
