package com.example.workoutlog;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    totalController totalcontrol = new totalController();

    public HomeFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView numRepstxt = view.findViewById(R.id.numRepstxt);
        TextView totalKgtxt = view.findViewById(R.id.totalKgtxt);
        TextView totalSetstxt = view.findViewById(R.id.totalSetstxt);
        //setting the values to the Textfields
        int reps = totalcontrol.getReps();
        int weight = totalcontrol.getWeight();
        int sets = totalcontrol.getSets();
       numRepstxt.setText("Total Reps "  +String.valueOf(reps));
       totalKgtxt.setText("Total Weight " + String.valueOf(weight));
       totalSetstxt.setText("Total Sets "  +String.valueOf(sets));


        return view;
    }
}
