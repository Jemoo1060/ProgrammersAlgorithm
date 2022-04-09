package Lv1;

import java.util.Arrays;

public class 예산 {
    public static int solution(int[] d, int budget) {

        int answer = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {

            budget -= d[i];

            if(budget >= 0)
                answer++;

        }


        return answer;
    }
}
