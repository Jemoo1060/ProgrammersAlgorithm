package Lv1;

public class Q2016년 {

    public String solution(int a, int b) {
        String result = "";

        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};



        for(int i = 1; i < a; i++) {
            b += months[i-1];
        }

        int day = b%7;

        switch (day) {
            case 0:
                result = "THU";
                break;
            case 1:
                result = "FRI";
                break;
            case 2:
                result = "SAT";
                break;
            case 3:
                result = "SUN";
                break;
            case 4:
                result = "MON";
                break;
            case 5:
                result = "TUE";
                break;
            case 6:
                result = "WED";
                break;

        }

        return result;
    }
}
