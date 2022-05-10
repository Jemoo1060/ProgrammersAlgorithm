package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

    public static long solution(long n) {

        long answer = 0;

        String[] stringTemp = String.valueOf(n).split("");

        Arrays.sort(stringTemp, Collections.reverseOrder());

        String temp = String.join("", stringTemp);

        answer = Long.parseLong(temp);

        return answer;
    }
}
