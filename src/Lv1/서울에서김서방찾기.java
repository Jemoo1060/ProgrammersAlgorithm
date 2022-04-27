package Lv1;

public class 서울에서김서방찾기 {

    public static String solution(String[] seoul) {

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].compareTo("Kim") == 0)
                return "김서방은 " + i + "에 있다";
        }
        return "김서방 없음";
    }
}
