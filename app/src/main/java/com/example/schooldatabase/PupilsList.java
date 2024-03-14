package com.example.schooldatabase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PupilsList extends Fragment {
    String[] dataFIO = {"YarLys", "ArtBez", "AntLaz"};
    String[] dataPhone = {"+79022341232", "+32423123", "+1234324234"};
    int[] dataCardID = {12301, 231, 40392};
    int counter = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pupilslist_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.RV1);
        ArrayList<Learner> learners = new ArrayList<>();
        learners.add(new Learner("Test", "+2131231", 123123, null));
        PupilsAdapter adapter = new PupilsAdapter(learners);
        recyclerView.setAdapter(adapter);


        return view;
    }
}
