package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println(234+23);
//        System.out.println('a');

//        int a = 12;
//        String s = "adres";
//        System.out.println(a);
//        System.out.println(s);


//        char c = 'a';
//        System.out.println(c);



//        String s = "adrsh";
//        s+= "ad";
//        System.out.println(s);

//        StringBuilder s1= new StringBuilder();
//        s1.append("adrsh");
//        System.out.println(s1);
//        s1.append("dkhatri");
//        System.out.println(s1);


        //        arr  = 1,2,3,4,5;



//        System.out.println(arr);
//
//        for (int i = 0 ;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        System.out.println(Arrays.toString(arr));


//        int [] arr2 = {1,2,3,4,5};
//
        char [] arrayofchar = new char[3];

        String [] arrs = new String[4];


//

        int arr[] = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }

//        System.out.println(arr[6]);

//        System.out.println(Arrays.toString(arr));

        int a = 3;
        int array [] = new int[arr.length+a];

//        System.out.println(array.length);

        for(int i =0;i<array.length;i++){
            if(i<arr.length) {
                array[i] = arr[i];
            }else{
                array[i] = i+1;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("harsh");
        boolean b= true;
        System.out.println(b);
        b= false;
        System.out.println(b);
    }



}
