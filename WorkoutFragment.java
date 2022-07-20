package com.example.workoutlog;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WorkoutFragment extends Fragment {

    private Button donebtn;
    private EditText Weighttxt;
    private EditText Repstxt;
    totalController totalcontrol = new totalController();

    public void WorkFragment(){}



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout,container,false);
        view.findViewById(R.id.fragmentContainerView);
        donebtn=view.findViewById(R.id.dontBtn);
        Weighttxt = view.findViewById(R.id.Weighttxt);
        Repstxt = view.findViewById(R.id.Repstxt);

        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weight  = Weighttxt.getText().toString();
                String reps = Repstxt.getText().toString();
                //now adding what the user enetered to the totals
                totalcontrol.addToTotal(Integer.parseInt(weight), Integer.parseInt(reps));
            }
        });

        return view;
    }



}
