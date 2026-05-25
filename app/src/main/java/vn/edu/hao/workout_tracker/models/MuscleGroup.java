package vn.edu.hao.workout_tracker.models;

public class MuscleGroup {

    // ten nhom co
    private String name;

    // so bai tap
    private String totalExercises;

    // anh nhom co
    private int imageResId;

    public MuscleGroup(String name, String totalExercises, int imageResId) {
        this.name = name;
        this.totalExercises = totalExercises;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getTotalExercises() {
        return totalExercises;
    }

    public int getImageResId() {
        return imageResId;
    }
}