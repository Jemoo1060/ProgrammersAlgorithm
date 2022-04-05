package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 실패율 {

    public static int[] solution(int N, int[] stages){


        int[] answer = new int[N];
        double[] failure = new double[N];
        ArrayList<Double> list = new ArrayList<Double>();

        int count = 0;
        int check = 0;

        for(int i = 0; i < stages.length; i++) {
            if(stages[i] != N + 1 )
                answer[stages[i]-1]++;
            else
                check++;
        }

        for(int i = 0; i < answer.length; i++) {


            for(int j = i; j < answer.length; j++) {

                count += answer[j];
            }
            if(count+check != 0) failure[i] = (double)answer[i]/(count+check);
            else failure[i] = 0;


            count = 0;
        }


        for(double d : failure) {
            list.add(d);
        }


        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i <list.size(); i++) {

            for(int j = 0; j<list.size(); j++) {

                if(list.get(i) == failure[j]) {
                    answer[i] = j + 1 ;
                    failure[j] = -1;
                    break;
                }
            }

        }

        return answer;
    }
}
