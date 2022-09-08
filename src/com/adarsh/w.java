package com.adarsh;

  public class w {


    public static void main(String[] args) {
        int row=3;
        int arr[][] = new int [row][];
        for(int i=0;i<arr.length;i++) {
            arr[i] = new int[i + 1];
        }

        int result =1;
        for(int i=0;i<row;++i) {
            for (int j = 0; j < i + 1; ++j) {
                arr[i][j] = j + 1;
            }
        }

        for(int i=0;i<row;++i) {
            for (int j = 0; j < i + 1; ++j) {
                result *= arr[i][j];
            }
        }

        System.out.println(result);


    }

}
