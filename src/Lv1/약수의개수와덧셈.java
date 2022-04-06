package Lv1;

public class 약수의개수와덧셈 {

    public static int solution(int n){

        int answer = 0;


        for(int i = 1; i <= n; i++) {

            if(n%i == 0 )
                answer += i;
        }


        return answer;
    }
}
