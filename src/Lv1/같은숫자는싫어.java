package Lv1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

    public static ArrayList<Integer> solution(int []arr) {

        int temp = -1;

        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int i = 0; i < arr.length; i++) {

            if(temp != arr[i]) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        return list;
    }
}
