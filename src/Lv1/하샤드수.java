package Lv1;

public class 하샤드수 {

    
    public static boolean solution(int x) {

        boolean answer = true;


        int temp = x;
        int total = 0;


        while(temp != 0) {
            total += temp%10;
            temp = temp/10;
        }

        if(x%total!=0 )
            answer = false;

        return answer;
    }
}
