package Lv1;

import java.util.ArrayList;

public class 모의고사 {

    public static ArrayList<Integer> solution(int[] answers){



        ArrayList<Integer> answer = new ArrayList<Integer>();

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int oneCnt = 0;
        int twoCnt = 0;
        int threeCnt = 0;
        int max = 0;

        for(int i = 0; i <answers.length; i++) {
            oneCnt = (one[i%one.length] == answers[i]) ? oneCnt + 1 : oneCnt;
            twoCnt = (two[i%two.length] == answers[i]) ? twoCnt + 1 : twoCnt;
            threeCnt = (three[i%three.length] == answers[i]) ? threeCnt + 1 : threeCnt;
        }

        max = Math.max(Math.max(oneCnt, twoCnt), threeCnt);


        if(max == oneCnt)
            answer.add(1);
        if(max == twoCnt)
            answer.add(2);
        if(max == threeCnt)
            answer.add(3);



        return answer;
    }

}
