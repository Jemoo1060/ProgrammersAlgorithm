package Lv1;

import java.util.ArrayList;

public class 소수만들기 {

    public static int solution(int[] nums){

        int answer = 0;
        int temp = 0;
        boolean check;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++ ) {

            for(int j = i+1; j < nums.length; j++) {

                for(int k = j+1; k < nums.length; k++) {

                    temp = nums[i] + nums[j] + nums[k];
                    list.add(temp);

                }
            }
        }


        for(int i = 0; i < list.size(); i++) {

            check = true;

            for(int j = 2; j <= Math.sqrt(list.get(i)); j++) {

                if(list.get(i)%j == 0) {
                    check = false;
                    break;
                }
            }

            if(check)
                answer++;

        }
        return answer;
    }
}
