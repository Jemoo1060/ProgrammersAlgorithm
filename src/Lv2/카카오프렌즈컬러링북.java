package Lv2;

public class 카카오프렌즈컬러링북 {


    static int temp = 0;
    static int[] x = {-1,1,0,0};
    static int[] y = {0,0,1,-1};


    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;


        int[] answer = new int[2];

        boolean[][] check = new boolean[m][n];

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(picture[i][j] != 0 && !check[i][j]) {
                    numberOfArea++;
                    dfs(i,j, picture, check);
                }

                if(maxSizeOfOneArea < temp) maxSizeOfOneArea = temp;
                temp = 0;

            }


        }


        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;

    }

    public static void dfs(int i, int j, int[][] picture, boolean[][] check) {

        if(check[i][j]) return;


        check[i][j] = true;

        temp++;

        for(int k = 0; k < 4; k++) {

            int ix = i + x[k];
            int jy = j + y[k];


            if(ix <0 || ix >= picture.length || jy < 0 || jy >= picture[0].length) continue;

            if(picture[i][j] == picture[ix][jy] && !check[ix][jy]) {
                dfs(ix,jy,picture,check);
            }
        }


    }
}
