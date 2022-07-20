package com.example.workoutlog;

//this class will keep track of the users performance
public class Totals {

    private static int totalWeight;
    private static int totalSets;
    private static int totalReps;


    public void addASet(){
        totalSets++;
    }


    public int getTotalSets() {
        return totalSets;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalReps(int totalReps) {
        this.totalReps += totalReps;
    }

    public int getTotalReps() {
        return totalReps;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight += totalWeight;
    }
}
