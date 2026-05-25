package vn.edu.hao.workout_tracker.models;

public class WorkoutLog {

    private String exerciseName;
    private String muscleGroup;
    private String weight;
    private String reps;
    private long timestamp;

    // Constructor rong cho Firebase
    public WorkoutLog() {
    }

    public WorkoutLog(String exerciseName, String muscleGroup,
                      String weight, String reps, long timestamp) {

        this.exerciseName = exerciseName;
        this.muscleGroup = muscleGroup;
        this.weight = weight;
        this.reps = reps;
        this.timestamp = timestamp;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}