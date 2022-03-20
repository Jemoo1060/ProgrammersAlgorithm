package Lv1;

public class 없는숫자더하기 {

    public int solution(int[] numbers) {
        int total = 0;

        boolean[] check = new boolean[10];

        for(int i = 0; i < numbers.length; i++) {
            check[numbers[i]] = true;
        }

        for(int j = 0; j < check.length; j++) {
            if(!check[j]) {
                total += j;
            }
        }

        return total;
    }
    
}
