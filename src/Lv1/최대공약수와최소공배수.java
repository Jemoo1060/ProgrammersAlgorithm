package Lv1;

public class 최대공약수와최소공배수 {

    public static  int[] solution(int n, int m) {

        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n,m);
        int temp = 0;


        while(true) {
            temp = max%min;


            if(temp == 0) {
                answer[0] = min;
                break;
            }

            max = min;
            min = temp;
        }


        answer[1] = n * m / answer[0];


        return answer;
    }
}
