package Lv1;

import java.util.ArrayList;

public class 로또의최고순위와최저순위 {

    public static int[] solution(int[] lottos, int[] win_nums){

        int[] answer = new int[2];

        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int zeroCnt = 0;

        for(int i = 0; i < lottos.length; i++) {
            list.add(lottos[i]);
            if(lottos[i] == 0)
                zeroCnt++;
        }

        for(int i = 0; i < win_nums.length; i++) {
            if(list.indexOf(win_nums[i]) != -1) {
                count++;
            }
        }


        answer[0] = ((zeroCnt + count) <=1) ? 6: 7-(zeroCnt + count);
        answer[1] = (count <= 1) ? 6 : 7-(count);

        return answer;
    }

}
