package Lv1;

public class 짝수와홀수 {

    public String solution(int num) {

        String check = "";

        if(num % 2 == 0)
            check = "Even";
        else
            check = "Odd";

        return check;
    }
}
