package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {

    public static String solution(String s){

        String answer = "";


        String[] list = s.split("");

        Arrays.sort(list, Collections.reverseOrder());

        answer = String.join("", list);


        return answer;
    }
}
