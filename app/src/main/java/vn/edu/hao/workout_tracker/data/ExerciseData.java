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
        // nhom canh tay
        else if (muscleName.equals("Cánh Tay")) {

            exerciseList.add(
                    new Exercise(
                            "Hammer Curl",
                            "Bai tap giup phat trien canh tay va luc nam",
                            R.drawable.ic_launcher_foreground,
                            "Cánh Tay"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Reverse Curl",
                            "Tap trung vao canh tay va co tay",
                            R.drawable.ic_launcher_foreground,
                            "Cánh Tay"
                    )
            );
        }

        // nhom tay truoc
        else if (muscleName.equals("Tay Trước")) {

            exerciseList.add(
                    new Exercise(
                            "Barbell Curl",
                            "Bai tap co ban cho bap tay truoc",
                            R.drawable.ic_launcher_foreground,
                            "Tay Trước"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Concentration Curl",
                            "Giup co tay truoc net hon",
                            R.drawable.ic_launcher_foreground,
                            "Tay Trước"
                    )
            );
        }

        // nhom tay sau
        else if (muscleName.equals("Tay sau")) {

            exerciseList.add(
                    new Exercise(
                            "Tricep Pushdown",
                            "Bai tap pho bien cho tay sau",
                            R.drawable.ic_launcher_foreground,
                            "Tay sau"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Overhead Extension",
                            "Giup phat trien dau dai tay sau",
                            R.drawable.ic_launcher_foreground,
                            "Tay sau"
                    )
            );
        }

        // nhom cang chan
        else if (muscleName.equals("Cẳng Chân")) {

            exerciseList.add(
                    new Exercise(
                            "Standing Calf Raise",
                            "Bai tap co ban cho bap chuoi",
                            R.drawable.ic_launcher_foreground,
                            "Cẳng Chân"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Seated Calf Raise",
                            "Tap trung vao phan duoi bap chuoi",
                            R.drawable.ic_launcher_foreground,
                            "Cẳng chân"
                    )
            );
        }

        return exerciseList;
    }
}