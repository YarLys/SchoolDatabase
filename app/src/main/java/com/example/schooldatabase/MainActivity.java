package com.example.schooldatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] dataFIO = {"YarLys", "ArtBez", "AntLaz"};
    String[] dataPhone = {"+79022341232", "+32423123", "+1234324234"};
    int[] dataCardID = {12301, 231, 40392};
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*PupilsList pupilsList = new PupilsList();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        if (!pupilsList.isAdded()) {
            ft.add(R.id.pupilsList, pupilsList);
        }
        ft.commit();*/

        RecyclerView recyclerView = findViewById(R.id.RV1);
        ArrayList<Learner> learners = new ArrayList<>();
        //learners.add(new Learner("Test", "+2131231", 123123, null));
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // ???
        PupilsAdapter adapter = new PupilsAdapter(learners);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learners.add(new Learner(dataFIO[counter%3], dataPhone[counter%3], dataCardID[counter%3], null));
                counter++;
                adapter.notifyItemInserted(learners.size()-1);
            }
        });
    }
}