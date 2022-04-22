package Lv1;

public class 두정수사이의합 {

    public long solution(int a, int b) {
        long total = 0;
        int temp = Math.max(a, b);
        if(temp != b) {
            a = b;
            b = temp;

        }

        for(int i = a; i <= b; i++) {
            total += i;
        }


        return total;
    }
}
