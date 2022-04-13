package Lv1;

public class 나머지가1이되는수찾기 {

    public static int solution(int n){

        int x;

        for(x = 1; x < n; x++) {

            if(n%x == 1)
                break;

        }

        return x;
    }
}
