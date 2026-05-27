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
                            "Đẩy ngực với thanh xà ngang",
                            R.drawable.bench_2,
                            "Ngực",
                            "- Giữ vai ổn định\n- Không nảy thanh đòn"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Incline Dumbell Press",
                            "Đẩy ngực với tạ đơn",
                            R.drawable.inclinedb_2,
                            "Ngực",
                            "- Giữ vai ổn định\n- Ép 2 cánh tay sát người"
                    )
            );
        }

        // nhom Lưng
        else if (muscleName.equals("Lưng")) {

            exerciseList.add(
                    new Exercise(
                            "Pull Up",
                            "Bài tập sử dụng khối lượng cơ thể",
                            R.drawable.pull_up_1,
                            "Lưng",
                            "- Hạ bả vai\n- Kéo khuỷu tay xuống dưới ra sau"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lat Pulldown",
                            "Bài tập máy cho cơ Lats",
                            R.drawable.lat_pulldown_1,
                            "Lưng",
                            "- Hạ bả vai\n- Kéo chạm ngực\n- Hơi ngả người nhẹ ra sau"
                    )
            );
        }

        // nhom Chân
        else if (muscleName.equals("Chân")) {

            exerciseList.add(
                    new Exercise(
                            "Squat",
                            "Bài tập chân Compound",
                            R.drawable.squat_1,
                            "Chân",
                            "- Giữ lưng trung lập\n- Đầu gối cùng hướng mũi chân" +
                                    "\n- Nén hơi khi xuống thở ra khi lên"
                    ))
            ;

            exerciseList.add(
                    new Exercise(
                            "Leg Press",
                            "Tập chân với máy",
                            R.drawable.leg_press_1,
                            "Chân",
                            "- Giữ lưng trung lập\n- Tránh duỗi khóa khớp chân"
                    )
            );
        }

        // nhom Bụng
        else if (muscleName.equals("Bụng")) {

            exerciseList.add(
                    new Exercise(
                            "Crunch",
                            "Chuyển động gập bụng",
                            R.drawable.crunch_1,
                            "Bụng",
                            "- Không kéo cổ\n- Siết bụng khi lên" +
                                    "\n- Nhả bụng chậm vừa phải"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Raise",
                            "Bài nâng chân tập trung cho cơ bụng dưới",
                            R.drawable.leg_raise_1,
                            "Bụng",
                            "- Giữ lưng trung lập\n- Co xương chậu lên trên"
                    )
            );
        }

        // nhom vai
        else if (muscleName.equals("Vai")) {

            exerciseList.add(
                    new Exercise(
                            "Shoulder Press",
                            "Bài tập đẩy vai cơ bản",
                            R.drawable.shoulder_press_1,
                            "Vai",
                            "- Nằm dựa người lên ghế không ưỡn lưng\n- Không khóa khớp tay khi lên" +
                                    "\n- Khép nhẹ 2 cánh tay vô trong người"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Lateral Raise",
                            "Bài cô lập cho cơ vai ngang",
                            R.drawable.lateral_raise_1,
                            "Vai",
                            "- Tập với tempo chậm\n- Nâng bằng khuỷu tay"
                    )
            );
        }
        // nhom canh tay
        else if (muscleName.equals("Cánh Tay")) {

            exerciseList.add(
                    new Exercise(
                            "Hammer Curl",
                            "Bài tập giúp cải thiện cánh tay và lực nắm",
                            R.drawable.hammer_curl_2,
                            "Cánh Tay",
                            "- Hít vào khi xuống và thở ra khi lên\n- Tempo chậm ở pha nhả tạ"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Reverse Curl",
                            "Tập trung vào cánh tay và cơ tay",
                            R.drawable.reverse_curl_2,
                            "Cánh Tay",
                            "- Siết tay 1s khi lên\n- Tập tempo chậm"
                    )
            );
        }

        // nhom tay truoc
        else if (muscleName.equals("Tay Trước")) {

            exerciseList.add(
                    new Exercise(
                            "Barbell Curl",
                            "Bài tập cho cơ tay trước",
                            R.drawable.barbell_curl_2,
                            "Tay Trước",
                            "- Tập tempo chậm\n- Siết bắp tay 1s ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Concentration Curl",
                            "Giúp cơ tay trước nét hơn",
                            R.drawable.concentration_curl_2,
                            "Tay Trước",
                            "- Cố định khuỷu tay\n- Không dùng lực vai"
                    )
            );
        }

        // nhom tay sau
        else if (muscleName.equals("Tay sau")) {

            exerciseList.add(
                    new Exercise(
                            "Tricep Pushdown",
                            "Bài tập phổ biến cho tay sau",
                            R.drawable.triceps_pushdown_2,
                            "Tay sau",
                            "- Giữ vai ổn định\n- Xuống siết 1s"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Overhead Extension",
                            "Giúp phát triển cơ đầu dài tay sau",
                            R.drawable.overhead_extension_2,
                            "Tay sau",
                            "- Thả tay ra sau hết cỡ\n- Ép 2 khuỷu tay gần nhau"
                    )
            );
        }

        // nhom cang chan
        else if (muscleName.equals("Cẳng Chân")) {

            exerciseList.add(
                    new Exercise(
                            "Standing Calf Raise",
                            "Bài tập cơ bản cho bắp chuối",
                            R.drawable.standing_calf_2,
                            "Cẳng Chân",
                            "- Tập tempo chậm\n- Siết 1s ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Seated Calf Raise",
                            "Tập trung vào phần dưới bắp chuối",
                            R.drawable.seated_calf_2,
                            "Cẳng chân",
                            "- Tập tempo chậm\n- Siết 1s ở đỉnh"
                    )
            );
        }

        return exerciseList;
    }
}