package Lv1;

public class 키패드누르기 {

    public static String solution(int[] numbers, String hand){

        String answer = "";
        int[][] keypad = {{0,1},{3,0},{3,1},{3,2},{2,0},{2,1},{2,2},{1,0},{1,1},{1,2}};
        int[][] left  = {{0,0}};
        int[][] right = {{0,2}};
        int distanceL = 0;
        int distanceR = 0;


        for(int i : numbers) {


            if(i == 1 || i == 4 || i == 7) {
                answer += "L";
                left[0][0] = keypad[i][0];
                left[0][1] = keypad[i][1];
            }

            else if(i == 3 || i == 6 || i == 9)  {
                answer += "R";
                right[0][0] = keypad[i][0];
                right[0][1] = keypad[i][1];
            }
            else {

                distanceL = Math.abs(keypad[i][0] - left[0][0]) + Math.abs(keypad[i][1] - left[0][1]);
                distanceR = Math.abs(keypad[i][0] - right[0][0]) + Math.abs(keypad[i][1] - right[0][1]);

                if(distanceL < distanceR) {
                    answer += "L";
                    left[0][0] = keypad[i][0];
                    left[0][1] = keypad[i][1];
                }
                else if(distanceL > distanceR) {
                    answer += "R";
                    right[0][0] = keypad[i][0];
                    right[0][1] = keypad[i][1];
                }
                else {

                    if("left".equals(hand)) {
                        answer += "L";
                        left[0][0] = keypad[i][0];
                        left[0][1] = keypad[i][1];
                    }
                    else {
                        answer += "R";
                        right[0][0] = keypad[i][0];
                        right[0][1] = keypad[i][1];
                    }
                }
            }
        }

        return answer;
    }
}
