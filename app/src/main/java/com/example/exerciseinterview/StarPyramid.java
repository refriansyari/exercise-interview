package com.example.exerciseinterview;

public class StarPyramid {
    public static void main(String args[]) {
        //print half pyramid
        printHalfPyramid(6);
    }

    public static void printHalfPyramid(int n) {
        // create a for loop

        //upper half
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //lower half

        for (int k = n-1; k >= 0; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }



}
