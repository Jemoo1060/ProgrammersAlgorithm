package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands){

        int[] answer = new int[commands.length];

        int a,b,c;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < commands.length; i++) {

            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];

            for(int j = a-1; j < b; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);

            answer[i] = list.get(c-1);

            list.clear();
        }
        return answer;
    }
}
