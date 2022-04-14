package Lv1;

public class 부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        long result = 0;

        long money2 = money;
        long price2 = price;

        for(int i = 1; i <= count; i++) {
            money2 -= price2 * i;
        }

        if(money2 >= 0)
            result = 0;
        else
            result = money2 *-1;

        return  result;
    }
}
