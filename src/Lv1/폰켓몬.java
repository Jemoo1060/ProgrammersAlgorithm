package Lv1;

import java.util.HashSet;

public class 폰켓몬 {

    public static int solution(int[] nums){

        int answer = 0;

        int check = nums.length/2;

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i : nums) {
            hs.add(i);
        }


        answer = (check <= hs.size()) ? check : hs.size();


        return answer;
    }
}
