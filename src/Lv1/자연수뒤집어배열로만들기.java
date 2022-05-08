package Lv1;

import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {

    public static ArrayList<Integer> solution(long n) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        while(n != 0) {
            answer.add((int)(n%10));
            n = n/10;
        }



        return answer;
    }
}
