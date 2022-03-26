package Lv1;

public class 행렬의덧셈 {
    
    public int[][] solution(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; i++) {

            for(int j= 0; j < a[i].length; j++) {

                c[i][j] = a[i][j] + b[i][j];
            }

        }

        return c;
    }
}
