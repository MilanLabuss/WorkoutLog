package com.example.workoutlog;


public class totalController {

    static Totals total = new Totals();        //object to store the totals of the workout

    public void addToTotal(int Weight, int Reps){
        total.setTotalWeight(Weight);
        total.addASet();
        total.setTotalReps(Reps);
    }

    public int getReps(){
        return total.getTotalReps();
    }
    public int getWeight(){
        return total.getTotalWeight();
    }
    public int getSets(){
        return total.getTotalSets();
    }


}
