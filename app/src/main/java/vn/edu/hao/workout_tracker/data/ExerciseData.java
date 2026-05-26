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
                        "18 exercises",
                        R.drawable.abs
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Lưng",
                        "15 exercises",
                        R.drawable.back
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Ngực",
                        "23 exercises",
                        R.drawable.chest
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Chân",
                        "20 exercises",
                        R.drawable.leg
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Cẳng Chân",
                        "9 exercises",
                        R.drawable.calf
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Cánh Tay",
                        "4 exercises",
                        R.drawable.forearms
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Tay Trước",
                        "20 exercises",
                        R.drawable.biceps
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Tay sau",
                        "18 exercises",
                        R.drawable.triceps
                )
        );

        muscleList.add(
                new MuscleGroup(
                        "Vai",
                        "23 exercises",
                        R.drawable.shoulder
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
                            "Đẩy ngực với thanh xà",
                            R.drawable.ic_launcher_foreground,
                            "Ngực"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Incline Dumbbell Press",
                            "Đẩy ngực với tạ Dumbells tập trung cho ngực trên",
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
                            "Bài tập sử dụng khối lượng cơ thể",
                            R.drawable.ic_launcher_foreground,
                            "Lưng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lat Pulldown",
                            "Bài tập máy cho cơ Lats",
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
                            "Bài tập chân Compound",
                            R.drawable.ic_launcher_foreground,
                            "Chân"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Press",
                            "Tập chân với máy",
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
                            "Chuyển động gập bụng trên cơ bản",
                            R.drawable.ic_launcher_foreground,
                            "Bụng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Raise",
                            "Bài nâng chân tập trung cho cơ bụng dưới",
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
                            "Bài tập đẩy vai cơ bản",
                            R.drawable.ic_launcher_foreground,
                            "Vai"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lateral Raise",
                            "Bài cô lập cho cơ vai ngang",
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
                            "Bài tập giúp cải thiện cánh tay và lực nắm",
                            R.drawable.ic_launcher_foreground,
                            "Cánh Tay"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Reverse Curl",
                            "Tập trung vào cánh tay và cơ tay",
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
                            "Bài tập cho cơ tay trước",
                            R.drawable.ic_launcher_foreground,
                            "Tay Trước"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Concentration Curl",
                            "Giúp cơ tay trước nét hơn",
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
                            "Bài tập phổ biến cho tay sau",
                            R.drawable.ic_launcher_foreground,
                            "Tay sau"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Overhead Extension",
                            "Giúp phát triển cơ đầu dài tay sau",
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
                            "Bài tập cơ bản cho bắp chuối",
                            R.drawable.ic_launcher_foreground,
                            "Cẳng Chân"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Seated Calf Raise",
                            "Tập trung vào phần dưới bắp chuối",
                            R.drawable.ic_launcher_foreground,
                            "Cẳng chân"
                    )
            );
        }

        return exerciseList;
    }
}