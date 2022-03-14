package Lv2;

public class 문자열압축 {


    public static int solution(String s) {

        int answer = Integer.MAX_VALUE;
        String temp = "";
        String str = "";
        if(s.length() == 1)return 1;

        for(int i = 1; i <= s.length()/2; i++) {
            str = "";
            temp = s.substring(0,i);
            int count = 1;

            for(int j = i; j <= s.length()-i; j+=i) {
                if(temp.equals(s.substring(j,j+i))) {
                    count++;
                }
                else {
                    if(count > 1) {
                        str += count + "";
                    }
                    str += temp;
                    temp = s.substring(j,j+i);
                    count = 1;
                }
            }

            if(count > 1) {
                str +=  "" +count;
            }
            str += temp;

            int div = s.length()%i;
            answer = Math.min(answer, str.length()+div);

        }

        return answer;
    }

}
