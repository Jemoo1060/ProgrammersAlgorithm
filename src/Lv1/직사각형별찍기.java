package Lv1;

import java.util.Scanner;

public class 직사각형별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i = 0; i < column; i++) {

            for(int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        sc.close();
    }
}
