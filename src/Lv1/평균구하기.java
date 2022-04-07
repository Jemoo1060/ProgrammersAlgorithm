package Lv1;

public class 평균구하기 {

    public double solution(int[] arr) {
        double avg = 0.0;
        int total = 0;

        for(int i =0; i < arr.length; i++ ) {
            total += arr[i];
        }

        avg = (double)total/arr.length;

        return avg;
    }
    
}
