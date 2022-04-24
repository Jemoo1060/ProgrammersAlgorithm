package Lv1;

public class 문자열내p와y의개수 {

    public static boolean solution(String s) {

        boolean py = true;

        String sLower = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;



        for(int i = 0; i <s.length(); i++){

            if(sLower.charAt(i) == 'y')
                yCount++;

            if(sLower.charAt(i) == 'p')
                pCount++;

            if((yCount == 0 && pCount == 0) || yCount == pCount)
                py = true;
            else
                py = false;

        }


        return py;
    }
}
