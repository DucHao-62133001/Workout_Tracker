package vn.edu.hao.workout_tracker.models;

public class Exercise {

    private String name;
    private String muscleGroup;
    private int imageResId;

    public Exercise(String name, String muscleGroup, int imageResId) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public int getImageResId() {
        return imageResId;
    }
}