package com.company;

public class third {

int a = 0;

third(){

}

third(int ab ){
    System.out.println(a);
    this.a = ab;
}



    public static void main(String[] args) {
        third t = new third();

        third t1 = new third(23);
        System.out.println(t1.a);


        System.out.println(t.a);
        System.out.println("harsh");
        t.a = 12;


//        third t1 = new third();
//        t1.a = 45;


        System.out.println(t1.a);

    }

}
