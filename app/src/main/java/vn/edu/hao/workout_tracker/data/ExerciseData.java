package vn.edu.hao.workout_tracker.data;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.R;
import vn.edu.hao.workout_tracker.models.Exercise;
import vn.edu.hao.workout_tracker.models.MuscleGroup;

public class ExerciseData {

    // ham tao danh sach nhom co
    public static ArrayList<MuscleGroup> getMuscleGroups() {

        // tao list rong
        ArrayList<MuscleGroup> muscleList = new ArrayList<>();

        // them nhom co vao list
        muscleList.add(
                new MuscleGroup(
                        "Bụng",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Lưng",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Ngực",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Chân",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Cẳng Chân",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Cánh Tay",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Tay Trước",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Tay sau",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Vai",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );

        return muscleList;
    }

    // ham lay danh sach bai tap theo nhom co
    public static ArrayList<Exercise> getExercisesByMuscle(String muscleName) {

        // tao list rong
        ArrayList<Exercise> exerciseList = new ArrayList<>();

        // nhom Ngực
        if (muscleName.equals("Ngực")) {

            exerciseList.add(
                    new Exercise(
                            "Bench Press",
                            "Classic chest pressing movement",
                            R.drawable.ic_launcher_foreground,
                            "Ngực"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Incline Dumbbell Press",
                            "Upper chest focused exercise",
                            R.drawable.ic_launcher_foreground,
                            "Ngực"
                    )
            );
        }

        // nhom Lưng
        else if (muscleName.equals("Lưng")) {

            exerciseList.add(
                    new Exercise(
                            "Pull Up",
                            "Bodyweight back exercise",
                            R.drawable.ic_launcher_foreground,
                            "Lưng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lat Pulldown",
                            "Machine exercise for lats",
                            R.drawable.ic_launcher_foreground,
                            "Lưng"
                    )
            );
        }

        // nhom Chân
        else if (muscleName.equals("Chân")) {

            exerciseList.add(
                    new Exercise(
                            "Squat",
                            "Compound leg exercise",
                            R.drawable.ic_launcher_foreground,
                            "Chân"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Press",
                            "Machine leg exercise",
                            R.drawable.ic_launcher_foreground,
                            "Chân"
                    )
            );
        }

        // nhom Bụng
        else if (muscleName.equals("Bụng")) {

            exerciseList.add(
                    new Exercise(
                            "Crunch",
                            "Basic abdominal exercise",
                            R.drawable.ic_launcher_foreground,
                            "Bụng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Raise",
                            "Lower abs focused exercise",
                            R.drawable.ic_launcher_foreground,
                            "Bụng"
                    )
            );
        }

        // nhom vai
        else if (muscleName.equals("Vai")) {

            exerciseList.add(
                    new Exercise(
                            "Shoulder Press",
                            "Basic shoulder exercise",
                            R.drawable.ic_launcher_foreground,
                            "Vai"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lateral Raise",
                            "Side delt isolation",
                            R.drawable.ic_launcher_foreground,
                            "Vai"
                    )
            );
        }

        return exerciseList;
    }
}