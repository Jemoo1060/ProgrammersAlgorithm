package Lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {

    public static ArrayList<String> solution(String[] record) {


        HashMap<String, String> hm = new HashMap<String, String>();
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        int index = 0;

        for(String id : record) {
            String[] str = id.split(" ");


            switch (str[0]) {
                case "Enter":
                    list.add(new HashMap<>());
                    list.get(index).put("Enter", str[1]);
                    hm.put(str[1], str[2]);
                    index++;
                    break;

                case "Leave":
                    list.add(new HashMap<>());
                    list.get(index).put("Leave", str[1]);
                    index++;
                    break;

                case "Change":
                    hm.put(str[1], str[2]);
                    break;
            }

        }


        for(int i = 0; i < list.size(); i++) {

            if(list.get(i).containsKey("Enter")) {
                String name = hm.get(list.get(i).get("Enter"));
                answer.add(name + "님이 들어왔습니다.");
            }
            else {
                String name = hm.get(list.get(i).get("Leave"));
                answer.add( name + "님이 나갔습니다.");
            }
        }

        return answer;
    }
}
