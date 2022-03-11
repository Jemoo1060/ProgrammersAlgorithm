package Lv1;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, HashSet<String>> rep = new HashMap<String, HashSet<String>>();

        for(String id : id_list) {
            count.put(id, 0);
            rep.put(id, new HashSet<>());
        }


        for(String repor : report) {
            String[] check = repor.split(" ");
            rep.get(check[1]).add(check[0]);
        }


        for(String key : rep.keySet()) {

            HashSet<String> hs = rep.get(key);

            if(hs.size() >= k) {
                for(String id : hs) {
                    Integer cnt = count.get(id) + 1;
                    count.put(id, cnt);
                }

            }
        }


        for(int i = 0; i < id_list.length; i++) {
            answer[i] = count.get(id_list[i]);
        }



        return answer;
    }
}
