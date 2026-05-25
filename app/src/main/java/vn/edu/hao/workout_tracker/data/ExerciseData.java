package vn.edu.hao.workout_tracker.data;

import java.util.ArrayList;

import vn.edu.hao.workout_tracker.R;
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
                        "Cẳng chân",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );
        muscleList.add(
                new MuscleGroup(
                        "Cánh tay",
                        "20 exercises",
                        R.drawable.ic_launcher_foreground
                )
        );
        muscleList.add(
                new MuscleGroup(
                        "Tay trước",
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
}