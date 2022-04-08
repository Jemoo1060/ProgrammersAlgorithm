package Lv1;

public class Q3진법뒤집기 {

    public static int solution(int n){

        int answer = 0;

        String data = "";
        String[] dataList = {};

        while(n != 0) {

            data += String.valueOf((n%3));
            n = n/3;
        }

        dataList = data.split("");


        for(int i =0; i < dataList.length; i++){

            answer += Integer.parseInt(dataList[i])*Math.pow(3,dataList.length-(i+1));
        }




        return answer;
    }
}
