package Lv1;

public class Q1차다트게임 {

    public static int solution(String dartResult){


        int answer = 0;
        int index = 0;
        int[] score = new int[3];

        if(dartResult.contains("10"))
            dartResult = dartResult.replace("10", "O");



        char[] result =  dartResult.toCharArray();

        for(char i : result) {

            if(Character.isDigit(i))
                score[index] = Character.getNumericValue(i);
            else {

                switch (i) {
                    case 'S':
                        score[index] = (int)Math.pow(score[index], 1);
                        index++;
                        break;
                    case 'D':
                        score[index] = (int)Math.pow(score[index], 2);
                        index++;
                        break;
                    case 'T':
                        score[index] = (int)Math.pow(score[index], 3);
                        index++;
                        break;
                    case 'O':
                        score[index] = 10;
                        break;
                    case '*':
                        if(index-2 >= 0) {
                            score[index-2] = score[index-2]*2;
                            score[index-1] = score[index-1]*2;
                        }
                        else {
                            score[index-1] = score[index-1]*2;
                        }
                        break;
                    case '#':
                        score[index-1] = score[index-1]*-1;
                        break;
                }
            }
        }

        for(int i : score) {
            answer += i;
        }


        return answer;
    }
}
