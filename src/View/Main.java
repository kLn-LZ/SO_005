package View;

import Controller.ThreadMatrix;

public class Main {
    public static void main(String[] args) {

        int[][] mat = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {

                mat[i][j] = (int) (Math.random() * 1000);


            }
        }

        for (int i = 0; i < 3; i ++) {


            Thread threadM  = new ThreadMatrix(mat[i], i);
            threadM.run();


        }




    }

}
