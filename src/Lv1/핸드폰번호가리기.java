package Lv1;

public class 핸드폰번호가리기 {
    public String solution(String phoneNum) {

        String result = "";

        int lenCheck = phoneNum.length()-4;

        for(int i = 0; i < lenCheck; i++) {
            result += "*";
        }

        result += phoneNum.substring(lenCheck);


        return result;
    }
}
