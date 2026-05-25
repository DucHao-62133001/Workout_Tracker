package vn.edu.hao.workout_tracker.models;

public class Exercise {

    // ten bai tap
    private String name;

    // huong dan ngan
    private String description;

    // anh bai tap
    private int imageResId;

    // nhom co
    private String muscleGroup;

    public Exercise(String name, String description, int imageResId, String muscleGroup) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
        this.muscleGroup = muscleGroup;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }
}