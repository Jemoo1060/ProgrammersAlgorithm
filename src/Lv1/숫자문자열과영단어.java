package Lv1;

public class 숫자문자열과영단어 {

    public static int solution(String s){

        int answer = 0;

        String[] stringNum = {"zero", "one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i < stringNum.length; i++)
            s = s.replace(stringNum[i], String.valueOf(i));


        answer = Integer.parseInt(s);

        return answer;
    }
    
}
