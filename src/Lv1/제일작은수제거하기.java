package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 제일작은수제거하기 {

    public static ArrayList<Integer> solution(int[] arr)  {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        int min = Collections.min(answer);

        int index = answer.indexOf(min);

        answer.remove(index);


        return answer;
    }

}
