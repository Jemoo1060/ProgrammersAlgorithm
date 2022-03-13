package Lv1;

public class 신규아이디추천 {

    public static  String solution(String new_id){

        String answer = "";

        // 1단
        new_id = new_id.toLowerCase();

        char[] charList = new_id.toCharArray();

        // 2단
        for(int i = 0;  i < charList.length; i++) {

            if(charList[i] >= 'a' && charList[i] <='z' || charList[i] >= '0' && charList[i] <='9' || charList[i] == '.'|| charList[i] == '_' || charList[i] == '-')
                answer += charList[i];
        }

        // 3단
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        // 4단
        if(answer.length() > 1) {
            answer = (".".equals(answer.substring(0,1))) ? answer.substring(1) : answer;
            answer = (".".equals(answer.substring(answer.length()-1))) ? answer.substring(0,answer.length()-1) : answer;
            answer = ("".equals(answer)) ? "a" : answer;
        }
        else if(answer.length() == 1) {
            answer = (".".equals(answer.substring(0,1))) ? "a" : answer;
        }
        // 5단
        else {
            answer = "a";
        }

        // 6단
        answer = (answer.length() >= 16) ? answer.substring(0,15) : answer;
        answer = (".".equals(answer.substring(answer.length()-1))) ? answer.substring(0,answer.length()-1) : answer;


        // 7단
        while(answer.length() <= 2)
            answer += answer.substring(answer.length()-1);


        return answer;
    }
}
