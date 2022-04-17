package Lv1;

public class 가운데글자가져오기 {

    public String solution(String s) {
        String result = "";

        // 문자 수
        int sLength = s.length();

        if(sLength % 2 == 0) { // 문자수 짝수 일때 2개
            int point = sLength/2;
            result = s.substring(point-1,point+1); // 문자 추출
        }
        else { // 홀수일때 1개
            int point = sLength/2;
            result = s.substring(point, point+1); // 문자 추출
        }



        return result;

    }
    
}
