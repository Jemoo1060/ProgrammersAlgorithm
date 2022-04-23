package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {

    public static  String[] solution(String[] strings, int n){

        String[] answer = new String[strings.length];

        ArrayList<String> tempList = new ArrayList<String>();

        for(int i = 0; i < strings.length; i++) {
            tempList.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(tempList);

        for(int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i).substring(1);
        }



        return answer;
    }
}
