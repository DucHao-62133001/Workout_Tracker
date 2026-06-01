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
                        "Ngực",
                        "10 exercises",
                        R.drawable.chest
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
                        "Bụng",
                        "23 exercises",
                        R.drawable.abs
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
                            R.drawable.bench_press_2,
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

            exerciseList.add(
                    new Exercise(
                            "Incline Press",
                            "Đẩy ngực chéo với thanh xà",
                            R.drawable.incline_2,
                            "Ngực",
                            "- Giữ vai ổn định\n- Ép 2 cánh tay sát người" +
                                    "\n- Biên độ xuống chạm ngực"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Dumbbell Flys",
                            "Ép ngực với tạ đơn",
                            R.drawable.db_fly_2,
                            "Ngực",
                            "- Nhả tới khi thấy cơ ngực banh ra\n- Ép 2 cánh tay sát người" +
                                    "\n- Giữ 1s siết ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Pec Deck Flies",
                            "Ép ngực với máy",
                            R.drawable.pec_dec_2,
                            "Ngực",
                            "- Dùng lực ở khuỷu tay\n- Ép khuỷu tay sát người" +
                                    "\n- Giữ 1s siết ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Dumbbell Flys",
                            "Ép ngực với tạ đơn",
                            R.drawable.db_fly_2,
                            "Ngực",
                            "- Nhả tới khi thấy cơ ngực banh ra\n- Ép 2 cánh tay sát người" +
                                    "\n- Giữ 1s siết ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Push up",
                            "Bài compound giúp phát triển ngực, vai và tay sau",
                            R.drawable.push_up_1,
                            "Ngực",
                            "- 2 tay rộng bằng vai\n- Ép 2 khuỷu tay vào thân" +
                                    "\n- Xuống chậm"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Decline Bench Press",
                            "Đẩy ngực dốc xuống tập trung lower chest",
                            R.drawable.decline_2,
                            "Ngực",
                            "- Giữ vai cố định\n- Ép 2 khuỷu tay gần thân" +
                                    "\n- Thanh đòn chạm ngực"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "High To Low Cable Fly",
                            "Cable fly từ cao xuống thấp giúp nét lower chest rõ hơn",
                            R.drawable.cable_fly_2,
                            "Ngực",
                            "- Nghiên người nhẹ về trước\n- 1 chân trụ trước" +
                                    "\n- Không banh 2 tay quá rộng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Chest Dips",
                            "Chest dips hỗ trợ ngực dưới và tay sau",
                            R.drawable.dips_2,
                            "Ngực",
                            "- Nghiên người nhẹ về trước\n- Không nhún vai" +
                                    "\n- Không banh 2 tay quá rộng"
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

            exerciseList.add(
                    new Exercise(
                            "Straight Arm Pulldown",
                            "Bài cô lập cho cơ lats dưới kéo dài strech",
                            R.drawable.straight_arm_pulldown_2,
                            "Lưng",
                            "- Hạ bả vai\n- Giữ cánh tay hơi cong nhẹ\n- Kéo bằng khuỷu tay"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Seated Cable Row",
                            "Bài kéo cho lưng giữa và lưng trên",
                            R.drawable.seated_cable_row_2,
                            "Lưng",
                            "- Hạ bả vai\n- Kéo bằng khuỷu tay\n- Hơi ngả người nhẹ ra sau\n" +
                                    "- Kéo cánh tay về rốn"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "T-Bar Row",
                            "Bài kéo dãn cơ lưng trên mạnh và 1 phần cơ lưng giữa",
                            R.drawable.t_bar_2,
                            "Lưng",
                            "- Mở rộng tay kéo khoảng 45 độ\n- Cảm nhận lưng trên tách ra\n" +
                                    "- Chủ động kéo 2 xương bả vai ép vào nhau"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Chest Supported Row",
                            "Bài tập row bằng máy đa dụng cả lưng trên và lưng giữa",
                            R.drawable.chest_spot_row_1,
                            "Lưng",
                            "- Hạ bả vai không được gồng\n- Tì ngực vào tấm pad\n" +
                                    "- Siết lưng 1 giây ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Face Pull",
                            "Bài tập dây cô lập cho vai sau và lưng trên",
                            R.drawable.face_pull_2,
                            "Lưng",
                            "- Mở rộng tay kéo 45 độ\n- Kéo dây về giữa mặt\n" +
                                    "- Khi kéo về chủ động tách dây ra 2 bên"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Reverse Pec Deck",
                            "Tập cơ vai sau với máy",
                            R.drawable.reverse_pec_dec_2,
                            "Lưng",
                            "- Không gồng vai\n- Tempo chậm\n" +
                                    "- Khối lượng tạ nhẹ Reps cao"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Barbell Row",
                            "Bài compound phát triển toàn bộ lưng",
                            R.drawable.barbell_row_2,
                            "Lưng",
                            "- Gập người khoảng 45 độ\n- Kéo thanh đòn về bụng\n" +
                                    "- Giữ lưng thẳng suốt bài"
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

            exerciseList.add(
                    new Exercise(
                            "Leg Extension",
                            "Bài cô lập cơ đùi trước",
                            R.drawable.leg_press_1,
                            "Chân",
                            "- Giữ hông cố định\n- Duỗi chân có kiểm soát\n" +
                                    "- Siết cơ đùi trước ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Curl",
                            "Bài cô lập cơ đùi sau",
                            R.drawable.leg_curl_2,
                            "Chân",
                            "- Giữ hông cố định\n- Kéo gót chân về mông\n" +
                                    "- Kiểm soát pha hạ xuống"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Romanian Deadlift",
                            "Bài tập đùi sau và mông",
                            R.drawable.romanian_dl_2,
                            "Chân",
                            "- Đẩy hông ra sau\n- Giữ lưng thẳng\n" +
                                    "- Cảm nhận căng đùi sau"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Bulgarian Split Squat",
                            "Bài tập từng chân giúp tăng cân bằng cơ thể",
                            R.drawable.bulgarian_split_2,
                            "Chân",
                            "- Chân sau đặt lên ghế\n- Giữ thân người ổn định\n" +
                                    "- Đẩy bằng chân trước"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Hack Squat",
                            "Biến thể squat bằng máy",
                            R.drawable.hack_squat_1,
                            "Chân",
                            "- Giữ lưng áp sát ghế\n- Xuống sâu trong khả năng\n" +
                                    "- Đẩy qua giữa bàn chân"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Goblet Squat",
                            "Biến thể squat với tạ đơn",
                            R.drawable.goblet_squat_2,
                            "Chân",
                            "- Giữ tạ trước ngực\n- Ngực mở\n" +
                                    "- Xuống sâu có kiểm soát"
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

            exerciseList.add(
                    new Exercise(
                            "Plank",
                            "Bài tập giữ tĩnh giúp tăng sức mạnh core",
                            R.drawable.plank_1,
                            "Bụng",
                            "- Giữ cơ thể thành một đường thẳng\n- Siết bụng liên tục\n" +
                                    "- Không võng lưng"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Side Plank",
                            "Bài tập cơ liên sườn và core",
                            R.drawable.side_plank_1,
                            "Bụng",
                            "- Giữ hông không bị hạ xuống\n- Siết bụng liên tục\n" +
                                    "- Giữ cổ trung lập"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Reverse Crunch",
                            "Biến thể crunch tập trung bụng dưới",
                            R.drawable.reverse_crunch_1,
                            "Bụng",
                            "- Co xương chậu lên trên\n- Không vung chân lấy đà\n" +
                                    "- Hạ chân có kiểm soát"
                    )
            );


            exerciseList.add(
                    new Exercise(
                            "Hanging Leg Raise",
                            "Bài tập bụng dưới trên xà đơn",
                            R.drawable.hanging_leg_raise_2,
                            "Bụng",
                            "- Hạn chế đung đưa cơ thể\n- Co xương chậu lên trên\n" +
                                    "- Hạ chân chậm"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Dead Bug",
                            "Bài tập ổn định core và kiểm soát thân người",
                            R.drawable.dead_bug_1,
                            "Bụng",
                            "- Ép lưng xuống sàn\n- Duỗi tay chân đối diện\n" +
                                    "- Giữ bụng căng liên tục"
                    )
            );


            exerciseList.add(
                    new Exercise(
                            "Cable Crunch",
                            "Bài tập bụng với máy cáp",
                            R.drawable.cable_crunch_2,
                            "Bụng",
                            "- Gập bụng thay vì kéo tay\n- Siết bụng mạnh ở cuối biên độ\n" +
                                    "- Giữ hông cố định"
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

            exerciseList.add(
                    new Exercise(
                            "Donkey Calf Raise",
                            "Biến thể calf raise với thân người gập trước",
                            R.drawable.donkey_calf_raise_1,
                            "Cẳng Chân",
                            "- Kéo giãn bắp chuối tối đa\n- Siết mạnh ở đỉnh\n" +
                                    "- Không bật nảy"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Single Leg Calf Raise",
                            "Bài tập từng chân giúp cân bằng sức mạnh",
                            R.drawable.single_leg_calf_raise_1,
                            "Cẳng Chân",
                            "- Xuống hết biên độ\n- Giữ thăng bằng tốt\n" +
                                    "- Siết 1 giây ở đỉnh"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Leg Press Calf Raise",
                            "Tập bắp chuối trên máy Leg Press",
                            R.drawable.leg_press_calf_1,
                            "Cẳng Chân",
                            "- Chỉ chuyển động cổ chân\n- Không khóa gối\n" +
                                    "- Tempo chậm"
                    )
            );

            exerciseList.add(
                    new Exercise(
                            "Smith Machine Calf Raise",
                            "Bài tập bắp chuối với máy Smith",
                            R.drawable.smith_machine_calf_2,
                            "Cẳng Chân",
                            "- Đứng trên bục cao\n- Kéo giãn tối đa\n" +
                                    "- Siết mạnh ở đỉnh"
                    )
            );

        }

        return exerciseList;
    }
}