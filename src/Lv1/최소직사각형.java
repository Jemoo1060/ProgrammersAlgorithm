package Lv1;

public class 최소직사각형 {

    public static int solution(int[][] sizes){

        int answer = 0;
        int tempmax1 = 0;
        int tempmax2 = 0;
        int max1 = 0;
        int max2 = 0;


        for(int i = 0; i < sizes.length; i++) {

            for(int j = 0; j <sizes[i].length; j++) {

                tempmax1 = Math.max(sizes[i][0],sizes[i][1]);
                tempmax2 = Math.min(sizes[i][0],sizes[i][1]);

                if(max1 < tempmax1)
                    max1 = tempmax1;
                if(max2 < tempmax2)
                    max2 =  tempmax2;
            }
        }

        answer = max1 * max2;

        return answer;
    }
}
