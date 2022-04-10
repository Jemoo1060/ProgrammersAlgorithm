package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {

    public static ArrayList<Integer> solution(int[] numbers) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++) {

            for(int j = i; j < numbers.length; j++) {
                if(i != j ) {
                    if(list.indexOf(numbers[i] + numbers[j]) == -1)
                        list.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(list);


        return list;
    }
}
