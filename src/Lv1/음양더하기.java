package Lv1;

public class 음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;


        for(int i = 0; i < absolutes.length; i++) {

            if(signs[i])
                total += absolutes[i]; // 양수
            else {
                total += absolutes[i]*-1; // 음수
            }

        }

        return total;
    }
}
