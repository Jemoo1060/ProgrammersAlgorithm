package Lv1;

public class 수박수박수박 {

    public static String solution(int n) {

        String result = "";

        for(int i = 1; i <= n; i++) {

            if(i%2==1) {
                result +="수";
            }
            else {
                result +="박";
            }
        }
        return result;
    }
}
