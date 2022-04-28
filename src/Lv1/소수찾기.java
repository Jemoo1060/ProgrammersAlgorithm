package Lv1;

public class 소수찾기 {

    public static int solution(int n){

        int answer = 0;
        boolean pf = true;

        for(int i=2; i<=n; i++) {
            pf = true;
            for(int j=2; j <= Math.sqrt(i); j++) {
                if(i%j==0) {
                    pf = false;
                    break;
                }
            }

            if(pf==true) answer++;
        }

        return answer;
    }
}
