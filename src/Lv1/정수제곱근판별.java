package Lv1;

public class 정수제곱근판별 {

    public static long solution(long n) {

        long answer = 0;

        double temp = Math.sqrt(n);

        if(temp == (int)temp) {

            answer = (long)((temp+1)*(temp+1));

        } else {
            answer = -1;
        }

        return answer;
    }
}
