package Lv1;

public class 이상한문자만들기 {

    public static String solution(String s) {

        String answer = "";


        String[] sList = s.split("");

        int count = 0;
        for(String temp : sList) {

            count = (" ".equals(temp)) ? 0 : count + 1;

            answer += count%2 == 0 ? temp.toLowerCase() : temp.toUpperCase();

        }


        return answer;
    }
}
